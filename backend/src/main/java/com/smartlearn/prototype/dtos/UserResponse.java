package com.smartlearn.prototype.dtos;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class UserResponse {
    private String id;
    private String email;
    private String firstName;
    private String LastName;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
