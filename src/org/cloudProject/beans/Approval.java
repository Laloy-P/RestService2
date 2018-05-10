package org.cloudProject.beans;

public class Approval {
	
	private int id;
	private boolean response;
	private String description;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isResponse() {
		return response;
	}
	public void setResponse(boolean response) {
		this.response = response;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		StringBuilder approval = new StringBuilder();
		approval.append("Approval n° ");
		approval.append(id);
		approval.append(" is ");
		if(response) {
			approval.append(" positive ");
		}else if (!response) {
			approval.append(" negative ");
		}else {
			approval.append(" is on standby");
		}
		approval.append("\n");
		
		return approval.toString();
	}

}
