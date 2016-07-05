package colt;

import org.junit.Test;

import cern.colt.list.IntArrayList;

public class IntArrayListTest {
	@Test(timeout = 4000)
	public void test0() {
		int[] intArray0 = new int[5];
		intArray0[0] = 1;
		intArray0[1] = 2;
		intArray0[2] = 2;
		intArray0[3] = 2;
		intArray0[4] = 3;
		IntArrayList intArrayList0 = new IntArrayList(intArray0);
		int element0 = intArrayList0.binarySearchFromTo(2, (1), (4));
	}
}
