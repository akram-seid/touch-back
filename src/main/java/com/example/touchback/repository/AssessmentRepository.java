package com.example.touchback.repository;

import com.example.touchback.model.Assessment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AssessmentRepository extends JpaRepository<Assessment,Long> {

    List<Assessment> findAssessmentsByUser_Username(String username);
    List<Assessment> findAssessmentsByCompleted(Boolean completed);



}
