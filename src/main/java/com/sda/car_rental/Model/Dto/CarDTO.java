package com.sda.car_rental.Model.Dto;


import com.sda.car_rental.Model.Entity.Car;
import com.sda.car_rental.Model.Entity.Branch;
import com.sda.car_rental.Model.Entity.CarCategory;
import com.sda.car_rental.Model.Entity.Review;
import lombok.Data;

import java.util.Set;

@Data
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

    public CarDTO(Car car) {
        this.id = car.getId();
        this.brand = car.getBrand();
        this.model = car.getModel();
        this.bodyType = car.getBodyType();
        this.year = car.getYear();
        this.color = car.getColor();
        this.mileage = car.getMileage();
        this.amountPerDay = car.getAmountPerDay();
        this.status = car.getStatus();
        this.reviews = car.getReviews();

        // Get the IDs of associated entities
        Branch branch = car.getCurrentBranch();
        if (branch != null) {
            this.currentBranchId = branch.getId();
        }

        CarCategory category = car.getCategory();
        if (category != null) {
            this.categoryId = category.getId();
        }
    }
}
