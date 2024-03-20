package com.hughes.vms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hughes.vms.model.Appointments;
import com.hughes.vms.repository.AppointmentsRepository;

@Service
public class AppointmentsService {
    @Autowired
    AppointmentsRepository appointmentRepository;

    public List<Appointments> getAppointments() {
        return appointmentRepository.findAll();
    }

    // You can add more methods here for handling other operations like creating, updating, and deleting appointments
}
