package com.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.exception.PatientNotFoundException;
import com.hospital.model.Patient;
import com.hospital.service.HospitalService;



@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class PatientController {

	@Autowired
    HospitalService service;

	@PostMapping("/addpatient")
	public boolean createPatient(@RequestBody Patient patient) {
		service.savePatientInformation(patient);
		return true;
	}

	@GetMapping("/showpatient")
	public List<Patient> getAllpatient(){
	return service.getAllpatient();
	}
}