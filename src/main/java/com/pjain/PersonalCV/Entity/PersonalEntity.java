package com.pjain.PersonalCV.Entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name = "personal_details")
public class PersonalEntity {

	@Id
	@GeneratedValue(generator="my_seq_p")
	@SequenceGenerator(name="my_seq_p",sequenceName="MY_SEQ_P", allocationSize=1)
	@Column(name = "person_id")
	public Integer personId;
	@Column(name = "name")
	public String name;
	@Column(name = "skill_designation")
	public String skillDesignation;
	@Column(name = "domain")
	public String domain;
	@Column(name = "address")
	public String address;
	@Column(name = "mobile_no")
	public String mobileNo;
	@Column(name = "email_id")
	public String emailId;
	@Column(name = "summary")
	public String summary;	
	@Column(name = "dated")
	public Date dated;
	@LazyCollection(LazyCollectionOption.FALSE)
	/*
	 * @OneToMany( cascade={CascadeType.PERSIST,CascadeType.REMOVE}, orphanRemoval =
	 * true, targetEntity = CertificationsEntity.class, mappedBy = "personId" )
	 */
	@OneToMany
	@JoinTable(name = "PERSON_CERT", joinColumns = @JoinColumn(name = "PERSON_ID"), inverseJoinColumns = @JoinColumn(name = "CERT_ID"))
	private Set<CertificationsEntity> certList = new HashSet<CertificationsEntity>();
	
	@LazyCollection(LazyCollectionOption.FALSE)
	/*
	 * @OneToMany( cascade={CascadeType.PERSIST,CascadeType.REMOVE}, orphanRemoval =
	 * true, targetEntity = EducationEntity.class, mappedBy = "personId" )
	 */
	@OneToMany
	@JoinTable(name = "PERSON_EDU", joinColumns = @JoinColumn(name = "PERSON_ID"), inverseJoinColumns = @JoinColumn(name = "EDU_ID"))
	private Set<EducationEntity> edudtlsList = new HashSet<EducationEntity>();
	
	@LazyCollection(LazyCollectionOption.FALSE)
	/*
	 * @OneToMany( cascade={CascadeType.PERSIST,CascadeType.REMOVE}, orphanRemoval =
	 * true, targetEntity = ExperienceEntity.class, mappedBy = "personId" )
	 */
	@OneToMany
	@JoinTable(name = "PERSON_EXP", joinColumns = @JoinColumn(name = "PERSON_ID"), inverseJoinColumns = @JoinColumn(name = "EXP_ID"))
	private Set<ExperienceEntity> expList = new HashSet<ExperienceEntity>();
	
	@LazyCollection(LazyCollectionOption.FALSE)
	/*
	 * @OneToMany( cascade={CascadeType.PERSIST,CascadeType.REMOVE}, orphanRemoval =
	 * true, targetEntity = HobbiesEntity.class, mappedBy = "personId" )
	 */
	@OneToMany
	@JoinTable(name = "PERSON_HOB", joinColumns = @JoinColumn(name = "PERSON_ID"), inverseJoinColumns = @JoinColumn(name = "HOB_ID"))
	private Set<HobbiesEntity> hobList = new HashSet<HobbiesEntity>();
	
	@LazyCollection(LazyCollectionOption.FALSE)
	/*
	 * @OneToMany( cascade={CascadeType.PERSIST,CascadeType.REMOVE}, orphanRemoval =
	 * true, targetEntity = SkillsEntity.class, mappedBy = "personId" )
	 */
	@OneToMany
	@JoinTable(name = "PERSON_SKIL", joinColumns = @JoinColumn(name = "PERSON_ID"), inverseJoinColumns = @JoinColumn(name = "SKIL_ID"))
	private Set<SkillsEntity> skilList = new HashSet<SkillsEntity>();
	
	@LazyCollection(LazyCollectionOption.FALSE)
	/*
	 * @OneToMany( cascade={CascadeType.PERSIST,CascadeType.REMOVE}, orphanRemoval =
	 * true, targetEntity = ToolsEntity.class, mappedBy = "personId" )
	 */
	@OneToMany
	@JoinTable(name = "PERSON_TOOL", joinColumns = @JoinColumn(name = "PERSON_ID"), inverseJoinColumns = @JoinColumn(name = "TOOL_ID"))
	private Set<ToolsEntity> toolList = new HashSet<ToolsEntity>();

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

	public Set<CertificationsEntity> getCertList() {
		return certList;
	}

	public void setCertList(Set<CertificationsEntity> certList) {
		this.certList = certList;
	}

	public Set<EducationEntity> getEdudtlsList() {
		return edudtlsList;
	}

	public void setEdudtlsList(Set<EducationEntity> edudtlsList) {
		this.edudtlsList = edudtlsList;
	}

	public Set<ExperienceEntity> getExpList() {
		return expList;
	}

	public void setExpList(Set<ExperienceEntity> expList) {
		this.expList = expList;
	}

	public Set<HobbiesEntity> getHobList() {
		return hobList;
	}

	public void setHobList(Set<HobbiesEntity> hobList) {
		this.hobList = hobList;
	}

	public Set<SkillsEntity> getSkilList() {
		return skilList;
	}

	public void setSkilList(Set<SkillsEntity> skilList) {
		this.skilList = skilList;
	}

	public Set<ToolsEntity> getToolList() {
		return toolList;
	}

	public void setToolList(Set<ToolsEntity> toolList) {
		this.toolList = toolList;
	}

	public PersonalEntity(Integer personId, String name, String skillDesignation, String domain, String address,
			String mobileNo, String emailId, String summary, Date dated, Set<CertificationsEntity> certList,
			Set<EducationEntity> edudtlsList, Set<ExperienceEntity> expList, Set<HobbiesEntity> hobList,
			Set<SkillsEntity> skilList, Set<ToolsEntity> toolList) {
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
		this.certList = certList;
		this.edudtlsList = edudtlsList;
		this.expList = expList;
		this.hobList = hobList;
		this.skilList = skilList;
		this.toolList = toolList;
	}

	public PersonalEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

}
