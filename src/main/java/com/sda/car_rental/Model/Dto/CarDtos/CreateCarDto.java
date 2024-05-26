package com.sda.car_rental.Model.Dto.CarDtos;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateCarDto {

    private Long id;
    private String brand;
    private String model;
    private String bodyType;
    private int year;
    private String color;
    private long mileage;
    private double amountPerDay;
    private Long categoryId;



}
