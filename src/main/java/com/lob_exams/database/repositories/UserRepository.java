package com.lob_exams.database.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lob_exams.database.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    Optional<User> findByHashedPassword(String hashedPassword);
}
