package com.pjain.PersonalCV.Model;

import java.io.Serializable;


public class SkillsModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2059628833406270731L;
	
	private Integer skillId;
	private Integer personId;
	private String skillName;
	private String skillDesc;
	
	public Integer getSkillId() {
		return skillId;
	}
	public void setSkillId(Integer skillId) {
		this.skillId = skillId;
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
	public String getSkillDesc() {
		return skillDesc;
	}
	public void setSkillDesc(String skillDesc) {
		this.skillDesc = skillDesc;
	}
	public SkillsModel(Integer skillId, Integer personId, String skillName, String skillDesc) {
		super();
		this.skillId = skillId;
		this.personId = personId;
		this.skillName = skillName;
		this.skillDesc = skillDesc;
	}
	public SkillsModel() {
		super();
		// TODO Auto-generated constructor stub
	}
}
