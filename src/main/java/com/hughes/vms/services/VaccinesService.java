package com.hughes.vms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hughes.vms.model.Vaccines;
import com.hughes.vms.repository.VaccinesRepository;

@Service
public class VaccinesService {
    @Autowired
    VaccinesRepository vaccineRepository;

    public List<Vaccines> getVaccines() {
        return vaccineRepository.findAll();
    }

    // You can add more methods here for handling other operations like creating, updating, and deleting vaccines
}