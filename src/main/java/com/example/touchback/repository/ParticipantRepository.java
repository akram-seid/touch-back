package com.example.touchback.repository;

import com.example.touchback.model.Address;
import com.example.touchback.model.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantRepository extends JpaRepository<Participant,Long> {

}
