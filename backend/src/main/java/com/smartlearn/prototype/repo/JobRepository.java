package com.smartlearn.prototype.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.smartlearn.prototype.model.Jobs;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface JobRepository extends JpaRepository<Jobs, String> {

    List<Jobs> findAll();

    
}
