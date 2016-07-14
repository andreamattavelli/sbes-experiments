package colt;

import org.junit.Test;

import cern.colt.list.IntArrayList;

public class InitialScenario {
	@Test(timeout = 4000)
	public void test0() throws Throwable {
		IntArrayList intArrayList0 = new IntArrayList(new int[2]);
		intArrayList0.set(1, 3);
		int[] elements = intArrayList0.elements();
	}
}
