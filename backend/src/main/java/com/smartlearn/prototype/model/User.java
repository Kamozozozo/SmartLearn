package com.smartlearn.prototype.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.smartlearn.prototype.model.UserVideo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
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
    private UserRole role= UserRole.USERS;
    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;
    @OneToMany(orphanRemoval = true)
    @JsonManagedReference
    private List<UserVideo> videos = new ArrayList<>();


}