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
        UserVideo videos= new UserVideo();
        videos.setTitle(video.getTitle());
        videos.setResolution(video.getResolution());
        video.setUrl(getVideoUrl(video));
        videoRepository.save(videos);
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
