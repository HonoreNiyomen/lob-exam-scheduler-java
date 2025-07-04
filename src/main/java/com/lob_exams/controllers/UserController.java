package com.lob_exams.controllers;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lob_exams.database.entities.User;
import com.lob_exams.database.services.UserServices;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserServices service;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public UserController(UserServices service) {
        this.service = service;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        return service.getUserById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody Map<String, Object> payload) {
        try {
            // Validate mandatory fields
            String[] requiredFields = {
                "username", "firstname", "lastname", "email", "role", "password", "confirm_password"
            };

            for (String field : requiredFields) {
                if (!payload.containsKey(field) || payload.get(field) == null || payload.get(field).toString().isBlank()) {
                    return ResponseEntity.badRequest().body("Missing or empty required field: " + field);
                }
            }

            try {
                service.getUserByEmail(payload.get("email").toString());
                return ResponseEntity.status(HttpStatus.CONFLICT).body("Email is already in use");
            } catch (RuntimeException e) {

                String password = payload.get("password").toString();
                String confirmPassword = payload.get("confirm_password").toString();

                if (!password.equals(confirmPassword)) {
                    return ResponseEntity.badRequest().body("Passwords don't match");
                }

                // Build user object
                User newUser = new User();
                newUser.setUsername(payload.get("username").toString());
                newUser.setFirstname(payload.get("firstname").toString());
                newUser.setLastname(payload.get("lastname").toString());
                newUser.setEmail(payload.get("email").toString());
                newUser.setRole(payload.get("role").toString());

                // Hash and set password
                String hashed = passwordEncoder.encode(password);
                newUser.setHashedPassword(hashed);

                // Save user
                User createdUser = service.createUser(newUser);
                return ResponseEntity.ok(createdUser);
            }
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("User creation failed");
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateUser(@PathVariable Long id, @RequestBody Map<String, Object> updates) {
        try {
            Optional<User> optionalUser = service.getUserById(id);
            if (optionalUser.isEmpty()) {
                return ResponseEntity.notFound().build();
            }

            User existingUser = optionalUser.get();

            // Update fields dynamically
            if (updates.containsKey("username")) {
                existingUser.setUsername((String) updates.get("username"));
            }
            if (updates.containsKey("firstname")) {
                existingUser.setFirstname((String) updates.get("firstname"));
            }
            if (updates.containsKey("lastname")) {
                existingUser.setLastname((String) updates.get("lastname"));
            }
            if (updates.containsKey("email")) {
                existingUser.setEmail((String) updates.get("email"));
            }
            if (updates.containsKey("role")) {
                existingUser.setRole((String) updates.get("role"));
            }

            if (updates.containsKey("password")) {
                if (updates.containsKey("confirm_password")) {
                    String rawPassword = (String) updates.get("password");
                    String rawConfirmPassword = (String) updates.get("confirm_password");
                    if (rawPassword.equals(rawConfirmPassword)) {
                        String hashed = passwordEncoder.encode(rawPassword);
                        existingUser.setHashedPassword(hashed);
                    } else {
                        return ResponseEntity.badRequest().body("Passwords don't match");
                    }
                } else {
                    return ResponseEntity.badRequest().body("key \'confirm_password\' missing");
                }
            }

            User updatedUser = service.updateUser(id, existingUser);
            return ResponseEntity.ok(updatedUser);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        service.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}
