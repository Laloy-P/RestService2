package org.cloudProject.testBeans;

import static org.junit.Assert.*;

import org.cloudProject.beans.Approval;
import org.hamcrest.core.IsEqual;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ApprovalTest {
	private Approval approval;
	@Before
	public void setUp() throws Exception {
		approval = new Approval(5, "accepted", "Credit conso","Martin");
	}
	
	
	/*
	 * Tests GETTER
	 */
	
	@Test
	public void testGetId() {
		int expected = 5;
		assertThat(approval.getId(),IsEqual.equalTo(expected));
	}

	@Test
	public void testGetResponse() {
		String expected = "accepted";
		assertThat(approval.getResponse(),IsEqual.equalTo(expected));
	}
	@Test
	public void testGetDescription() {
		String expected = "Credit conso";
		assertThat(approval.getDescription(),IsEqual.equalTo(expected));
	}

	@Test
	public void testSetName() {
		String expected = "Martin";
		assertThat(approval.getName(),IsEqual.equalTo(expected));
	}
	/*
	 * Tests SETTER
	 */
	@Test
	public void testSetId() {
		int expected = 8;
		approval.setId(8);
		assertThat(approval.getId(),IsEqual.equalTo(expected));
	}

	@Test
	public void testSetResponse() {
		String expected = "rejected";
		approval.setResponse("rejected");
		assertThat(approval.getResponse(),IsEqual.equalTo(expected));
	}
	@Test
	public void testSetDescription() {
		String expected = "pending approval";
		approval.setDescription("pending approval");
		assertThat(approval.getDescription(),IsEqual.equalTo(expected));
	}

	@Test
	public void testGetName() {
		String expected = "dupond";
		approval.setName("dupond");
		assertThat(approval.getName(),IsEqual.equalTo(expected));
	}
	
	/* 
	 * AFTER
	 */
	@After
	public void tearDown() {
		approval = null;
	}

}
