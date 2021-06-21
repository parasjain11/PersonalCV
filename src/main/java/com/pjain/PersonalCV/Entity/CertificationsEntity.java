package com.pjain.PersonalCV.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.JoinColumn;

@Entity
@Table(name = "CERTIFICATIONS")

@NamedNativeQueries({
    @NamedNativeQuery(
        name = "getAllCertificatesByPersonId",
        query = "SELECT certificate_id, person_id, skill_name, institute_name, certificate_desc FROM CERTIFICATIONS " + 
                    "WHERE person_id = ?",
                    resultClass=CertificationsEntity.class
    )
})

public class CertificationsEntity {
	
	@Id
	@GeneratedValue(generator="my_seq_c")
	@SequenceGenerator(name="my_seq_c",sequenceName="MY_SEQ_C", allocationSize=1)
	@Column(name = "certificate_id")
	public Integer certificateId;
	@Column(name = "skill_name")
	public String skillName;
	@Column(name = "institute_name")
	public String certificateName;
	@Column(name = "certificate_desc")
	public String certificateDesc;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "person_id")
	public PersonalEntity personId;
	

	public Integer getCertificateId() {
		return certificateId;
	}
	
	public void setCertificateId(Integer certificateId) {
		this.certificateId = certificateId;
	}


	public PersonalEntity getPersonId() {
		return personId;
	}


	public void setPersonId(PersonalEntity personId) {
		this.personId = personId;
	}


	public String getSkillName() {
		return skillName;
	}


	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}


	public String getCertificateName() {
		return certificateName;
	}


	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}


	public String getCertificateDesc() {
		return certificateDesc;
	}


	public void setCertificateDesc(String certificateDesc) {
		this.certificateDesc = certificateDesc;
	}

	public CertificationsEntity(String skillName, String certificateName,
			String certificateDesc) {
		super();
		this.skillName = skillName;
		this.certificateName = certificateName;
		this.certificateDesc = certificateDesc;
	}


	public CertificationsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
}
