package com.smartlearn.prototype.Interfaces;

import com.smartlearn.prototype.dtos.RegisterRequest;
import com.smartlearn.prototype.dtos.UpdateRequest;
import com.smartlearn.prototype.dtos.UserResponse;

public interface IUserService {

    UserResponse getUserProfile(String userId);

    //@Transactional
    String DeleteUser(String userId);

    UserResponse updateUser(String userId, UpdateRequest request);

    UserResponse register(RegisterRequest request);

}