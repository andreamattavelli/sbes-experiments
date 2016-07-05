package colt;

import org.junit.Test;

import cern.colt.list.IntArrayList;

public class IntArrayListTest {
	@Test(timeout = 4000)
	public void test0() throws Throwable {
		IntArrayList intArrayList0 = new IntArrayList();
		intArrayList0.setSize(10);
		int int0 = intArrayList0.indexOf(0);
	}

	@Test(timeout = 4000)
	public void test1() throws Throwable {
		IntArrayList intArrayList0 = new IntArrayList();
		int[] intArray0 = new int[5];
		intArray0[1] = 1;
		IntArrayList intArrayList1 = (IntArrayList) intArrayList0
				.elements(intArray0);
		int int0 = intArrayList1.indexOf(1);
	}
}
