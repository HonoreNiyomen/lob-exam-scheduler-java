package com.lob_exams.dto;

import com.lob_exams.database.entities.User;

public class UserResponse {
    private final Long id;
    private final String username;
    private final String firstname;
    private final String lastname;
    private final String email;
    private final String role;

    public UserResponse(User user) {
        this.id = user.getId();
        this.username = user.getUsername();
        this.firstname = user.getFirstname();
        this.lastname = user.getLastname();
        this.email = user.getEmail();
        this.role = user.getRole();
    }

    public Long getId() {
        return id;
    }
    public String getUsername() {
        return username;
    }
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public String getEmail() {
        return email;
    }
    public String getRole() {
        return role;
    }
}
