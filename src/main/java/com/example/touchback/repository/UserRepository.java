package com.example.touchback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.touchback.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

}