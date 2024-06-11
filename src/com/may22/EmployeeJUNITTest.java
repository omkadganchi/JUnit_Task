package com.may22;

import org.junit.Assert;
import org.junit.Test;

public class EmployeeJUNITTest {
	
	@Test
public void testsum() throws Exception {
		
		//Expected result
		//Actual result
		
		Assert.assertEquals(43, EmployeeJUNIT.sum(33, 10));
	}

	@Test
	public void testinsertData() throws Exception {
		
		//Actual result
		//Expected result
		
		Assert.assertEquals(1, EmployeeJUNIT.insertData());
		
	}

}
