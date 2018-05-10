package org.cloudProject.services;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Path("/AddApproval")
public class AddApprovalService {

	@GET
	@Produces("application/xml")
	public String getListApproval() {
		String str = "add an approval";
		return "<service>" + "<serviceOutput>" + str + "</serviceOutput>" + "</service>";

	}

}
