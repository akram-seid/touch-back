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
    @OneToOne(cascade = CascadeType.A)
    private User user;
    @ManyToOne
    private Address address;
    private MartialStatus martialStatus;

}
