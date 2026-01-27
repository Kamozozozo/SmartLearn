package com.smartlearn.prototype.dtos;
//import jakarta.validation.constraints.Email;
//import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UpdateRequest {
    private String email;
    private String firstName;
    private String LastName;
}
