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
		if (ApprovalDB.ListApproval() != null) {
			for (Approval element : ApprovalDB.ListApproval()) {
				approvals.append("<Approval>");
				approvals.append(element.toString());
				approvals.append("</Approval>");
			}
		}
		approvals.append("</ListApprovalService>");
		return  approvals.toString() ;

	}
}
