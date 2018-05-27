package org.cloudProject.services;

import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.cloudProject.bdd.ApprovalDB;


@Path("/AddApproval")
public class AddApprovalService {

	/**
	 * path to get the List  : ../Service/AddApprovals
	 * This method allow you to add an approval inside the database.
	 * @param response : define if an user is allowed to borrow money. values recommended : accepted or refused
	 * @param description 
	 * @param name 
	 * @throws IOException
	 */
	@POST
	@Produces(MediaType.TEXT_HTML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public void addApproval(@FormParam("response") String response, @FormParam("description") String description, @FormParam("name") String name)
			throws IOException {
			
		ApprovalDB.addApproval(response, description, name);
		
	}
}
