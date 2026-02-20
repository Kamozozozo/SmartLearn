package com.smartlearn.prototype.controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartlearn.prototype.dtos.JobRequest;
import com.smartlearn.prototype.dtos.JobResponse;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api/jobs")
public class JobsController {
    @PostMapping
    public JobResponse createJob(JobRequest request){

    }
    @GetMapping("/{jobId}")
    public JobResponse getJobById(String jobId){

    }
    @GetMapping
    public List<JobResponse> getAllJobs(){
        
    }
    @PutMapping("/{jobId}")
    public JobResponse updateJob(@PathVariable String jobId, JobRequest request){

    }
    @DeleteMapping("/{jobId}")
    public String deleteJob(@PathVariable String jobId){

    }
    /* 
    @PostMapping("/{jobId}/apply")
    public JobResponse applyForJob(@PathVariable String jobId, String userId){

    }
    */

    
}
