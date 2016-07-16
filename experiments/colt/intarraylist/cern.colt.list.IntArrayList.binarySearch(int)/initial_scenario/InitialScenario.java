package colt;

import org.junit.Test;

import cern.colt.list.IntArrayList;

public class InitialScenario {
	@Test
	public void test0() throws Throwable {
		int[] intArray0 = new int[3];
		intArray0[1] = 1;
		IntArrayList intArrayList0 = new IntArrayList(intArray0);
		int element0 = intArrayList0.binarySearch(1);
	}
}
