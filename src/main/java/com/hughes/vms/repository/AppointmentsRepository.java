package com.hughes.vms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hughes.vms.model.Appointments;

@Repository
public interface AppointmentsRepository extends JpaRepository<Appointments, Integer> {

}