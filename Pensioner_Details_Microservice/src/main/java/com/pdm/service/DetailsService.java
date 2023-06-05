package com.pdm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pdm.entity.Details;
import com.pdm.exceptionhandler.ResourceNotFoundException;
import com.pdm.repo.Repo;

@Service
public class DetailsService implements IDetailsService{
	
	@Autowired
	Repo repo;

	@Override
	public Long addDetails(Details details) {
		Details addDetails=repo.save(details);
		return addDetails.getAadhar();
	}

	@Override
	public List<Details> getAllDetails() {
		return repo.findAll();
	}

	@Override
	public Optional<Details> getDetails(Long aadhar) {
		return repo.findById(aadhar);
	}

	@Override
	public Details updateDetails(Details details, Long aadhar) {
		Details existingDetails=repo.findById(aadhar).orElseThrow(
				()->new ResourceNotFoundException("Details", "aadhar", aadhar));
		existingDetails.setName(details.getName());
		existingDetails.setDOB(details.getDOB());
		existingDetails.setPAN(details.getPAN());
		existingDetails.setSalaryEarned(details.getSalaryEarned());
		existingDetails.setAllownces(details.getAllownces());
		existingDetails.setPensionType(details.getPensionType());
		existingDetails.setBankName(details.getBankName());
		existingDetails.setAccNo(details.getAccNo());
		existingDetails.setBankType(details.getBankType());
		repo.save(existingDetails);
		return existingDetails;
	}

	@Override
	public void deleteDetails(Long aadhar) {
		repo.deleteById(aadhar);
		
	}

	
}