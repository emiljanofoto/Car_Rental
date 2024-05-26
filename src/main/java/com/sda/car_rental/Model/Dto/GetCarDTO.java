package com.sda.car_rental.Model.Dto;


import com.sda.car_rental.Model.Entity.Car;
import com.sda.car_rental.Model.Entity.Review;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter

public class GetCarDTO {
    private Long id;
    private String brand;
    private String model;
    private String bodyType;
    private int year;
    private String color;
    private long mileage;
    private double amountPerDay;
    private Car.Status status;
    private Set<Review> reviews;



}
