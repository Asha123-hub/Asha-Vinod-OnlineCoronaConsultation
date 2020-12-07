package com.cg.coronaconsultation.patientmodule.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class PatientTest {
	
	Patient patient=new Patient();
	
	@Test
	void testPatientId() {
	patient.setPatientId(1);
	assertEquals(patient.getPatientId(),1);
	assertNotEquals(patient.getPatientId(),5);
	assertNotNull(patient.getPatientId());
	}

	@Test
	void testPatientName() {
		patient.setPatientName("perumal");
		assertEquals(patient.getPatientName(),"perumal");
		assertNotEquals(patient.getPatientName(),"ram");
		assertNotNull(patient.getPatientName());
	}

	@Test
	void testBloodGroup() {
		patient.setBloodGroup("ab+");
		assertEquals(patient.getBloodGroup(),"ab+");
		assertNotEquals(patient.getBloodGroup(),"b+");
		assertNotNull(patient.getBloodGroup());
		assertNotEquals(patient.getBloodGroup(),"o+");
	}

	@Test
	void testGetAge() {
		patient.setAge(5);
		assertEquals(patient.getAge(),5);
		assertNotEquals(patient.getAge(),6);
		assertNotNull(patient.getAge());
		assertNotEquals(patient.getAge(),7);

	}

	@Test
	void testMobileNumber() {
		patient.setMobileNumber("9182500757");
		assertEquals(patient.getMobileNumber(),"9182500757");
		assertNotEquals(patient.getMobileNumber(),"9182555757");
		assertNotNull(patient.getMobileNumber());
	}

	@Test
	void testAddress() {
		patient.setAddress("delhi");
		assertEquals(patient.getAddress(),"delhi");
		assertNotEquals(patient.getAddress(),"bombay");
		assertNotNull(patient.getAddress());
	}

	@Test
	void testPrescription() {
		patient.setPrescription("crocine");
		assertEquals(patient.getPrescription(),"crocine");
    	assertNotEquals(patient.getPrescription(),"dopamine");
    	assertNotNull(patient.getPrescription());
	}


}
