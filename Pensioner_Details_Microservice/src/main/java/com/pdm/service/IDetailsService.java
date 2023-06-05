package com.pdm.service;

import java.util.List;
import java.util.Optional;

import com.pdm.entity.Details;


public interface IDetailsService {

	Long addDetails(Details details);
	
	public List<Details> getAllDetails();
	
	Optional<Details> getDetails(Long aadhar);
	
	Details updateDetails(Details details, Long aadhar);
	
	public void deleteDetails(Long aadhar);
}