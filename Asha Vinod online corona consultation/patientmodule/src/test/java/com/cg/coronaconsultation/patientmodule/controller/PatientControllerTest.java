package com.cg.coronaconsultation.patientmodule.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.cg.coronaconsultation.patientmodule.model.Patient;
import com.cg.coronaconsultation.patientmodule.service.PatientServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author asha
 *
 * 
 */

@RunWith(SpringRunner.class)

@WebMvcTest(value = PatientController.class)
class PatientControllerTest {

	@Autowired
	private MockMvc mockMvc;
	@MockBean 
	private PatientServiceImpl patientService;
		
	@Test
	public void testGetPatientById() throws Exception {
		String URI = "/api/v1/patient/{patientId}";
		Patient patient = new Patient();
		patient.setAge(4);
		patient.setAddress("hyd");
		patient.setBloodGroup("ab+");
		patient.setMobileNumber("9182500757");
		
		patient.setPatientId(1);
		patient.setPatientName("ram");
		patient.setPrescription("crocine");

		@SuppressWarnings("unused")
		String jsonInput = this.converttoJson(patient);

		Mockito.when(patientService.findPatientById(Mockito.any())).thenReturn(patient);
		MvcResult mvcResult = this.mockMvc
				.perform(MockMvcRequestBuilders.get(URI, 1).accept(MediaType.APPLICATION_JSON)).andReturn();
		MockHttpServletResponse mockHttpServletResponse = mvcResult.getResponse();
		String jsonOutput = mockHttpServletResponse.getContentAsString();
		assertNotNull(jsonOutput);
	
	}
	
	@Test
	public void testAddPrescriptionsById() throws Exception{
	String URI	="/api/v1/patient/{patientId}/addPrescription/{prescription}";
	Patient patient = new Patient();
	patient.setAge(4);
	patient.setAddress("hyd");
	patient.setBloodGroup("ab+");
	patient.setMobileNumber("9182500757");
	patient.setPatientId(1);
	patient.setPatientName("ram");
	patient.setPrescription("crocine");

	String jsonInput = this.converttoJson(patient);
Mockito.when(patientService.addPrescriptionsById(Mockito.any(), Mockito.anyString())).thenReturn(patient);
MvcResult mvcResult = this.mockMvc.perform(MockMvcRequestBuilders.put(URI,1,"\"crocine\"").accept(MediaType.APPLICATION_JSON).content(jsonInput).contentType(MediaType.APPLICATION_JSON))
.andReturn();
MockHttpServletResponse mockHttpServletResponse = mvcResult.getResponse();
String jsonOutput = mockHttpServletResponse.getContentAsString();
	
assertThat(jsonInput).isEqualTo(jsonOutput);

	}

	private String converttoJson(Object patient) throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writeValueAsString(patient);
	}

}
