package com.lob_exams.database.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lob_exams.database.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    // Custom queries can be added here if needed
}
