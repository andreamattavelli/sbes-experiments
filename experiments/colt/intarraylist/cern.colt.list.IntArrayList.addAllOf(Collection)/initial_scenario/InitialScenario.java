package colt;

import java.util.ArrayList;

import org.junit.Test;

import cern.colt.list.IntArrayList;

public class IntArrayListTest {
	@Test(timeout = 4000)
	public void test0() throws Throwable {
		IntArrayList intArrayList0 = new IntArrayList();
		intArrayList0.setSize(3);
		ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
		arrayList0.add(1);
		arrayList0.add(2354345);
		arrayList0.add(345);
		arrayList0.add(3453453);
		arrayList0.add(2345);
		arrayList0.add(1);
		intArrayList0.addAllOf(arrayList0);
	}
}