package com.smartlearn.prototype.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartlearn.prototype.dtos.UserResponse;
import com.smartlearn.prototype.dtos.RegisterRequest;
import  com.smartlearn.prototype.repo.UserRepository;
import com.smartlearn.prototype.model.User;
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public UserResponse getUserProfile(String userId) {
        User user = userRepository.findById(userId).orElseThrow(()-> new RuntimeException("User not Found"));
        UserResponse userResponse = new UserResponse();
        userResponse.setId(user.getId());
        userResponse.setEmail(user.getEmail());
        userResponse.setFirstName(user.getFirstName());
        userResponse.setLastName(user.getLastName());
        userResponse.setCreatedAt(user.getCreatedAt());
        userResponse.setUpdatedAt(user.getUpdatedAt());
        return userResponse;
    }
    public void DeleteUser(String userId){
        boolean user = userRepository.existsById(userId);
        if(user==true){
            userRepository.deleteById(userId);
            System.out.println("user deleted ");
        }
        else{
            System.out.println("user dooesnt exist ");
        }
    }
    public UserResponse register(RegisterRequest request){
        if(userRepository.existByEmail(request.getEmail())){
            throw new RuntimeException("email already exists");
        }
        User user= new User();
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        User savedUser=userRepository.save(user);
        UserResponse userResponse = new UserResponse();
        userResponse.setId(savedUser.getId());
        userResponse.setEmail(savedUser.getEmail());
        userResponse.setFirstName(savedUser.getFirstName());
        userResponse.setLastName(savedUser.getLastName());
        userResponse.setCreatedAt(savedUser.getCreatedAt());
        userResponse.setUpdatedAt(savedUser.getUpdatedAt());
        return userResponse;

    }

}
