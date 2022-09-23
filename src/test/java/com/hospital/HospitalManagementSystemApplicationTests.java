package com.hospital;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hospital.model.Doctor;
import com.hospital.model.Patient;
import com.hospital.repository.DoctorRepository;
import com.hospital.repository.PatientRepository;

@SpringBootTest
class HospitalManagementSystemApplicationTests {

	@Autowired
	private DoctorRepository doctorRepository;
	
	@Autowired
	private PatientRepository patientRepository; 
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void test_AddDoctor() {
		Doctor doctor = new Doctor();
		doctor.setName("Dr.sha");
		doctor.setAge(20);
		doctor.setField("pett");
		doctor.setGender("Male");
		doctor.getPatient_count();
		
		doctorRepository.save(doctor);
		
		assertNotNull(doctorRepository.findAll());		
	}

	@Test
	public void test_getDoctor() {
		Doctor doctor = doctorRepository.findById(5).get();
		assertEquals("Dr.suresh", doctor.getName());
	}

	@Test
	public void test_AddPatient() {
		Patient patient = new Patient();
		patient.setAge(20);
		patient.setDoctor_name("Dr.Ashoka");
		patient.setName("jana");
		patient.setGender("Male");
		patient.setId(20);
		
		assertNotNull(patientRepository.findAll());
	}
	
	@Test
	public void test_getPatientById() {
		Patient patient = patientRepository.findById(10).get();
		assertEquals("pooja", patient.getName());
	}
}
