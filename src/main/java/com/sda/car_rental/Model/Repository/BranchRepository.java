package com.sda.car_rental.Model.Repository;

import com.sda.car_rental.Model.Entity.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepository extends JpaRepository<Branch, Long> {
}