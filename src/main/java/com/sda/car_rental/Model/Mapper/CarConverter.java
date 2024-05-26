package com.sda.car_rental.Model.Mapper;

import com.sda.car_rental.Model.Dto.CarDTO;
import com.sda.car_rental.Model.Entity.Branch;
import com.sda.car_rental.Model.Entity.Car;
import com.sda.car_rental.Model.Entity.CarCategory;
import lombok.NonNull;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarConverter {

    private CarConverter() {
        // Private constructor to prevent instantiation
    }

    public static CarDTO toDTO(@NonNull Car car) {
        CarDTO carDTO = new CarDTO();
        carDTO.setId(car.getId());
        carDTO.setBrand(car.getBrand());
        carDTO.setModel(car.getModel());
        carDTO.setBodyType(car.getBodyType());
        carDTO.setYear(car.getYear());
        carDTO.setColor(car.getColor());
        carDTO.setMileage(car.getMileage());
        carDTO.setAmountPerDay(car.getAmountPerDay());
        carDTO.setStatus(car.getStatus());
        carDTO.setReviews(car.getReviews());

        if (car.getCurrentBranch() != null) {
            carDTO.setCurrentBranchId(car.getCurrentBranch().getId());
        }

        if (car.getCategory() != null) {
            carDTO.setCategoryId(car.getCategory().getId());
        }

        return carDTO;
    }

    public static List<CarDTO> toDTOList(@NonNull List<Car> cars) {
        return cars.stream()
                .map(CarConverter::toDTO)
                .collect(Collectors.toList());
    }

    public static Car toEntity(@NonNull CarDTO carDTO) {
        Car car = new Car();
        car.setBrand(carDTO.getBrand());
        car.setModel(carDTO.getModel());
        car.setBodyType(carDTO.getBodyType());
        car.setYear(carDTO.getYear());
        car.setColor(carDTO.getColor());
        car.setMileage(carDTO.getMileage());
        car.setAmountPerDay(carDTO.getAmountPerDay());
        car.setStatus(carDTO.getStatus());

        // Set associated entities
        Branch branch = new Branch();
        branch.setId(carDTO.getCurrentBranchId());
        car.setCurrentBranch(branch);

        CarCategory category = new CarCategory();
        category.setId(carDTO.getCategoryId());
        car.setCategory(category);

        return car;
    }

    public static List<Car> toEntityList(@NonNull List<CarDTO> carDTOs) {
        return carDTOs.stream()
                .map(CarConverter::toEntity)
                .collect(Collectors.toList());
    }
}
