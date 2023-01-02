package com.example.touchback.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Address extends AbstractEntity {
    private String city;
    private String postalCode;
    private String province;
    private String mailingAddress;
    private String phoneNumber;
    private String email;
}
