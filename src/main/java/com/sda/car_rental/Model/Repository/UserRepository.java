package com.sda.car_rental.Model.Repository;

import com.sda.car_rental.Model.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long>{

        Optional<User> findByEmail(String email);
}
