package org.cloudProject.services;


import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.cloudProject.bdd.ApprovalDB;
import org.cloudProject.beans.Approval;

@Path("/ListApprovals")
public class ListApprovalService {
/*	
	@GET
	@Produces("application/xml")
	public String getListApproval() {
		
		StringBuilder approvals = new StringBuilder();
		approvals.append("<ListApprovalService>");
		approvals.append("<Approvals>");
		if (ApprovalDB.listApproval() != null) {
			for (Approval element : ApprovalDB.listApproval()) {
				
				approvals.append("<Approval>");
					
					approvals.append("<id>");
						approvals.append(element.getId());
					approvals.append("</id>");
					
					approvals.append("<name>");
						approvals.append(element.getName());
					approvals.append("</name>");
					
					approvals.append("<description>");
						approvals.append(element.getDescription());
					approvals.append("</description>");
					
					approvals.append("<response>");
						approvals.append(element.getResponse());
					approvals.append("</response>");
					
				approvals.append("</Approval>");
			}
		}else {
			approvals.append("<Approval>");
			approvals.append("No approval has been found");
			approvals.append("</Approval>");
		}
		approvals.append("</Approvals>");
		approvals.append("</ListApprovalService>");
		
		Response.ok();
		return  approvals.toString() ;

	}
*/	
	 @GET
	 @Produces(MediaType.APPLICATION_XML)
	 public List<Approval> responseMsg( ) {
		 	
		 if(ApprovalDB.listApproval() != null) {
		 		return ApprovalDB.listApproval();
		 }
	         
		 	Response.ok();
			
		 	return null;
	 
	     }
	
}
