package org.cloudProject.beans;

public class Approval {
	
	private int id;
	private String response;
	private String description;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		StringBuilder approval = new StringBuilder();
		approval.append("Approval n° ");
		approval.append(id);
		approval.append(" is ");
		if(getResponse().equals("accepted")) {
			approval.append("accepted");
		}else if (getResponse().equals("refused")) {
			approval.append("refused");
		}else {
			approval.append(" is on standby");
		}
		approval.append("\n");
		
		return approval.toString();
	}
	
	

}
