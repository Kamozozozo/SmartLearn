package com.smartlearn.prototype.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.smartlearn.prototype.dtos.RegisterRequest;
import com.smartlearn.prototype.dtos.UserResponse;
import com.smartlearn.prototype.model.User;
import com.smartlearn.prototype.repo.UserRepository;


@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
    @Mock
    UserRepository userRepo;
    @InjectMocks
    UserService userService;
    @Test
    void AddUserShouldAddUserSuccessFully(){
        RegisterRequest  request = new RegisterRequest();
        User user= new User();
        user.setId("1");
        user.setEmail("kamozozobaete@gmail.com");
        user.setPassword("kamo123");
        user.setFirstName("kamogelo");
        user.setLastName("Matabane");
        Mockito.when(userRepo.save(user)).thenReturn(user);
        UserResponse addedUser=userService.register(request);
        Assertions.assertNotNull(addedUser);
        Assertions.assertEquals("1",user.getId());
        System.out.println("first test");
    
    }
    
}
