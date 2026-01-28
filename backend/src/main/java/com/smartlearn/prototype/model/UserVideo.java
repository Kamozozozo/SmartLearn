package com.smartlearn.prototype.model;


import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="video")
public class Video{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String title;
    private String url;
    private String resolution;
    private LocalDateTime uploadDate;
    @OneToMany(mappedBy="featuredVideo")
    private User user;

}
