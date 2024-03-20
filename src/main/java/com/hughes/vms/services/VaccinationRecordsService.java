package com.hughes.vms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hughes.vms.model.Vaccination_records;
import com.hughes.vms.repository.VaccinationRecordsRepository;

@Service
public class VaccinationRecordsService {
    @Autowired
    VaccinationRecordsRepository vrRepo;
    
    public List<Vaccination_records> getVaccinationRecords() {
        return vrRepo.findAll();
    }
    
    // You can add more methods here as needed
}
