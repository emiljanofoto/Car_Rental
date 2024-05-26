package com.sda.car_rental.Model.Dto.CarDtos;

import com.sda.car_rental.Model.Dto.ReviewDtos.ReviewDto;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ResponseCarDto {

    private Long id;
    private String brand;
    private String model;
    private String bodyType;
    private int year;
    private String color;
    private long mileage;
    private double amountPerDay;
    private Long categoryId;
    private List<ReviewDto> reviewDtoList;
}
