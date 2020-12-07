package com.cg.coronaconsultation.patientmodule.service.impl;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.coronaconsultation.patientmodule.model.Patient;
import com.cg.coronaconsultation.patientmodule.repository.PatientRepository;
/**
 * 
 * @author asha
 *
 * 
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class PatientServiceImplTest {

	 @MockBean
	    private PatientRepository patientRepository;
	@Test
	public void testFindPatientById() {
		Patient patient=new Patient();
		patient.setAge(4);
		patient.setAddress("hyd");
		patient.setBloodGroup("ab+");
		patient.setMobileNumber("9182500757");
		patient.setPatientId(1);
		patient.setPatientName("ram");
		patient.setPrescription("crocine");
		
		assertThat(patient.getPatientId()).isEqualTo(1);
	}
	
	@Test
	public void testAddPrescriptions() {
		Patient patient=new Patient();
		patient.setAge(4);
		patient.setAddress("hyd");
		patient.setBloodGroup("ab+");
		patient.setMobileNumber("9182500757");
		patient.setPatientId(1);
		patient.setPatientName("ram");
		patient.setPrescription("crocine");
		
		  Mockito.when(patientRepository.getOne(1)).thenReturn(patient);
	        patient.setPrescription("medicine");
	        Mockito.when(patientRepository.save(patient)).thenReturn(patient);
	        System.out.println(patient.getPrescription());
	        assertThat(patient.getPrescription()).isEqualTo("medicine");
	}

}
