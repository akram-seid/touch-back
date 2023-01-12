package com.example.touchback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.touchback.model.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

    @Modifying
    @Query("update User u set u.isApplied=true where u.id=:id")
    void applied(Long id);


}