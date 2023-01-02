package com.example.touchback.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Question extends AbstractEntity {
    private String statement;
    @Enumerated(EnumType.STRING)
    private Option qOption;
    private int questionOrder;
    private boolean required;

}

