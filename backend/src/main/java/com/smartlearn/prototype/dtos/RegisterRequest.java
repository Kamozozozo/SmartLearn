
package com.smartlearn.prototype.dtos;

import com.smartlearn.prototype.model.UserRole;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Email;
import jakarta.persistence.EnumType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import   jakarta.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest{
    @NotBlank(message="email is required")
    @Email(message="invalid email request")
    private String email;
    @NotNull(message="role is required")
    private UserRole role;
    @NotBlank(message="password is required")
    @Size(min=6,message="password must be altleast 6 characters long")
    private String password;
    private String firstName;
    private String LastName;

}
