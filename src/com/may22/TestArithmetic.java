package com.may22;

import org.junit.Assert;
import org.junit.Test;

public class TestArithmetic {

	@Test
	public void testSum() {
		Assert.assertEquals(43, Arithmetic.sum(33, 10));
	}
	
	@Test
	public void testSubtract(){
		Assert.assertEquals(23, Arithmetic.subtract(33, 10));
	}

}
