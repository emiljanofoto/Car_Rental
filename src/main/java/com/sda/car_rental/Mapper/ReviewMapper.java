package com.sda.car_rental.Mapper;

import com.sda.car_rental.Model.Dto.ReviewDtos.ReviewDto;
import com.sda.car_rental.Model.Entity.Review;
import org.springframework.stereotype.Component;

@Component
public class ReviewMapper {


    public ReviewDto mapToDto(Review review) {
        ReviewDto reviewDto = new ReviewDto();
        reviewDto.setId(review.getId());
        reviewDto.setName(review.getName());
        reviewDto.setDescription(review.getDescription());


        return reviewDto;
    }
}
