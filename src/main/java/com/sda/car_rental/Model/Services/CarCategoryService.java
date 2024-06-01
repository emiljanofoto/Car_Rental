package com.sda.car_rental.Model.Services;

import com.sda.car_rental.Model.Entity.Car;
import com.sda.car_rental.Model.Entity.CarCategory;
import com.sda.car_rental.Model.Repository.CarCategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarCategoryService {

    private CarCategoryRepository carCategoryRepository;

    public List<CarCategory> findAll() {
        return carCategoryRepository.findAll();
    }

    public CarCategory findById(Long id) {
        return carCategoryRepository.findById(id).orElse(null);
    }

    public CarCategory save(Car car) {
        return carCategoryRepository.save(new CarCategory());
    }

    public void deleteById(Long id) {
        carCategoryRepository.deleteById(id);
    }
}


