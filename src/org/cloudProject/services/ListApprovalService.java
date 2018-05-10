package org.cloudProject.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.cloudProject.bdd.ApprovalDB;
import org.cloudProject.beans.Approval;

@Path("/ListApprovals")
public class ListApprovalService {
	@GET
	@Produces("application/xml")
	public String getListApproval() {
		
		StringBuilder approvals = new StringBuilder();
		approvals.append("<ListApprovalService>");
		approvals.append("<Approvals>");
		if (ApprovalDB.ListApproval() != null) {
			for (Approval element : ApprovalDB.ListApproval()) {
				approvals.append("<Approval>");
				approvals.append("<id>");
				approvals.append(element.getId());
				approvals.append("</id>");
				approvals.append("<description>");
				approvals.append(element.getDescription());
				approvals.append("</description>");
				approvals.append("<response>");
				approvals.append(element.isResponse());
				approvals.append("</response>");
				approvals.append("</Approval>");
			}
		}else {
			approvals.append("<Approval>");
			approvals.append("No approval has been found");
			approvals.append("</Approval>");
		}
		approvals.append("<Approval>");
		approvals.append("</ListApprovalService>");
		return  approvals.toString() ;

	}
}