package com.sda.car_rental.Model.Repository;

import com.sda.car_rental.Model.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}