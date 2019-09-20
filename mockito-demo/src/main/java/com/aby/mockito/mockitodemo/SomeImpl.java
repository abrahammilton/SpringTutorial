package com.aby.mockito.mockitodemo;

public class SomeImpl {

	private DataService svc;

	public SomeImpl(DataService svc) {
		super();
		this.svc = svc;
	}

	int findGreatest() {
		int[] data = svc.retrieveAllData();
		int greatest = Integer.MIN_VALUE;
		for (int val : data) {
			if (val > greatest) {
				greatest = val;
			}
		}
		return greatest;
	}
}