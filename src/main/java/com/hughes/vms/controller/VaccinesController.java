package com.hughes.vms.controller;

import com.hughes.vms.model.Vaccines;
import com.hughes.vms.services.VaccinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class VaccinesController {

    @Autowired
    VaccinesService vaccinesService;

    @PostMapping("/vaccines")
    public Vaccines insertVaccine(@RequestBody Vaccines vaccine) {
        return vaccinesService.insertVaccine(vaccine);
    }
}
