package colt;

import org.junit.Test;

import cern.colt.list.IntArrayList;

public class IntArrayListTest {
	@Test(timeout = 4000)
	public void test0() throws Throwable {
		int[] intArray0 = new int[7];
		intArray0[2] = 1;
		intArray0[3] = 2;
		IntArrayList intArrayList0 = new IntArrayList(intArray0);
		intArrayList0.reverse();
	}
}