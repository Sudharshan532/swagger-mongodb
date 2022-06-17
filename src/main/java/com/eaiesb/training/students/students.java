package com.eaiesb.training.students;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class students {
	@Id
	public String _id;
	
	
	private String firstName;
	private String lastName;
	private String studentNumber;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

}
