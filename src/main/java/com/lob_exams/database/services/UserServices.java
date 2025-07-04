package com.lob_exams.database.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.lob_exams.database.entities.User;
import com.lob_exams.database.repositories.UserRepository;
import com.lob_exams.exceptions.UserNotFoundException;

@Service
public class UserServices {

    private final UserRepository repository;

    public UserServices(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> getAllUsers() {
        return repository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return repository.findById(id);
    }

    public User createUser(User user) {
        return repository.save(user);
    }

    public User getUserByEmail(String email) {
        return repository.findByEmail(email).orElseThrow(
                () -> new UserNotFoundException("email", email));
    }

    public User updateUser(Long id, User userDetails) {
        return repository.findById(id).map(user -> {
            user.setUsername(userDetails.getUsername());
            user.setFirstname(userDetails.getFirstname());
            user.setLastname(userDetails.getLastname());
            user.setEmail(userDetails.getEmail());
            user.setHashedPassword(userDetails.getHashedPassword());
            user.setRole(userDetails.getRole());
            user.setConfirmedAt(userDetails.getConfirmedAt());
            return repository.save(user);
        }).orElseThrow(() -> new RuntimeException("User not found with id " + id));
    }

    public void deleteUser(Long id) {
        repository.deleteById(id);
    }
}
