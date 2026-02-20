package com.smartlearn.prototype.dtos;

import java.time.LocalDateTime;
import lombok.Data;
import lombok.Builder;
@Data
@Builder
public class JobResponse {
    private String id;
    private String descriptions;
    private String company;
    private String jobType;
    private String location;
    private String salary;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
