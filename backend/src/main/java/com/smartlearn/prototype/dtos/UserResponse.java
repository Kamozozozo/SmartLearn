package com.smartlearn.prototype.dtos;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
    private String id;
    private String email;
    private String firstName;
    private String LastName;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
