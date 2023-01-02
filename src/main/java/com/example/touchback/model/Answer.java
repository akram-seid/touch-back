package com.example.touchback.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Answer extends AbstractEntity {
    @ManyToOne
    private Assessment assessment;
    @OneToOne
    private Question question;
    private String answer;
}
