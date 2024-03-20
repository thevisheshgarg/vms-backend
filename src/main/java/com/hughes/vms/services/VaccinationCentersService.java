package com.hughes.vms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hughes.vms.model.Vaccination_centers;
import com.hughes.vms.repository.VaccinationCentersRepository;

@Service
public class VaccinationCentersService {
    @Autowired
    VaccinationCentersRepository vcRepo;
    
    public List<Vaccination_centers> getVaccinationCenters() {
        return vcRepo.findAll();
    }
    
    // You can add more methods here as needed
}

