package com.cg.coronaconsultation.patientmodule.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.coronaconsultation.patientmodule.model.Patient;

/**
 * This is patient repository test class
 * 
 * @author asha
 *
 * 
 */

@RunWith(SpringRunner.class)
@DataJpaTest
class PatientRepositoryTest {

	@Autowired
	private PatientRepository patientRepository;

	@Autowired
	private TestEntityManager testEntityManager;

	@Test
	/**
	 * This method is to test to find patient by Id
	 */
	public void testFindPatientById() {
		Patient patient = new Patient();
		patient.setAge(4);
		patient.setAddress("hyd");
		patient.setBloodGroup("ab+");
		patient.setMobileNumber("9182500757");
		patient.setPatientId(1);
		patient.setPatientName("ram");
		patient.setPrescription("crocine");
		Patient saveInDb = testEntityManager.persist(patient);
		Patient getInDb = patientRepository.findById(patient.getPatientId()).get();
		assertEquals(getInDb, saveInDb);

	}

	@Test
	/**
	 * This method is to test to add prescription
	 */

	public void testAddPrescription() {
		Patient patient = new Patient();
		patient.setAge(4);
		patient.setAddress("hyd");
		patient.setBloodGroup("ab+");
		patient.setMobileNumber("9182500757");
		patient.setPatientId(1);
		patient.setPatientName("ram");
		patient.setPrescription("crocine");

		testEntityManager.persist(patient);
		Patient getFromDb = patientRepository.findById(1).get();
		getFromDb.setPrescription("crocine");
		testEntityManager.persist(getFromDb);

		assertThat(getFromDb.getPrescription()).isEqualTo("crocine");
	}

}
