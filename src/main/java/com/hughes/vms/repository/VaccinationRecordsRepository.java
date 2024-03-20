package com.hughes.vms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hughes.vms.model.Vaccination_records;

public interface VaccinationRecordsRepository extends JpaRepository<Vaccination_records, Long> {

}
