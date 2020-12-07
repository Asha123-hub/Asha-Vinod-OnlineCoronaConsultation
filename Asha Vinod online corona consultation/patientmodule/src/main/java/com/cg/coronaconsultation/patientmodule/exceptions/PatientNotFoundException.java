package com.cg.coronaconsultation.patientmodule.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * This is a CustomedException class
 * 
 * @author asha
 *
 * 
 */

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class PatientNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public PatientNotFoundException(String message) {
		super(message);
	}
}
