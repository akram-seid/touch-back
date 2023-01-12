package com.example.touchback.service;

import com.example.touchback.model.Assessment;
import com.example.touchback.model.Role;
import com.example.touchback.model.Survey;
import com.example.touchback.model.User;
import com.example.touchback.repository.AssessmentRepository;
import com.example.touchback.repository.SurveyRepository;
import com.example.touchback.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class SurveyService {
    final SurveyRepository surveyRepository;
    private final UserRepository userRepository;
    private final AssessmentRepository assessmentRepository;
    Date date = new Date();
    SimpleDateFormat created = new SimpleDateFormat("dd-M-yyyy");

    public Survey saveSurvey(Survey survey) {
        return surveyRepository.save(survey);
    }

    public Survey getSurvey(Long id) {
        if (surveyRepository.findById(id).isPresent()){
            return surveyRepository.findById(id).get();
        }
        throw new RuntimeException("User not found");

    }

    public List<Survey> getSurveys() {
        return surveyRepository.findAll();
    }


}
