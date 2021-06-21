package com.pjain.PersonalCV.Entity;

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
@Table(name = "hobbies")

@NamedNativeQueries({
    @NamedNativeQuery(
        name = "getAllHobbiesByPersonId",
        query = "SELECT hobby_id, person_id, hobby_name, hobby_desc FROM hobbies " + 
                    "WHERE person_id = ?",
                    resultClass=HobbiesEntity.class
    )
})

public class HobbiesEntity {
	
	@Id
	@GeneratedValue(generator="my_seq_h")
	@SequenceGenerator(name="my_seq_h",sequenceName="MY_SEQ_H", allocationSize=1)
	@Column(name = "hobby_id")
	public Integer hobbyId;
	@Column(name = "hobby_name")
	public String hobbyName;
	@Column(name = "hobby_desc")
	public String hobbyDesc;
	

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "person_id")
	public PersonalEntity personId;
	
	
	public Integer getHobbyId() {
		return hobbyId;
	}
	public void setHobbyId(Integer hobbyId) {
		this.hobbyId = hobbyId;
	}
	public PersonalEntity getPersonId() {
		return personId;
	}
	public void setPersonId(PersonalEntity personId) {
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
	public HobbiesEntity(String hobbyName, String hobbyDesc) {
		super();
		this.hobbyName = hobbyName;
		this.hobbyDesc = hobbyDesc;
	}
	public HobbiesEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
}
