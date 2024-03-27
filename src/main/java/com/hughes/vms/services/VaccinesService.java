package com.hughes.vms.services;

import com.hughes.vms.model.Vaccines;
import com.hughes.vms.repository.VaccinesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VaccinesService {

    @Autowired
    VaccinesRepository vaccinesRepository;

    public Vaccines insertVaccine(Vaccines vaccine) {
        return vaccinesRepository.save(vaccine);
    }
}