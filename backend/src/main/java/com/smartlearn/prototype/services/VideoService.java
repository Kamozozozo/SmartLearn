package com.smartlearn.prototype.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartlearn.prototype.model.UserVideo;
import com.smartlearn.prototype.model.User;
import com.smartlearn.prototype.repo.VideoRepository;
import com.smartlearn.prototype.repo.UserRepository;
@Service
public class VideoService {
    @Autowired
    private VideoRepository videoRepository;

    @Autowired
    private UserRepository userRepository;
    public UserVideo postVideo(String userId,UserVideo video){
        Optional<User> userOptional=userRepository.findById(userId);
        if(userOptional.isPresent()){
            User user=userOptional.get();
            UserVideo videos= new UserVideo();
            videos.setTitle(video.getTitle());
            videos.setResolution(video.getResolution());
            videos.setUrl(getVideoUrl(video));
            videos.setUser(user);
            return videoRepository.save(videos);
            
        }
        else{
            throw new RuntimeException("user not found with"+userId);
        }
    }
    //S2bucket to be defined to return the url
    public String getVideoUrl(UserVideo video){
        return "";
    }
    public String deleteVideoInS2(String videoId){
        return "";
    }
    public String  deleteVideo(String videoId){
        boolean video =videoRepository.existsById(videoId);
        if(video==true){
            videoRepository.deleteById(videoId);
            deleteVideoInS2(videoId);
            return "video deleted"; 
        }
        return "video doesnt exist";
    }
    public void getVideo(){
    }
}
