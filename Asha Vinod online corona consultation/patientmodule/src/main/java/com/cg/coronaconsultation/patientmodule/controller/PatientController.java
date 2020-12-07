package com.cg.coronaconsultation.patientmodule.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.coronaconsultation.patientmodule.exceptions.PatientNotFoundException;
import com.cg.coronaconsultation.patientmodule.model.Patient;
import com.cg.coronaconsultation.patientmodule.service.PatientServiceImpl;

/**
 * This PatientController class provides GET and PUT
 * 
 * @author Asha
 *
 * 
 */

@RestController
@RequestMapping("/api/v1")

public class PatientController {
	@Autowired
	private PatientServiceImpl patientService;

	
	@PostMapping("/newpatient")
	public Patient createPatient(@RequestBody Patient patient)
	{
		return patientService.createPatient(patient);
	}
	/**
	 * GET method is to view patient
	 */
	@GetMapping("/patient/{patientId}")
	public @ResponseBody Patient getPatientById(@PathVariable("patientId") Integer patientId)
			throws PatientNotFoundException {
		Patient patient = patientService.findPatientById(patientId);
		return patient;
	}

	/**
	 * GET method is to update patient by adding prescription
	 */
	@GetMapping("patient/{patientId}/addPrescription/{prescription}")
	public Patient addPrescriptionsById(@PathVariable Integer patientId, @PathVariable String prescription)
			throws PatientNotFoundException {
		return patientService.addPrescriptionsById(patientId, prescription);
	}

}

