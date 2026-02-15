package com.smartlearn.prototype.services;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartlearn.prototype.dtos.RegisterRequest;
import com.smartlearn.prototype.dtos.UpdateRequest;
import com.smartlearn.prototype.dtos.UserResponse;
import com.smartlearn.prototype.model.Jobs;
import  com.smartlearn.prototype.model.User;
import com.smartlearn.prototype.model.UserRole;
import  com.smartlearn.prototype.model.UserVideo;
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
    //@Transactional
    public String DeleteUser(String userId){
        boolean user = userRepository.existsById(userId);
        if(user==true){
            userRepository.deleteById(userId);
            return "user deleted";
        }
        else{
            return "user dooesnt exist";
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
        if(userRepository.existsByEmail(request.getEmail())){
            throw new RuntimeException("email already exists");
        }
        User user= new User();
        List<UserVideo> video=user.getVideos();
        List<Jobs> job=user.getJobs();
        UserRole selectedRole=UserRole.valueOf(request.getRole().toString().toUpperCase());
        user.setRole(selectedRole);
        if(selectedRole==UserRole.USER || selectedRole==UserRole.INVESTOR){
            user.setVideos(new ArrayList<>());
            user.setJobs(new ArrayList<>());
        }
        else if(selectedRole==UserRole.PROPOSER){
            user.setVideos(video);
            user.setJobs(job);
        }else{
            throw new RuntimeException("invalid Role");
        }
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
