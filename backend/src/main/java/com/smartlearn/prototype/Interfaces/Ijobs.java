package com.smartlearn.prototype.Interfaces;

import java.util.List;

import com.smartlearn.prototype.dtos.JobRequest;
import com.smartlearn.prototype.dtos.JobResponse;

public interface Ijobs {
    JobResponse createJob(JobRequest request);
    JobResponse getJobById(String jobId);
    List<JobResponse> getAllJobs();
    JobResponse updateJob(String jobId, JobRequest request);
    String deleteJob(String jobId);
    JobResponse applyForJob(String jobId, String userId);
    
}
