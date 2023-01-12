package com.example.touchback.controller;

import com.example.touchback.model.Assessment;
import com.example.touchback.model.Survey;
import com.example.touchback.service.AssessmentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping()
@Slf4j
public class AssessmentController {

    final AssessmentService assessmentService;


    @PostMapping("/assessment/saveAssessment")
    public ResponseEntity<String> saveAssessment(@RequestParam Assessment assessment) {
        assessmentService.saveAssessment(assessment);
        return new ResponseEntity<>("Assessment is assigned to Participant Successfully!", HttpStatus.CREATED);
    }
    @GetMapping("/assessment/getAssByUser")
    public ResponseEntity<List<Assessment>> getAssessmentsByUsername(@RequestParam String username){
        return new ResponseEntity<>(assessmentService.getAssessments(username), HttpStatus.OK);
    }
    @GetMapping("/assessment/getAssessments")
    public ResponseEntity<List<Assessment>> getAssessments(){
        return new ResponseEntity<>(assessmentService.getAllAssessments(), HttpStatus.OK);
    }

    @GetMapping("/assessment/getCompletedAssessment")
    public ResponseEntity<List<Assessment>> getCompleted(){
        return new ResponseEntity<>(assessmentService.getCompleted(), HttpStatus.OK);
    }
}
