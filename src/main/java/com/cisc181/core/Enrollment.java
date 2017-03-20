package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	private Enrollment(){	
	}
	
	public Enrollment(UUID StudentID, UUID SectionID) {
		this.SectionID=SectionID;
		this.StudentID=StudentID;
		this.EnrollmentID=UUID.randomUUID();
		
	}
	
	public void setEnrollmentID(UUID EnrollmentID){
		this.EnrollmentID=EnrollmentID;
	}
	public UUID getEnrollmentID() {
		return EnrollmentID;
	}
	
	public UUID getSectionID() {
		return SectionID;
	}

	public void setSectionID(UUID sectionID) {
		this.SectionID = sectionID;
	}

	public UUID getStudentID() {
		return StudentID;
	}

	public void setStudentID(UUID studentID) {
		this.StudentID = studentID;
	}

	public double getGrade() {
		return Grade;
	}
	public void setGrade(double Grade){
		this.Grade=Grade;
	}
	
	
}
