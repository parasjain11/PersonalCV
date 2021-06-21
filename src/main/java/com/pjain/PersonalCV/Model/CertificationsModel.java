package com.pjain.PersonalCV.Model;

import java.io.Serializable;


public class CertificationsModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7193806092955502159L;
	private Integer certificateId;
	private Integer personId;
	private String skillName;
	private String certificateName;
	private String certificateDesc;
	
	public Integer getCertificateId() {
		return certificateId;
	}
	public void setCertificateId(Integer certificateId) {
		this.certificateId = certificateId;
	}
	public Integer getPersonId() {
		return personId;
	}
	public void setPersonId(Integer personId) {
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
	public CertificationsModel(Integer certificateId, Integer personId, String skillName, String certificateName,
			String certificateDesc) {
		super();
		this.certificateId = certificateId;
		this.personId = personId;
		this.skillName = skillName;
		this.certificateName = certificateName;
		this.certificateDesc = certificateDesc;
	}
	public CertificationsModel() {
		super();
		// TODO Auto-generated constructor stub
	}

}
