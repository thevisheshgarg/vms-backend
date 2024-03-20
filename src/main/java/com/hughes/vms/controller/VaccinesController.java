package com.hughes.vms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hughes.vms.model.Vaccines;
import com.hughes.vms.services.VaccinesService;

@RestController
@RequestMapping("/api")
public class VaccinesController {
    @Autowired
    VaccinesService vaccineService;

    @RequestMapping(value="/vaccines", method=RequestMethod.GET)
    public List<Vaccines> readVaccines() {
        return vaccineService.getVaccines();
    }

    // You can add more methods here for handling other operations like creating, updating, and deleting vaccines
}
