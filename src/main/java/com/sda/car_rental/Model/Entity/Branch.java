package com.sda.car_rental.Model.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "BRANCH")
public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "EMPLOYERS", nullable = false)
    private String employers;

    @Column(name = "ADDRESS", nullable = false)
    private String address;

    @Column(name = "COMPANY_ID", nullable = false)
    private long companyId;

    @OneToMany(mappedBy = "currentBranch")
    private List<Car> cars;

    @OneToMany(mappedBy = "branch")
    private List<Employee> employees;
}
