package com.cg.coronaconsultation.patientmodule;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * this class is to run the spring boot application
 * 
 * @author asha
 *
 * 
 */
@SpringBootApplication
public class PatientmoduleApplication {

	private static final Logger logger = LogManager.getLogger(PatientmoduleApplication.class);  
	
	public static void main(String[] args) {
		SpringApplication.run(PatientmoduleApplication.class, args);
		logger.info("Info log");
	}

}
