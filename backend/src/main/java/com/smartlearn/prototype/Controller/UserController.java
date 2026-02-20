package  com.smartlearn.prototype.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.smartlearn.prototype.Interfaces.IUserService;
import com.smartlearn.prototype.dtos.RegisterRequest;
import com.smartlearn.prototype.dtos.UpdateRequest;

import jakarta.validation.Valid;

import com.smartlearn.prototype.dtos.UserResponse;

@RestController
@RequestMapping("/api/user")
public class UserController{
    @Autowired
    private IUserService userService;
    
    @PostMapping("/register")
    public ResponseEntity<UserResponse> registerUser(@Valid @RequestBody RegisterRequest request){
        return ResponseEntity.ok(userService.register(request));
    }
    @GetMapping("/{userId}")
    public ResponseEntity<UserResponse> getUserProfile(@PathVariable String userId){
        return ResponseEntity.ok(userService.getUserProfile(userId));
    
    }
    @DeleteMapping("/{userId}")
    public ResponseEntity<String> deleteUserProfile(@PathVariable String userId){
        return ResponseEntity.ok(userService.DeleteUser(userId));
    }
    @PutMapping("/{userId}")
    public ResponseEntity<UserResponse> updateUser(@PathVariable String userId, @RequestBody UpdateRequest request ){
        return ResponseEntity.ok(userService.updateUser(userId,request));
    }
    


}