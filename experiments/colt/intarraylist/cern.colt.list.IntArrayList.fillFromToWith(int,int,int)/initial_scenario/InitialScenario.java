package colt;

import org.junit.Test;

import cern.colt.list.IntArrayList;

public class InitialScenario {
	@Test
	public void test0() throws Throwable {
		int[] intArray0 = new int[6];
		intArray0[1] = 1;
		intArray0[3] = 2;
		intArray0[5] = 3;
		IntArrayList intArrayList0 = new IntArrayList(intArray0);
		intArrayList0.fillFromToWith(2, 4, 6);
	}
}
