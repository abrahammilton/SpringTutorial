package com.aby.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeMockAnnotationImplTest {

	@Mock
	DataService dataSvc;
	
	@InjectMocks
	SomeImpl impl;
	
	@Test
	public void testFindGreatest() {
		
		Mockito.when(dataSvc.retrieveAllData()).thenReturn(new int[] {24, 15, 47});
		int result = impl.findGreatest();
		assertEquals(47, result);
	}
	
	@Test
	void testFindGreatest_1() {
		
		DataService mocking = mock(DataService.class);
		Mockito.when(mocking.retrieveAllData()).thenReturn(new int[] {47});
		SomeImpl impl = new SomeImpl(mocking);
		int result = impl.findGreatest();
		assertEquals(47, result);
	}

}