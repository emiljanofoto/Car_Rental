package com.sda.car_rental.Mapper;

import com.sda.car_rental.Model.Dto.ReviewDtos.EmployeeDTO;
import com.sda.car_rental.Model.Entity.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employees")
public class EmployeeMapper {
    public static EmployeeDTO toDTO(Employee employee) {
        EmployeeDTO dto = new EmployeeDTO();
        dto.setId(employee.getId());
        dto.setFirstName(employee.getFirstName());
        dto.setLastName(employee.getLastName());
        dto.setBranch(String.valueOf(employee.getBranch()));
        dto.setUser(String.valueOf((employee.getUser())));
        dto.setPosition(employee.getPosition());
        return dto;
    }

    public static Employee toEntity(EmployeeDTO dto) {
        Employee employee = new Employee();
        employee.setId(dto.getId());
        employee.setFirstName(dto.getFirstName());
        employee.setLastName(dto.getLastName());
        employee.setBranch(dto.getBranch());
        employee.setPosition(dto.getPosition());
        return employee;
    }
}
