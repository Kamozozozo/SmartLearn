package  com.smartlearn.prototype.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;
import com.smartlearn.prototype.dtos.RegisterReguest;
import com.smartlearn.prototype.dtos.UserResponse;
import com.smartlearn.prototype.services.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController{
    @Autowired
    private UserService userService;
    
    @PostMapping("/register")
    public ResponseEntitity<UserResponse> registerUser(@Valid @RequestBody RegisterRequest request){
        return ResponseEntity.ok(userService.register(request));
    }
    @GetMapping("/{userId}")
    public ResponseEntity<UserResponse> getUserProfile(@PathVariable String userId){
        return ResponseEntity.ok(userService.getUserProfile(userId));
    
    }
    


}