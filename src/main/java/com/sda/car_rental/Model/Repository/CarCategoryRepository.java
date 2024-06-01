package com.sda.car_rental.Model.Repository;

import com.sda.car_rental.Model.Entity.CarCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CarCategoryRepository extends JpaRepository<CarCategory, Long> {
}
