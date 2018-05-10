package org.cloudProject.services;

import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.cloudProject.bdd.ApprovalDB;
import org.cloudProject.beans.Approval;

@Path("/AddApproval")
public class AddApprovalService {
	
	@GET
	@Produces("application/xml")
	public String getListApproval() {
		StringBuilder approvals = new StringBuilder();
		for(Approval element :ApprovalDB.ListApproval()) {
			approvals.append(element.toString());
			approvals.append("\n");
		}
		String result = "@Produces(\"application/xml\") Output: hello \n\n";
		return "<service>" + "<serviceOutput>" + approvals + "</serviceOutput>" + "</service>";
		
	}
	
}
