package colt;

import java.util.ArrayList;

import org.junit.Test;

import cern.colt.list.IntArrayList;

public class IntArrayListTest {
	@Test(timeout = 4000)
	public void test0() throws Throwable {
		int[] intArray0 = new int[6];
		intArray0[1] = 3;
		intArray0[3] = 2;
		intArray0[5] = 1;
		IntArrayList intArrayList0 = new IntArrayList(intArray0);
		ArrayList arrayList0 = intArrayList0.toList();
	}
}