package com.sda.car_rental.Model.Dto.ReviewDtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String branch;
    private String position;
    private String user;

    public EmployeeDTO() {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.branch = branch;
        this.position = position;
        this.user = user;


    }
}
