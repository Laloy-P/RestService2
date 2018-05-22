package org.cloudProject.testServices;

import static org.junit.Assert.*;

import java.net.HttpURLConnection;
import java.net.URL;

//import org.cloudProject.beans.Approval;
import org.hamcrest.core.IsEqual;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ListApprovalServiceTest {

	//private Approval approval;
	int statusCode = 0;
	URL url; 
	@Before
	public void setUp() throws Exception {
		url = new URL("https://approvalmanagerservice.herokuapp.com/Service/ListApprovals");
		HttpURLConnection http = (HttpURLConnection)url.openConnection();
		statusCode = http.getResponseCode();
	}
	
	
	@Test
	public void testConnection() {

		assertThat(statusCode,IsEqual.equalTo(200));

	}
	
	
	@After
	public void tearDown() {
		//approval = null;
		url = null;
		statusCode = 0;
	}
}
