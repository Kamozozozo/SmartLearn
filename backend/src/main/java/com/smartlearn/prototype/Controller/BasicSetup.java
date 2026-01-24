package com.smartlearn.prototype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class BasicSetup {
    @GetMapping("/")
    public String Hello(){
        return "hello world";
    }
    
}
