package com.pjain.PersonalCV.Model;

import java.io.Serializable;


public class HobbiesModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6391859427526026431L;
	private Integer hobbyId;
	private Integer personId;
	private String hobbyName;
	private String hobbyDesc;
	public Integer getHobbyId() {
		return hobbyId;
	}
	public void setHobbyId(Integer hobbyId) {
		this.hobbyId = hobbyId;
	}
	public Integer getPersonId() {
		return personId;
	}
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}
	public String getHobbyName() {
		return hobbyName;
	}
	public void setHobbyName(String hobbyName) {
		this.hobbyName = hobbyName;
	}
	public String getHobbyDesc() {
		return hobbyDesc;
	}
	public void setHobbyDesc(String hobbyDesc) {
		this.hobbyDesc = hobbyDesc;
	}
	public HobbiesModel(Integer hobbyId, Integer personId, String hobbyName, String hobbyDesc) {
		super();
		this.hobbyId = hobbyId;
		this.personId = personId;
		this.hobbyName = hobbyName;
		this.hobbyDesc = hobbyDesc;
	}
	public HobbiesModel() {
		super();
		// TODO Auto-generated constructor stub
	}
}
