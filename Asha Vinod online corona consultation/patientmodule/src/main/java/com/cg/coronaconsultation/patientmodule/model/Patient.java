package com.cg.coronaconsultation.patientmodule.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This is an entity class for patients with getters and setters and constructor
 *
 * @asha
 *
 * 
 */
@Entity
@Table(name = "PATIENT")
public class Patient {

	
	@Id
	@Column
	private int patientId;
	@Column
	private String patientName;
	@Column
	private String bloodGroup;
	@Column
	private int age;
	@Column
	private String mobileNumber;
	@Column
	private String address;
	@Column
	private String prescription;

	/** constructor with arguments */
	public Patient(int patientId, String patientName, String bloodGroup, int age, String mobileNumber, String address) {
		super();
	    this.patientId = patientId;
		this.patientName = patientName;
		this.bloodGroup = bloodGroup;
		this.age = age;
		this.mobileNumber = mobileNumber;
		this.address = address;

	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}
  
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPrescription() {
		return prescription;
	}

	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}

	/** default constructor */
	public Patient() {

	}

	@Override
	public String toString() {
		return "\n Patient patientId=" + patientId + "\n patientName=" + patientName + "\n bloodGroup=" + bloodGroup
				+ "\n age=" + age + "\n mobileNumber=" + mobileNumber + "\n address=" + address + "\n prescription="
				+ prescription + "\n-----------\n";
	}

}
