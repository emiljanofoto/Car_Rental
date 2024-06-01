package com.sda.car_rental.Model.Controller;

import com.sda.car_rental.Model.Entity.RentalCompany;
import com.sda.car_rental.Model.Services.RentalCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rentalcompanies")
public class RentalCompanyController {

    @Autowired
    private RentalCompanyService rentalCompanyService;

    @PostMapping
    public RentalCompany createRentalCompany(@RequestBody RentalCompany rentalCompany) {
        return rentalCompanyService.createRentalCompany(rentalCompany);
    }

    @GetMapping
    public List<RentalCompany> listRentalCompanies() {
        return rentalCompanyService.listRentalCompanies();
    }

    @GetMapping("/{id}")
    public ResponseEntity<RentalCompany> getRentalCompany(@PathVariable Long id) {
        Optional<RentalCompany> rentalCompany = rentalCompanyService.getRentalCompany(id);
        if (rentalCompany.isPresent()) {
            return ResponseEntity.ok(rentalCompany.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<RentalCompany> updateRentalCompany(@PathVariable Long id, @RequestBody RentalCompany rentalCompany) {
        try {
            RentalCompany updatedRentalCompany = rentalCompanyService.updateRentalCompany(id, rentalCompany.getName(), rentalCompany.getDomain(), rentalCompany.getAddress(), rentalCompany.getOwner());
            return ResponseEntity.ok(updatedRentalCompany);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRentalCompany(@PathVariable Long id) {
        try {
            rentalCompanyService.deleteRentalCompany(id);
            return ResponseEntity.noContent().build();
        } catch (IllegalArgumentException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
