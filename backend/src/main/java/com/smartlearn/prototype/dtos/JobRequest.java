package com.smartlearn.prototype.dtos;

import java.time.LocalDateTime;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class JobRequest {
    @NotBlank(message="descriptions is required")
    private String descriptions;
    @NotBlank(message="company is required")
    private String company;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    
}
