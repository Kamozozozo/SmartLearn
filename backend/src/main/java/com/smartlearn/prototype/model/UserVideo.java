package com.smartlearn.prototype.model;


import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import static jakarta.persistence.FetchType.LAZY;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="videos")
public class UserVideo{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String title;
    @Column(nullable = false)
    private String url;
    private String resolution;
    @Column(name = "upload_date", nullable = false, updatable = false)
    private LocalDateTime uploadDate;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "featured_video_id", referencedColumnName = "id",nullable=false)
    @JsonBackReference 
    private User user;

}
