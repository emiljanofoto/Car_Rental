package com.sda.car_rental.Model.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;
    private String model;
    private String bodyType;
    private int year;
    private String color;
    private long mileage;
    private double amountPerDay;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne
    @JoinColumn(name = "branch_id")
    private Branch currentBranch;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private CarCategory category;

    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Review> reviews;

    public enum Status {
        AVAILABLE,
        BOOKED,
        UNAVAILABLE
    }
}
