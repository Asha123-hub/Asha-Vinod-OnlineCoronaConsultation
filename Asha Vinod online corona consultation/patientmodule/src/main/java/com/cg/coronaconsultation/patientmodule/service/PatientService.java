package com.cg.coronaconsultation.patientmodule.service;

import com.cg.coronaconsultation.patientmodule.exceptions.PatientNotFoundException;
import com.cg.coronaconsultation.patientmodule.model.Patient;
/**
 * This is an interface for PatientService Class
 * @author asha
 *
 * 
 */


public interface PatientService {
	/**
	 * This method takes patientId and finds Patient
	 */
	public Patient findPatientById(Integer patientId) throws PatientNotFoundException;
	/**
	 * This method takes PatientId and prescription and adds Prescription
	 */
	public Patient addPrescriptionsById(Integer patientId, String prescription) throws PatientNotFoundException;
    public Patient createPatient(Patient patient);
}
