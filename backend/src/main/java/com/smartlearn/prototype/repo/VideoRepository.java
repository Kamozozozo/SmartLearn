package com.smartlearn.prototype.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smartlearn.prototype.model.UserVideo;

@Repository
public  interface  VideoRepository extends JpaRepository<UserVideo,String> {
}
