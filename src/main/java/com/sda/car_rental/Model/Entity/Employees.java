package com.sda.car_rental.Model.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.management.relation.Role;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Employees")
public class Employees {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String possition;

    private Branches branches;
    private Roles role;

}
