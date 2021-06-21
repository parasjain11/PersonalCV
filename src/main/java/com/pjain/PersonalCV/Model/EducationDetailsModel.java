package com.pjain.PersonalCV.Model;

import java.io.Serializable;
import java.sql.Date;


public class EducationDetailsModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 577852148915348075L;
	private Integer educationId;
	private Integer personId;
	private String standardName;
	private String instituteName;
	private Date startDate;
	private Date endDate;
	private Integer scores;
	
	
	public Integer getEducationId() {
		return educationId;
	}


	public void setEducationId(Integer educationId) {
		this.educationId = educationId;
	}


	public Integer getPersonId() {
		return personId;
	}


	public void setPersonId(Integer personId) {
		this.personId = personId;
	}


	public String getStandardName() {
		return standardName;
	}


	public void setStandardName(String standardName) {
		this.standardName = standardName;
	}


	public String getInstituteName() {
		return instituteName;
	}


	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public Date getEndDate() {
		return endDate;
	}


	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}


	public Integer getScores() {
		return scores;
	}


	public void setScores(Integer scores) {
		this.scores = scores;
	}


	public EducationDetailsModel(Integer educationId, Integer personId, String standardName, String instituteName,
			Date startDate, Date endDate, Integer scores) {
		super();
		this.educationId = educationId;
		this.personId = personId;
		this.standardName = standardName;
		this.instituteName = instituteName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.scores = scores;
	}


	public EducationDetailsModel() {
		super();
		// TODO Auto-generated constructor stub
	}
}
