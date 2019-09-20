package com.aby.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AssertTest {

	@Test
	public void test() {
		assertEquals(1, 1);
		assertTrue(1<2);
	}

}
