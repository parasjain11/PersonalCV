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
@Table(name = "skills")

@NamedNativeQueries({
    @NamedNativeQuery(
        name = "getAllSkillsByPersonId",
        query = "SELECT skill_id, person_id, skill_name, skill_desc FROM skills " + 
                    "WHERE person_id = ?",
                    resultClass=SkillsEntity.class
    )
})

public class SkillsEntity {
	
	@Id
	@GeneratedValue(generator="my_seq_s")
	@SequenceGenerator(name="my_seq_s",sequenceName="MY_SEQ_S", allocationSize=1)
	@Column(name = "skill_id")
	public Integer skillId;
	@Column(name = "skill_name")
	public String skillName;
	@Column(name = "skill_desc")
	public String skillDesc;
	

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "person_id")
	public PersonalEntity personId;
	
	
	public Integer getSkillId() {
		return skillId;
	}
	public void setSkillId(Integer skillId) {
		this.skillId = skillId;
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
	public String getSkillDesc() {
		return skillDesc;
	}
	public void setSkillDesc(String skillDesc) {
		this.skillDesc = skillDesc;
	}
	public SkillsEntity(String skillName, String skillDesc) {
		super();
		this.skillName = skillName;
		this.skillDesc = skillDesc;
	}
	public SkillsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
}
