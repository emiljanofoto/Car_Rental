package com.sda.car_rental.Mapper;

import com.sda.car_rental.Model.Dto.CarDtos.CreateCarDto;
import com.sda.car_rental.Model.Dto.CarDtos.ResponseCarDto;
import com.sda.car_rental.Model.Dto.ReviewDtos.ReviewDto;
import com.sda.car_rental.Model.Entity.Car;
import com.sda.car_rental.Model.Entity.Review;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@AllArgsConstructor
@Component
public class CarMapper {

    private ReviewMapper reviewMapper;


    public Car mapToEntity(CreateCarDto dto) {
        Car car = new Car();
        car.setBrand(dto.getBrand());
        car.setColor(dto.getColor());
        car.setBodyType(dto.getBodyType());
        car.setYear(dto.getYear());
        car.setModel(dto.getModel());
        car.setMileage(dto.getMileage());
        car.setAmountPerDay(dto.getAmountPerDay());
                return car;
    }



    public ResponseCarDto mapToDto(Car car) {
        ResponseCarDto responseCarDto = new ResponseCarDto();

        responseCarDto.setId(car.getId());

        Set<Review> reviews = car.getReviews();
        List<ReviewDto> reviewDtoList = new ArrayList<>();

        for (Review review : reviews) {
            reviewDtoList.add(reviewMapper.mapToDto(review));
        }




//        responseCarDto.setReviewDtoList(car.getReviews().stream().map(review -> reviewMapper.mapToDto(review)).collect(Collectors.toList()));
//
        responseCarDto.setReviewDtoList(reviewDtoList);



        return responseCarDto;
    }

}
