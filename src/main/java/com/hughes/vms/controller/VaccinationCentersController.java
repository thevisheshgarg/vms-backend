package com.hughes.vms.controller;

import com.hughes.vms.model.Vaccination_centers;
import com.hughes.vms.services.VaccinationCentersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class VaccinationCentersController {

    @Autowired
    VaccinationCentersService vcService;

    @GetMapping("/centers")
    public List<Vaccination_centers> getAllCenters() {
        return vcService.getAllCenters();
    }

    @GetMapping("/centers/search")
    public List<Vaccination_centers> searchCenters(@RequestParam int pincode) {
        return vcService.readByPincode(pincode);
    }

}
