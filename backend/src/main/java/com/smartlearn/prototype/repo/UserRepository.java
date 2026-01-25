package com.smartlearn.prototype.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smartlearn.prototype.model.User;

@Repository
public  interface  UserRepository extends JpaRepository<User,String> {
    boolean existByEmail(String email);
    
}
