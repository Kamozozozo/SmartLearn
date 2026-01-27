package com.smartlearn.prototype.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartlearn.prototype.dtos.RegisterRequest;
import com.smartlearn.prototype.dtos.UpdateRequest;
import com.smartlearn.prototype.dtos.UserResponse;
import  com.smartlearn.prototype.model.User;
import com.smartlearn.prototype.repo.UserRepository;
@Service
public class UserService{
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
    public UserResponse updateUser(String userId,UpdateRequest request){
        if(!userRepository.existsById(userId)){
            throw new RuntimeException("user doesnt exists");
        }
        User user= userRepository.findById(userId).orElseThrow(()-> new RuntimeException("User not Found"));
        user.setEmail(request.getEmail());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        userRepository.save(user);
        UserResponse userResponse = new UserResponse();
        userResponse.setId(user.getId());
        userResponse.setEmail(user.getEmail());
        userResponse.setFirstName(user.getFirstName());
        userResponse.setLastName(user.getLastName());
        userResponse.setCreatedAt(user.getCreatedAt());
        userResponse.setUpdatedAt(user.getUpdatedAt());
        return userResponse;

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
