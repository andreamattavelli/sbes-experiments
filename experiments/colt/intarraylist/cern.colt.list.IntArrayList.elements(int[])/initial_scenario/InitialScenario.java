package colt;

import org.junit.Test;

import cern.colt.list.AbstractIntList;
import cern.colt.list.IntArrayList;

public class IntArrayListTest {
	@Test(timeout = 4000)
	public void test0() {
		int[] intArray0 = new int[6];
		intArray0[1] = 1;
		intArray0[3] = 2;
		intArray0[5] = 3;
		IntArrayList intArrayList0 = new IntArrayList();
		AbstractIntList abstractIntList0 = intArrayList0.elements(intArray0);
	}
}