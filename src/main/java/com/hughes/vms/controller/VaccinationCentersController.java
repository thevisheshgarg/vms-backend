package com.hughes.vms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hughes.vms.model.Vaccination_centers;
import com.hughes.vms.services.VaccinationCentersService;

@RestController
@RequestMapping("/api")
public class VaccinationCentersController {
    @Autowired
    VaccinationCentersService vcService;

    @RequestMapping(value = "/vaccination-centers", method = RequestMethod.GET)
    public List<Vaccination_centers> readVaccinationCenters() {
        return vcService.getVaccinationCenters();
    }

    // You can add more request mapping methods here as needed
}

