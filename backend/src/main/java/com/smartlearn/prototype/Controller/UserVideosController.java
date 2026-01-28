package com.smartlearn.prototype.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import jakarta.transaction.Transactional;
@RestController
@RequestMapping("/api/user/video")
public class UserVideosController {
    @PostMapping
    public String postVideo(){
        return "video created";
    }
    @Transactional
    @DeleteMapping("/{videoId}")
    public String DeleteVideo(){
        return "video deleted";
    }
    @GetMapping("/{videoId}")
    public String getVideo(){
        return "video recieved";
    }
}
