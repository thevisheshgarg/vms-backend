package com.hughes.vms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hughes.vms.model.Vaccines;

public interface VaccinesRepository extends JpaRepository<Vaccines, Long> {

}
