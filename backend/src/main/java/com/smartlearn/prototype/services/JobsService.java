package com.smartlearn.prototype.services;

import java.util.List;

import com.smartlearn.prototype.Interfaces.Ijobs;
import com.smartlearn.prototype.dtos.JobRequest;
import com.smartlearn.prototype.dtos.JobResponse;
import com.smartlearn.prototype.repo.JobRepository;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
@Service
@RequiredArgsConstructor
@Transactional
public class JobsService implements Ijobs {
        private final JobRepository jobRepository;
        @Override
        public JobResponse createJob(JobRequest request) {

            // TODO Auto-generated method stub
            return null;
        }
    
        @Override
        public JobResponse getJobById(String jobId) {
            // TODO Auto-generated method stub
            return null;
        }
    
        @Override
        public List<JobResponse> getAllJobs() {
            
            // TODO Auto-generated method stub
            return null;
        }
    
        @Override
        public JobResponse updateJob(String jobId, JobRequest request) {
            // TODO Auto-generated method stub
            return null;
        }
    
        @Override
        public String deleteJob(String jobId) {
            // TODO Auto-generated method stub
            return null;
        }
    
        @Override
        public JobResponse applyForJob(String jobId, String userId) {
            // TODO Auto-generated method stub
            return null;
        }
}
