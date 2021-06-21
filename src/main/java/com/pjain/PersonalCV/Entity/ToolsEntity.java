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
@Table(name = "tools")

@NamedNativeQueries({
    @NamedNativeQuery(
        name = "getAllToolsByPersonId",
        query = "SELECT tool_id, person_id, tool_name, tool_desc FROM tools " + 
                    "WHERE person_id = ?",
                    resultClass=ToolsEntity.class
    )
})

public class ToolsEntity {
	@Id
	@GeneratedValue(generator="my_seq_t")
	@SequenceGenerator(name="my_seq_t",sequenceName="MY_SEQ_T", allocationSize=1)
	@Column(name = "tool_id")
	public Integer toolId;
	@Column(name = "tool_name")
	public String toolName;
	@Column(name = "tool_desc")
	public String toolDesc;
	

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "person_id")
	public PersonalEntity personId;
	
	public Integer getToolId() {
		return toolId;
	}
	public void setToolId(Integer toolId) {
		this.toolId = toolId;
	}
	public PersonalEntity getPersonId() {
		return personId;
	}
	public void setPersonId(PersonalEntity personId) {
		this.personId = personId;
	}
	public String getToolName() {
		return toolName;
	}
	public void setToolName(String toolName) {
		this.toolName = toolName;
	}
	public String getToolDesc() {
		return toolDesc;
	}
	public void setToolDesc(String toolDesc) {
		this.toolDesc = toolDesc;
	}
	public ToolsEntity(String toolName, String toolDesc) {
		super();
		this.toolName = toolName;
		this.toolDesc = toolDesc;
	}
	public ToolsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
}
