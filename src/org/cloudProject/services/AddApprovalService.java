package org.cloudProject.services;

import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/AddApproval")
public class AddApprovalService {
	
	@GET
	@Produces("application/xml")
	public String getListApproval() {
		String str = "add an approval";
		return "<service>" + "<serviceOutput>" + str + "</serviceOutput>" + "</service>";

	}

	@POST
	@Produces(MediaType.TEXT_HTML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public void newTodo(@FormParam("id") String id, @FormParam("response") boolean response,
			@FormParam("description") String description)
			throws IOException {
			System.out.println(id);
			System.out.println(description);
			System.out.println(response);
				

				
	}
}
