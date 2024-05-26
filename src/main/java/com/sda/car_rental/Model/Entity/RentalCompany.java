package com.sda.car_rental.Model.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Entity
@Table(name = "rental_companies")
public class RentalCompany {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String domain;
    private String address;
    private String owner;

    @OneToMany(mappedBy = "rentalCompany", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Branch> branches;
}
