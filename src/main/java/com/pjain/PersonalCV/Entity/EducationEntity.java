package com.pjain.PersonalCV.Entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "education_details")

@NamedNativeQueries({
    @NamedNativeQuery(
        name = "getAllEducationsByPersonId",
        query = "SELECT education_id, person_id, standard_name, institute_name, start_date, end_date, scores FROM education_details " + 
                    "WHERE person_id = ?",
                    resultClass=EducationEntity.class
    )
})

public class EducationEntity {
	
	@Id
	@GeneratedValue(generator="my_seq_ed")
	@SequenceGenerator(name="my_seq_ed",sequenceName="MY_SEQ_ED", allocationSize=1)
	@Column(name = "education_id")
	public Integer educationId;
	@Column(name = "standard_name")
	public String standardName;
	@Column(name = "institute_name")
	public String instituteName;
	@Column(name = "start_date")
	public Date startDate;
	@Column(name = "end_date")
	public Date endDate;
	@Column(name = "scores")
	public Integer scores;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "person_id")
	public PersonalEntity personId;
	
	
	
	public Integer getEducationId() {
		return educationId;
	}
	public void setEducationId(Integer educationId) {
		this.educationId = educationId;
	}
	public PersonalEntity getPersonId() {
		return personId;
	}
	public void setPersonId(PersonalEntity personId) {
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
	public EducationEntity(String standardName, String instituteName,
			Date startDate, Date endDate, Integer scores) {
		super();
		this.standardName = standardName;
		this.instituteName = instituteName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.scores = scores;
	}
	public EducationEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
}
