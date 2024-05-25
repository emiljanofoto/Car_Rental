package com.sda.car_rental.Model.Services;

import com.sda.car_rental.Model.Entity.Branch;
import com.sda.car_rental.Model.Repository.BranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchService {

    @Autowired
    private BranchRepository branchRepository;

    public List<Branch> findAll() {
        return branchRepository.findAll();
    }

    public Branch findById(Long id) {
        return branchRepository.findById(id).orElse(null);
    }

    public Branch save(Branch branch) {
        return branchRepository.save(branch);
    }

    public void deleteById(Long id) {
        branchRepository.deleteById(id);
    }
}