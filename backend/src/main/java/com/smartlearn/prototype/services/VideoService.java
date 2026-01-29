package com.smartlearn.prototype.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartlearn.prototype.model.UserVideo;
import com.smartlearn.prototype.repo.VideoRepository;

@Service
public class VideoService {
    @Autowired
    private VideoRepository videoRepository;
    public void postVideo(UserVideo video){

    }
    public void deleteVideo(String videoId){

    }
    public void getVideo(){

    }
}
