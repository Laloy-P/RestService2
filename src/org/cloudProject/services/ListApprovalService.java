package org.cloudProject.services;



import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.cloudProject.bdd.ApprovalDB;
import org.cloudProject.beans.Approval;
import org.cloudProject.exceptions.DataNotFoundExeption;

@Path("/ListApprovals")
public class ListApprovalService {
	
	/**
	 * path to get the List  : ../Service/ListApprovals
	 * @return a JSONArray of approvals
	 */
	 @GET
	 @Produces (MediaType.APPLICATION_JSON)
	 public List<Approval> getXMLApprovals() {

		 if(ApprovalDB.listApproval() != null) {
		 		
			 
			 return ApprovalDB.listApproval();
		 
		 }
		 throw new DataNotFoundExeption("ApprovalManager couldn't find any approval.");
		 	
	 }

	
}
