package com.cg.coronaconsultation.patientmodule.exceptions;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

/**
 * This is a GlobalExceptionHandler class 
 * @author asha
 *
 * 
 */
@ControllerAdvice
public class GlobalExceptionHandler {
	/**
	 * Exception handler for global exception
	 */
	@ExceptionHandler(PatientNotFoundException.class)
	public ResponseEntity<Object> resourceNotFoundException(PatientNotFoundException ex, WebRequest request) {
		ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
	}
/**
 * Exception handler for validation error messages
 */
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> globleExcpetionHandler(Exception ex, WebRequest request) {
		ErrorDetails errorDetails = new ErrorDetails(new Date(), "enter valid data", request.getDescription(false));
		return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
