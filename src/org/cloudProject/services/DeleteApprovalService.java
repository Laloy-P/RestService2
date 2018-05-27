package org.cloudProject.services;

import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.cloudProject.bdd.ApprovalDB;

@Path("/Delete")
public class DeleteApprovalService {
	
	/**
	 * path to get the List  : ../Service/Delete
	 * Use this method to delete an approval inside the database
	 * @param id : identifier of the approval
	 * @throws IOException
	 */
	@DELETE
	@Produces(MediaType.TEXT_HTML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public void newTodo(@FormParam("id") int id) throws IOException {
			
		ApprovalDB.deleteApproval(id);
		
	}	
	
}
