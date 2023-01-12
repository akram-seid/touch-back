package com.example.touchback.service;

import com.example.touchback.model.Assessment;
import com.example.touchback.model.Survey;
import com.example.touchback.repository.AssessmentRepository;
import com.example.touchback.repository.SurveyRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class AssessmentService {
    final AssessmentRepository assessmentRepository;


    public Assessment saveAssessment(Assessment assessment) {
        return assessmentRepository.save(assessment);
    }

    public List<Assessment> getAssessments(String username) {

        List<Assessment> assessment = assessmentRepository.findAssessmentsByUser_Username(username);
        if (assessment.size()>0){
            return assessment;
        }
        throw new RuntimeException("Assessments not found");

    }

    public List<Assessment> getCompleted() {
        List<Assessment> assessment = assessmentRepository.findAssessmentsByCompleted(true);
        if (assessment.size()>0){
            return assessment;
        }
        throw new RuntimeException("Completed Assessment not found");
    }

    public List<Assessment> getAllAssessments() {
        List<Assessment> assessment = assessmentRepository.findAll();
        if (assessment.size()>0){
            return assessment;
        }
        throw new RuntimeException("Assessments not found");
    }
}
