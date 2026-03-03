package com.smartlearn.prototype.dtos;

import java.time.LocalDateTime;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class JobRequest {
    @NotBlank(message="descriptions is required")
    private String descriptions;
    @NotBlank(message="company is required")
    private String company;
    private String jobType;
    private String location;
    private String salary;
}
