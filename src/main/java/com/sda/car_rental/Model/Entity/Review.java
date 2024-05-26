package com.sda.car_rental.Model.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Review")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String review;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;

    public Car getContent() {
        return null;
    }

    public String getRating() {
        return null;
    }
}
