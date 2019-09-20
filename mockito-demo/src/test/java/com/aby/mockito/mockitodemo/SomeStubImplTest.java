package com.aby.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeStubImplTest {

	@Test
	void testFindGreatest() {
		SomeImpl impl = new SomeImpl(new DataServieStub());
		int result = impl.findGreatest();
		assertEquals(47, result);
	}

}

class DataServieStub implements DataService{

	@Override
	public int[] retrieveAllData() {
		return new int[]{24, 15, 47};
	}
	
}