package colt;

import org.junit.Test;

import cern.colt.list.IntArrayList;

public class InitialScenario {
	@Test(timeout = 4000)
	public void test0() throws Throwable {
		int[] intArray0 = new int[3];
		intArray0[0] = 1;
		IntArrayList intArrayList0 = new IntArrayList(intArray0);
		int int0 = intArrayList0.getQuick(0);
	}
}
