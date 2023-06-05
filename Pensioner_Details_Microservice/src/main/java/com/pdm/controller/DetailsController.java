package com.pdm.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pdm.entity.Details;
import com.pdm.service.IDetailsService;


@RestController
@RequestMapping("/details")
public class DetailsController {

	@Autowired
	IDetailsService iDetailsService;
	
	@GetMapping("/")
	public String hello() {
		return "This is Pensioner Details Microservice";
	}
	
	@PostMapping("/add")
	Long addDetails(@RequestBody Details details) {
		Long aadhar=iDetailsService.addDetails(details);
		System.out.println(aadhar+" added");
		return aadhar;
	}
	
	@GetMapping("/alldetails")
	public List<Details> getAllDetails(){
		return iDetailsService.getAllDetails();
	}
	
	@GetMapping("/get/{aadhar}")
	public Optional<Details> getDetails(@PathVariable Long aadhar){
		Optional<Details> details=iDetailsService.getDetails(aadhar);
		return details;
	}
	
	@PutMapping("/update/{aadhar}")
	public ResponseEntity<Details> updateDetails(@PathVariable("aadhar") Long aadhar,@RequestBody Details details) {
		return new ResponseEntity<Details>(iDetailsService.updateDetails(details, aadhar), HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{aadhar}")
	public void deleteDetails(@PathVariable Long aadhar) {
		iDetailsService.deleteDetails(aadhar);
	}
}