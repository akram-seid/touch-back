package com.example.touchback.repository;

import com.example.touchback.model.Address;
import com.example.touchback.model.Survey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurveyRepository extends JpaRepository<Survey,Long> {

}
