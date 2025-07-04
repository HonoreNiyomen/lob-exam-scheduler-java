package com.lob_exams.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.HashMap;
import com.lob_exams.config.JwtUtil;
import com.lob_exams.database.entities.User;
import com.lob_exams.database.services.UserServices;
import com.lob_exams.dto.SigninRequest;
import com.lob_exams.exceptions.UserNotFoundException;
import com.lob_exams.dto.UserResponse;

@RestController
@RequestMapping("/api/log_in")
public class UserSigninController {

    private final UserServices service;
    private final JwtUtil jwtUtil;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public UserSigninController(UserServices service, JwtUtil jwtUtil) {
        this.service = service;
        this.jwtUtil = jwtUtil;
    }

    @PostMapping
    public ResponseEntity<?> authenticateUser(@RequestBody SigninRequest request) {
        try {
            User retrievedUser = service.getUserByEmail(request.getEmail());

            if (!passwordEncoder.matches(request.getPassword(), retrievedUser.getHashedPassword())) {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
            }

            String token = jwtUtil.generateToken(retrievedUser);
            Map<String, Object> response = new HashMap<>();
            response.put("token", token);
            response.put("user", new UserResponse(retrievedUser));

            return ResponseEntity.ok(response);
        } catch (UserNotFoundException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }
    }
}