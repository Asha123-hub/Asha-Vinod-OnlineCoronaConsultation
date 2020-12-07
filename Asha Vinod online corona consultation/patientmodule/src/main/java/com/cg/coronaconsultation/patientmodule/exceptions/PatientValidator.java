package com.cg.coronaconsultation.patientmodule.exceptions;

import java.util.regex.*;

public class PatientValidator {
	
	
	public boolean validatePatientId(Integer patientId)throws PatientNotFoundException {
		String regex="^[0-9]*$";
		Pattern pat=Pattern.compile(regex);
		Matcher m=null;
		try {
		 m =pat.matcher(String.valueOf(patientId));
		}catch(NumberFormatException e) {
			throw new PatientNotFoundException("enter a valid Id");
			}
		return m.matches();
	}
}