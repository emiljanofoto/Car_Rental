package com.sda.car_rental.Model.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
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
    private Branch currentBranch;

    public enum Status {
        AVAILABLE,
        BOOKED,
        UNAVAILABLE
    }
}
