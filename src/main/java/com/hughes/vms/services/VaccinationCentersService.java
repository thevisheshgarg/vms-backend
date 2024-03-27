package com.hughes.vms.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hughes.vms.model.Vaccination_centers;
import com.hughes.vms.repository.VaccinationCentersRepository;

@Service
public class VaccinationCentersService {
	@Autowired
	VaccinationCentersRepository vcRepo;
	
	public List<Vaccination_centers> getAllCenters()
	{
		return vcRepo.findAll();
	}
	
	public List<Vaccination_centers> readByPincode(int pincode)
	{
		return vcRepo.readByPincode(pincode);
	}

}

