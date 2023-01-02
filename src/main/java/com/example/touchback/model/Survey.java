package com.example.touchback.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Survey extends AbstractEntity {
    private String title;
    private String legend;
    private String description;
    @Enumerated(EnumType.STRING)
    private Category category;
    @OneToMany
    List<Question> questionList;


}
