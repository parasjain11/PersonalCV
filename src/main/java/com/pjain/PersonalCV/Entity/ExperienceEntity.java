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
@Table(name = "experience")


@NamedNativeQueries({
    @NamedNativeQuery(
        name = "getAllExperienceByPersonId",
        query = "SELECT experience_id, person_id, designation, client_name, company_name, start_date, end_date, " +
        "experience_desc, roles_responsibility_1 , roles_responsibility_2 , roles_responsibility_3 , roles_responsibility_4 , roles_responsibility_5 , roles_responsibility_6 FROM experience " + 
                    "WHERE person_id = ?",
                    resultClass=ExperienceEntity.class
    )
})
public class ExperienceEntity {

	@Id
	@GeneratedValue(generator="my_seq_ex")
	@SequenceGenerator(name="my_seq_ex",sequenceName="MY_SEQ_EX", allocationSize=1)
	@Column(name = "experience_id")
	private Integer experienceId;
	@Column(name = "designation")
	private String designation;
	@Column(name = "client_name")
	private String clientName;
	@Column(name = "company_name")
	private String companyName;	
	@Column(name = "start_date")
	private Date startDate;	
	@Column(name = "end_date")
	private Date endDate;	
	@Column(name = "experience_desc")
	private String experienceDesc;	
	@Column(name = "roles_responsibility_1")
	private String rolesResponsibility1;
	@Column(name = "roles_responsibility_2")
	private String rolesResponsibility2;
	@Column(name = "roles_responsibility_3")
	private String rolesResponsibility3;
	@Column(name = "roles_responsibility_4")
	private String rolesResponsibility4;
	@Column(name = "roles_responsibility_5")
	private String rolesResponsibility5;
	@Column(name = "roles_responsibility_6")
	private String rolesResponsibility6;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "person_id")
	public PersonalEntity personId;
	
	public Integer getExperienceId() {
		return experienceId;
	}
	public void setExperienceId(Integer experienceId) {
		this.experienceId = experienceId;
	}
	public PersonalEntity getPersonId() {
		return personId;
	}
	public void setPersonId(PersonalEntity personId) {
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
	public ExperienceEntity(String designation, String clientName,
			String companyName, Date startDate, Date endDate, String experienceDesc, String rolesResponsibility1,
			String rolesResponsibility2, String rolesResponsibility3, String rolesResponsibility4,
			String rolesResponsibility5, String rolesResponsibility6) {
		super();
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
	public ExperienceEntity() {
		super();
		// TODO Auto-generated constructor stub
	}		
}
