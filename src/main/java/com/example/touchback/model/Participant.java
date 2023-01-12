package com.example.touchback.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Participant extends AbstractEntity{
    @OneToOne
    private User user;
    @ManyToOne(cascade = CascadeType.ALL)
    private Address address;
    private MartialStatus martialStatus;

}
