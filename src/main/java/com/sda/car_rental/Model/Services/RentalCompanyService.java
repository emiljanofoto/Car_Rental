package com.sda.car_rental.Model.Services;

import com.sda.car_rental.Model.Entity.RentalCompany;
import com.sda.car_rental.Model.Repository.RentalCompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RentalCompanyService {

    @Autowired
    private RentalCompanyRepository rentalCompanyRepository;

    public RentalCompany createRentalCompany(RentalCompany rentalCompany) {
        return rentalCompanyRepository.save(rentalCompany);
    }

    public List<RentalCompany> listRentalCompanies() {
        return rentalCompanyRepository.findAll();
    }

    public Optional<RentalCompany> getRentalCompany(Long id) {
        return rentalCompanyRepository.findById(id);
    }

    public RentalCompany updateRentalCompany(Long id, String name, String domain, String address, String owner) {
        Optional<RentalCompany> optionalRentalCompany = rentalCompanyRepository.findById(id);
        if (optionalRentalCompany.isPresent()) {
            RentalCompany rentalCompany = optionalRentalCompany.get();
            rentalCompany.setName(name);
            rentalCompany.setDomain(domain);
            rentalCompany.setAddress(address);
            rentalCompany.setOwner(owner);
            return rentalCompanyRepository.save(rentalCompany);
        } else {
            throw new IllegalArgumentException("RentalCompany with id " + id + " does not exist.");
        }
    }

    public void deleteRentalCompany(Long id) {
        if (rentalCompanyRepository.existsById(id)) {
            rentalCompanyRepository.deleteById(id);
        } else {
            throw new IllegalArgumentException("RentalCompany with id " + id + " does not exist.");
        }
    }

}