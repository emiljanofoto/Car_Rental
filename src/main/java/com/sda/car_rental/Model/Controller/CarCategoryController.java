package com.sda.car_rental.Model.Controller;

import com.sda.car_rental.Model.Entity.CarCategory;
import com.sda.car_rental.Model.Repository.CarCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/car-categories")
public class CarCategoryController {

    private CarCategoryRepository carCategoryRepository;
    // Merr të gjitha kategoritë e makinave
    @GetMapping
    public List<CarCategory> getAllCarCategories() {
        return carCategoryRepository.findAll();
    }

    // Merr një kategori makine sipas ID-së
    @GetMapping("/{id}")
    public ResponseEntity<CarCategory> getCarCategoryById(@PathVariable Long id) {
        Optional<CarCategory> carCategory = carCategoryRepository.findById(id);
        return carCategory.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Krijo një kategori të re makine
    @PostMapping
    public CarCategory createCarCategory(@RequestBody CarCategory carCategory) {
        return carCategoryRepository.save(carCategory);
    }

    // Përditëso një kategori ekzistuese makine
    @PutMapping("/{id}")
    public ResponseEntity<CarCategory> updateCarCategory(@PathVariable Long id, @RequestBody CarCategory carCategoryDetails) {
        Optional<CarCategory> optionalCarCategory = carCategoryRepository.findById(id);
        if (optionalCarCategory.isPresent()) {
            CarCategory carCategory = optionalCarCategory.get();
            carCategory.setId(carCategoryDetails.getId());
            carCategory.setCategory(carCategoryDetails.getCategory());
            return ResponseEntity.ok(carCategoryRepository.save(carCategory));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Fshi një kategori makine
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCarCategory(@PathVariable Long id) {
        if (carCategoryRepository.existsById(id)) {
            carCategoryRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}