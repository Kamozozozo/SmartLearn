package com.smartlearn.prototype.dtos;
import lombok.Builder;
//import jakarta.validation.constraints.Email;
//import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Builder
public class UpdateRequest {
    private String email;
    private String firstName;
    private String LastName;
}
