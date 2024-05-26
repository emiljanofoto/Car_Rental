package com.sda.car_rental.Model.Repository;

import com.sda.car_rental.Model.Entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository <Review, Long> {

}
