package org.cloudProject.beans;

public class Approval {
	
	private int id;
	private boolean response;
	
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
	@Override
	public String toString() {
		StringBuilder approval = new StringBuilder();
		approval.append("Approval n° ");
		approval.append(id);
		approval.append("has a ");
		approval.append(response);
		approval.append("response");
		return approval.toString();
	}
}
