
package com.smartlearn.prototype.dtos;

import com.smartlearn.prototype.model.UserRole;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Email;
import jakarta.persistence.EnumType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterRequest{
    @NotBlank(message="email is required")
    @Email(message="invalid email request")
    private String email;
    @NotBlank(message="role is required")
    @Enumerated(EnumType.STRING)
    private UserRole role;
    @NotBlank(message="password is required")
    @Size(min=6,message="password must be altleast 6 characters long")
    private String password;
    private String firstName;
    private String LastName;

}
