package com.aby.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class SomeMockImplTest {

	@Test
	void testFindGreatest() {
		
		DataService mocking = mock(DataService.class);
		when(mocking.retrieveAllData()).thenReturn(new int[] {24, 15, 47});
		SomeImpl impl = new SomeImpl(mocking);
		int result = impl.findGreatest();
		assertEquals(47, result);
	}
	
	@Test
	void testFindGreatest_1() {
		
		DataService mocking = mock(DataService.class);
		when(mocking.retrieveAllData()).thenReturn(new int[] {47});
		SomeImpl impl = new SomeImpl(mocking);
		int result = impl.findGreatest();
		assertEquals(47, result);
	}

}