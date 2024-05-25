package com.sda.car_rental.Model.Repository;

import com.sda.car_rental.Model.Entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}