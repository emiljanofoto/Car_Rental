package com.sda.car_rental.Mapper;

import com.sda.car_rental.Model.Dto.CarCategoryDTO;
import com.sda.car_rental.Model.Entity.CarCategory;

public class CarCategoryMapper {
    public static CarCategoryDTO toDTO(CarCategory carCategory) {
        CarCategoryDTO dto = new CarCategoryDTO();
        dto.setId(carCategory.getId());
        dto.setCategory(carCategory.getCategory());
        return dto;
    }

    public static CarCategory toEntity(CarCategoryDTO dto) {
        CarCategory carCategory = new CarCategory();
        carCategory.setId(dto.getId());
        carCategory.setCategory(dto.getCategory());
        return carCategory;
    }
}


