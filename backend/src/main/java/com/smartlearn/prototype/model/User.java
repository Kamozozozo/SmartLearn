package com.smartlearn.prototype.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name="users")
@Data
public class User{
    @Id
    @GeneratedValue(strategy=GenerationType.UUID)
    private String id;

    @Column(unique=true,nullable=false)
    private String email;
    @Column(nullable=false)
    private String password;
    private String firstName;
    private String LastName;
    @Enumerated(EnumType.STRING)
    private UserRole role= UserRole.USER;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public User() {
    }


}