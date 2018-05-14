package org.cloudProject.services;


import java.util.ArrayList;
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

	 @GET
	 @Produces (MediaType.APPLICATION_JSON)
	 public List<Approval> getXMLApprovals() {
		 
		 List<Approval>localTest = new ArrayList<>();
		 localTest.add(new Approval(1,"bleu","bleu","bleu"));
		 localTest.add(new Approval(2,"rouge","rouge","rouge"));
		 localTest.add(new Approval(3,"vert","vert","vert"));
		 
		 return localTest;
		 /*
		 if(ApprovalDB.listApproval() != null) {
		 		return ApprovalDB.listApproval();
		 }
	         
		 	Response.ok();
			
		 	return null;
		 	*/
	 }

	
}
