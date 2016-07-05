package colt;

import org.junit.Test;

import cern.colt.list.IntArrayList;

public class IntArrayListTest {
	@Test
	public void test0() {
		IntArrayList intArrayList0 = new IntArrayList();
		IntArrayList intArrayList1 = new IntArrayList();
		intArrayList1.add(1);
		intArrayList1.add(2);
		intArrayList1.add(3);
		intArrayList1.add(3);
		intArrayList1.add(2);
		intArrayList1.add(1);
		intArrayList0.addAllOfFromTo(intArrayList1, 1, 4);
	}
}