package com.pjain.PersonalCV.Model;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.OneToMany;

import com.pjain.PersonalCV.Entity.CertificationsEntity;
import com.pjain.PersonalCV.Entity.EducationEntity;
import com.pjain.PersonalCV.Entity.ExperienceEntity;
import com.pjain.PersonalCV.Entity.HobbiesEntity;
import com.pjain.PersonalCV.Entity.SkillsEntity;
import com.pjain.PersonalCV.Entity.ToolsEntity;

public class PersonalDetailsModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -959687047395909524L;
	private Integer personId;
	private String name;
	private String skillDesignation;
	private String domain;
	private String address;
	private String mobileNo;
	private String emailId;
	private String summary;	
	private Date dated;

	private List<CertificationsModel> certificationsEntityList = new ArrayList<CertificationsModel>();
	
	private List<EducationDetailsModel> educationDetailsEntityList = new ArrayList<EducationDetailsModel>();

	private List<ExperienceModel> experienceEntityList = new ArrayList<ExperienceModel>();
	
	private List<HobbiesModel> hobbiesEntityList = new ArrayList<HobbiesModel>();
	
	private List<SkillsModel> skillsEntityList = new ArrayList<SkillsModel>();

	private List<ToolsModel> toolsEntityList = new ArrayList<ToolsModel>();

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSkillDesignation() {
		return skillDesignation;
	}

	public void setSkillDesignation(String skillDesignation) {
		this.skillDesignation = skillDesignation;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public Date getDated() {
		return dated;
	}

	public void setDated(Date dated) {
		this.dated = dated;
	}

	public List<CertificationsModel> getCertificationsEntityList() {
		return certificationsEntityList;
	}

	public void setCertificationsEntityList(List<CertificationsModel> certificationsEntityList) {
		this.certificationsEntityList = certificationsEntityList;
	}

	public List<EducationDetailsModel> getEducationDetailsEntityList() {
		return educationDetailsEntityList;
	}

	public void setEducationDetailsEntityList(List<EducationDetailsModel> educationDetailsEntityList) {
		this.educationDetailsEntityList = educationDetailsEntityList;
	}

	public List<ExperienceModel> getExperienceEntityList() {
		return experienceEntityList;
	}

	public void setExperienceEntityList(List<ExperienceModel> experienceEntityList) {
		this.experienceEntityList = experienceEntityList;
	}

	public List<HobbiesModel> getHobbiesEntityList() {
		return hobbiesEntityList;
	}

	public void setHobbiesEntityList(List<HobbiesModel> hobbiesEntityList) {
		this.hobbiesEntityList = hobbiesEntityList;
	}

	public List<SkillsModel> getSkillsEntityList() {
		return skillsEntityList;
	}

	public void setSkillsEntityList(List<SkillsModel> skillsEntityList) {
		this.skillsEntityList = skillsEntityList;
	}

	public List<ToolsModel> getToolsEntityList() {
		return toolsEntityList;
	}

	public void setToolsEntityList(List<ToolsModel> toolsEntityList) {
		this.toolsEntityList = toolsEntityList;
	}
	

	public PersonalDetailsModel(Integer personId, String name, String skillDesignation, String domain, String address,
			String mobileNo, String emailId, String summary, Date dated,
			List<CertificationsModel> certificationsEntityList, List<EducationDetailsModel> educationDetailsEntityList,
			List<ExperienceModel> experienceEntityList, List<HobbiesModel> hobbiesEntityList,
			List<SkillsModel> skillsEntityList, List<ToolsModel> toolsEntityList) {
		super();
		this.personId = personId;
		this.name = name;
		this.skillDesignation = skillDesignation;
		this.domain = domain;
		this.address = address;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.summary = summary;
		this.dated = dated;
		this.certificationsEntityList = certificationsEntityList;
		this.educationDetailsEntityList = educationDetailsEntityList;
		this.experienceEntityList = experienceEntityList;
		this.hobbiesEntityList = hobbiesEntityList;
		this.skillsEntityList = skillsEntityList;
		this.toolsEntityList = toolsEntityList;
	}

	public PersonalDetailsModel() {
		super();
		// TODO Auto-generated constructor stub
	}
}
