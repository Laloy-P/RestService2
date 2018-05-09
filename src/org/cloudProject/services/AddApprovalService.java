package org.cloudProject.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/AddApproval")
public class AddApprovalService {
	
	@GET
	@Produces("application/xml")
	public String hello() {
 
		String result = "@Produces(\"application/xml\") Output: hello \n\n";
		return "<service>" + "<serviceOutput>" + result + "</serviceOutput>" + "</service>";
		
	}
}
