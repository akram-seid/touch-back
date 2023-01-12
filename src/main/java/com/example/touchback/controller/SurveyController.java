package com.example.touchback.controller;

import com.example.touchback.model.Survey;
import com.example.touchback.service.SurveyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping()
public class SurveyController {
    final SurveyService surveyService;

    @PostMapping("/survey/save")
    public ResponseEntity<Survey> saveSurvey(@RequestBody Survey Survey){
        return new ResponseEntity<>(surveyService.saveSurvey(Survey), HttpStatus.CREATED);
    }

    @GetMapping("/survey/getSurvey")
    public ResponseEntity<Survey> getSurvey(@RequestParam Long id){
        return new ResponseEntity<>(surveyService.getSurvey(id), HttpStatus.OK);
    }


    @GetMapping("/survey/getSurveys")
    public ResponseEntity<List<Survey>> getSurveys(){
        return new ResponseEntity<>(surveyService.getSurveys(), HttpStatus.OK);
    }


    }


