package com.sda.car_rental.Model.Repository;

import com.sda.car_rental.Model.Entity.RentalCompany;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalCompanyRepository extends JpaRepository<RentalCompany, Long> {
}
