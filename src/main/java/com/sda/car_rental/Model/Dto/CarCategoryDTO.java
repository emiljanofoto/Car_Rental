package com.sda.car_rental.Model.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarCategoryDTO {

    private Long id;
    private String category;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
