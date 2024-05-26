package com.sda.car_rental.Model.Dto;
import com.sda.car_rental.Model.Entity.Car;
import com.sda.car_rental.Model.Entity.Review;
import lombok.Getter;
import lombok.Setter;
import java.util.Set;
@Setter
@Getter
public class CarDTO {
    private Long id;
    private String brand;
    private String model;
    private String bodyType;
    private int year;
    private String color;
    private long mileage;
    private double amountPerDay;
    private Car.Status status;
    private Long currentBranchId; // ID of the current branch
    private Long categoryId; // ID of the car category
    private Set<Review> reviews;
}
