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
import org.springframework.http.HttpStatus;
import lombok.RequiredArgsConstructor;
import com.smartlearn.prototype.services.JobsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/jobs")
@RequiredArgsConstructor
public class JobsController {
    private final JobsService jobsService;

    @PostMapping
    public ResponseEntity<JobResponse> createJob(@RequestBody JobRequest request){
        return ResponseEntity.status(HttpStatus.CREATED).body(jobsService.createJob(request));

    }
    @GetMapping("/{jobId}")
    public ResponseEntity<JobResponse> getJobById(@PathVariable String jobId){
        return ResponseEntity.ok(jobsService.getJobById(jobId));

    }
    @GetMapping
    public ResponseEntity<List<JobResponse>> getAllJobs(){
        return ResponseEntity.ok(jobsService.getAllJobs());
        
    }
    @PutMapping("/{jobId}")
    public ResponseEntity<JobResponse> updateJob(@PathVariable  String jobId,@RequestBody JobRequest request){
        return ResponseEntity.ok(jobsService.updateJob(jobId,request));
    }
    @DeleteMapping("/{jobId}")
    public ResponseEntity<?> deleteJob(@PathVariable String jobId){
        jobsService.deleteJob(jobId);
        return ResponseEntity.noContent().build();

    }
    /* 
    @PostMapping("/{jobId}/apply")
    public JobResponse applyForJob(@PathVariable String jobId, String userId){

    }
    */

    
}
