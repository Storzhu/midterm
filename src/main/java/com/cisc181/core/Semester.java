package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Semester {
	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;
	public Semester() 
	{

	}
	
	public Semester(UUID SemesterID, Date StartDate, Date EndDate) {
		this.SemesterID = SemesterID;
		this.StartDate = StartDate;
		this.EndDate = EndDate;
	}

	public UUID getSemesterID() {
		return SemesterID;
	}

	public void setSemesterID(UUID semesterID) {
		this.SemesterID = semesterID;
	}

	public Date getStartDate() {
		return StartDate;
	}

	public void setStartDate(Date startDate) {
		this.StartDate = startDate;
	}

	public Date getEndDate() {
		return EndDate;
	}

	public void setEndDate(Date endDate) {
		this.EndDate = endDate;
	}

}