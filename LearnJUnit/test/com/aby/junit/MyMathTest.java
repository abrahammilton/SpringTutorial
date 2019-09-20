package com.aby.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class MyMathTest {
	MyMath myMath = new MyMath();

	@Test
	public void sum_with3numbers() {
		//Check result
		assertEquals(6, myMath.sum(new int[] {1,2,3}));
		
	}
	
	@Test
	public void sum_with1numbers() {
		assertEquals(3, myMath.sum(new int[] {3}));
	}

}
