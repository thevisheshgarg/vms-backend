package com.hughes.vms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hughes.vms.model.Appointments;
import com.hughes.vms.services.AppointmentsService;

@RestController
@RequestMapping("/api")
public class AppointmentsController {
    @Autowired
    AppointmentsService appointmentService;

    @RequestMapping(value="/appointments", method=RequestMethod.GET)
    public List<Appointments> readAppointments() {
        return appointmentService.getAppointments();
    }

    // You can add more methods here for handling other CRUD operations for appointments
}
