package com.pjain.PersonalCV.Model;

import java.io.Serializable;
import java.sql.Date;


public class ExperienceModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2034249007898083184L;
	private Integer experienceId;
	private Integer personId;
	private String designation;
	private String clientName;
	private String companyName;	
	private Date startDate;	
	private Date endDate;	
	private String experienceDesc;	
	private String rolesResponsibility1;
	private String rolesResponsibility2;
	private String rolesResponsibility3;
	private String rolesResponsibility4;
	private String rolesResponsibility5;
	private String rolesResponsibility6;
	
	public Integer getExperienceId() {
		return experienceId;
	}
	public void setExperienceId(Integer experienceId) {
		this.experienceId = experienceId;
	}
	public Integer getPersonId() {
		return personId;
	}
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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
	public String getExperienceDesc() {
		return experienceDesc;
	}
	public void setExperienceDesc(String experienceDesc) {
		this.experienceDesc = experienceDesc;
	}
	public String getRolesResponsibility1() {
		return rolesResponsibility1;
	}
	public void setRolesResponsibility1(String rolesResponsibility1) {
		this.rolesResponsibility1 = rolesResponsibility1;
	}
	public String getRolesResponsibility2() {
		return rolesResponsibility2;
	}
	public void setRolesResponsibility2(String rolesResponsibility2) {
		this.rolesResponsibility2 = rolesResponsibility2;
	}
	public String getRolesResponsibility3() {
		return rolesResponsibility3;
	}
	public void setRolesResponsibility3(String rolesResponsibility3) {
		this.rolesResponsibility3 = rolesResponsibility3;
	}
	public String getRolesResponsibility4() {
		return rolesResponsibility4;
	}
	public void setRolesResponsibility4(String rolesResponsibility4) {
		this.rolesResponsibility4 = rolesResponsibility4;
	}
	public String getRolesResponsibility5() {
		return rolesResponsibility5;
	}
	public void setRolesResponsibility5(String rolesResponsibility5) {
		this.rolesResponsibility5 = rolesResponsibility5;
	}
	public String getRolesResponsibility6() {
		return rolesResponsibility6;
	}
	public void setRolesResponsibility6(String rolesResponsibility6) {
		this.rolesResponsibility6 = rolesResponsibility6;
	}
	public ExperienceModel(Integer experienceId, Integer personId, String designation, String clientName,
			String companyName, Date startDate, Date endDate, String experienceDesc, String rolesResponsibility1,
			String rolesResponsibility2, String rolesResponsibility3, String rolesResponsibility4,
			String rolesResponsibility5, String rolesResponsibility6) {
		super();
		this.experienceId = experienceId;
		this.personId = personId;
		this.designation = designation;
		this.clientName = clientName;
		this.companyName = companyName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.experienceDesc = experienceDesc;
		this.rolesResponsibility1 = rolesResponsibility1;
		this.rolesResponsibility2 = rolesResponsibility2;
		this.rolesResponsibility3 = rolesResponsibility3;
		this.rolesResponsibility4 = rolesResponsibility4;
		this.rolesResponsibility5 = rolesResponsibility5;
		this.rolesResponsibility6 = rolesResponsibility6;
	}
	public ExperienceModel() {
		super();
		// TODO Auto-generated constructor stub
	}

}
