package colt;

import org.junit.Test;

import cern.colt.list.IntArrayList;

public class InitialScenario {
	@Test
	public void test0() throws Throwable {
		int[] intArray0 = new int[6];
		intArray0[2] = 4;
		IntArrayList intArrayList0 = new IntArrayList(intArray0);
		IntArrayList intArrayList1 = (IntArrayList) intArrayList0.partFromTo(2,
				4);
	}
}
