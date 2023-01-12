package com.example.touchback.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Assessment extends AbstractEntity {
    @ManyToOne
    private Survey survey;
    @ManyToOne
    private User user;
    private Boolean completed;
    private LocalDate updated;
}
