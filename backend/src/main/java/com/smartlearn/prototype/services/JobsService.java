package com.smartlearn.prototype.services;

import java.time.LocalDateTime;
import java.util.List;

import com.smartlearn.prototype.Interfaces.Ijobs;
import com.smartlearn.prototype.dtos.JobRequest;
import com.smartlearn.prototype.dtos.JobResponse;
import com.smartlearn.prototype.repo.JobRepository;
import com.smartlearn.prototype.model.Jobs;
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
            Jobs job=new Jobs();
            job.setDescriptions(request.getDescriptions());
            job.setCompany(request.getCompany());
            job.setJobType(request.getJobType());
            job.setLocation(request.getLocation());
            job.setSalary(request.getSalary());
            Jobs savedJob=jobRepository.save(job);
            JobResponse jobResponse=JobResponse.builder()
            .id(savedJob.getId())
            .descriptions(savedJob.getDescriptions())
            .company(savedJob.getCompany())
            .jobType(savedJob.getJobType())
            .location(savedJob.getLocation())
            .salary(savedJob.getSalary())
            .createdAt(savedJob.getCreatedAt())
            .updatedAt(savedJob.getUpdatedAt())
            .build();

            // TODO Auto-generated method stub
            return jobResponse;
        }
    
        @Override
        public JobResponse getJobById(String jobId) {
            Jobs job = jobRepository.findById(jobId).orElseThrow(()-> new RuntimeException("job doesnt exist"));
            JobResponse jobResponse=JobResponse.builder()
            .id(job.getId())
            .descriptions(job.getDescriptions())
            .company(job.getCompany())
            .jobType(job.getJobType())
            .location(job.getLocation())
            .salary(job.getSalary())
            .createdAt(job.getCreatedAt())
            .updatedAt(job.getUpdatedAt())
            .build();
            // TODO Auto-generated method stub
            return jobResponse;
        }
    
        @Override
        public List<JobResponse> getAllJobs() {
            List<Jobs> jobs = jobRepository.findAll();
            List<JobResponse> jobResponses = jobs.stream().map(job -> JobResponse.builder()
            .id(job.getId())
            .descriptions(job.getDescriptions())
            .company(job.getCompany())
            .jobType(job.getJobType())
            .location(job.getLocation())
            .salary(job.getSalary())
            .createdAt(job.getCreatedAt())
            .updatedAt(job.getUpdatedAt())
            .build()).toList();
            return jobResponses;
        }
    
        @Override
        public JobResponse updateJob(String jobId, JobRequest request) {
            // TODO Auto-generated method stub
            Jobs job = jobRepository.findById(jobId).orElseThrow(()-> new RuntimeException("job doesnt exist"));
            job.setDescriptions(request.getDescriptions());
            job.setCompany(request.getCompany());
            job.setJobType(request.getJobType());
            job.setLocation(request.getLocation());
            job.setSalary(request.getSalary());
            Jobs updatedJob=jobRepository.save(job);
            JobResponse jobResponse=JobResponse.builder()
            .id(updatedJob.getId())
            .descriptions(updatedJob.getDescriptions())
            .company(updatedJob.getCompany())
            .jobType(updatedJob.getJobType())
            .location(updatedJob.getLocation())
            .salary(updatedJob.getSalary())
            .createdAt(updatedJob.getCreatedAt())
            .updatedAt(updatedJob.getUpdatedAt())
            .build();
            return jobResponse;
        }
    
        @Override
        public void deleteJob(String jobId) {
            // TODO Auto-generated method stub
            if(jobRepository.existsById(jobId)){
                jobRepository.deleteById(jobId);
            }
            else{
                throw new RuntimeException("job doesn't exist");
            }
        }
        @Override
        public JobResponse applyForJob(String jobId, String userId) {
            // TODO Auto-generated method stub

            return null;
        }
}
