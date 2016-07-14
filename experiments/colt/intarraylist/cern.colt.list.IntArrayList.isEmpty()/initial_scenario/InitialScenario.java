package colt;

import org.junit.Test;

import cern.colt.list.IntArrayList;

public class InitialScenario {
	@Test(timeout = 4000)
	public void test0() throws Throwable {
		IntArrayList intArrayList0 = new IntArrayList();
		boolean boolean0 = intArrayList0.isEmpty();
		intArrayList0.setSize(3);
		intArrayList0.add(123543);
		intArrayList0.add(456356);
		intArrayList0.add(756574);
	}

	@Test(timeout = 4000)
	public void test1() throws Throwable {
		IntArrayList intArrayList0 = new IntArrayList();
		intArrayList0.setSize(3);
		intArrayList0.add(123543);
		intArrayList0.add(456356);
		intArrayList0.add(756574);
		boolean boolean1 = intArrayList0.isEmpty();
	}
}
