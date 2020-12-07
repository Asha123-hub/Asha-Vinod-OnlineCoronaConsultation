package com.cg.coronaconsultation.patientmodule.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.coronaconsultation.patientmodule.model.Patient;
/** 
 * This is an interface which defines CRUD methods for patient JPA repository
 * @author asha
 *
 * 
 */
@Repository
public interface PatientRepository extends  JpaRepository<Patient,Integer>{

}
