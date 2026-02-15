package com.smartlearn.prototype.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name="users")
@Data
public class User{
    @Id
    @GeneratedValue(strategy=GenerationType.UUID)
    private String id;
    @Column(unique=true,nullable=false)
    private String email;
    @Column(nullable=false)
    private String password;
    private String firstName;
    private String LastName;
    @Enumerated(EnumType.STRING)
    private UserRole role;
    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;
    @OneToMany(mappedBy="user",orphanRemoval = true,cascade=CascadeType.ALL)
    @JsonManagedReference
    private List<UserVideo> videos = new ArrayList<>();
    
    @OneToMany(mappedBy="user",orphanRemoval = true,cascade=CascadeType.ALL)
    @JsonManagedReference
    private List<Jobs> jobs = new ArrayList<>();
    
    public void addVideo(UserVideo video){
        if(this.role==UserRole.PROPOSER){
            this.videos.add(video);
            video.setUser(this);
        }
        else{
            throw new IllegalStateException("only proposers can have videos" );
        }
    }
     public void addJobs(Jobs job){
        if(this.role==UserRole.PROPOSER){
            this.jobs.add(job);
            job.setUser(this);
        }
        else{
            throw new IllegalStateException("only proposers can have jobs" );
        }
    }
    
}