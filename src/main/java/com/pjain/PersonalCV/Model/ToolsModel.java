package com.pjain.PersonalCV.Model;

import java.io.Serializable;


public class ToolsModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7333426379233678902L;
	private Integer toolId;
	private Integer personId;
	private String toolName;
	private String toolDesc;
	public Integer getToolId() {
		return toolId;
	}
	public void setToolId(Integer toolId) {
		this.toolId = toolId;
	}
	public Integer getPersonId() {
		return personId;
	}
	public void setPersonId(Integer personId) {
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
	public ToolsModel(Integer toolId, Integer personId, String toolName, String toolDesc) {
		super();
		this.toolId = toolId;
		this.personId = personId;
		this.toolName = toolName;
		this.toolDesc = toolDesc;
	}
	public ToolsModel() {
		super();
		// TODO Auto-generated constructor stub
	}
}
