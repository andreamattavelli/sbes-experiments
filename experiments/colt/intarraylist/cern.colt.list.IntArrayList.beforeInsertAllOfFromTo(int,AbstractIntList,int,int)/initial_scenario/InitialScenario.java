package colt;

import org.junit.Test;

import cern.colt.list.IntArrayList;

public class InitialScenario {
	@Test(timeout = 4000)
	public void test0() {
		IntArrayList intArrayList0 = new IntArrayList();
		intArrayList0.setSize(100);
		IntArrayList intArrayList1 = new IntArrayList();
		intArrayList1.add(1);
		intArrayList1.add(2);
		intArrayList1.add(3);
		intArrayList1.add(3);
		intArrayList1.add(2);
		intArrayList1.add(1);
		intArrayList0.beforeInsertAllOfFromTo(2, intArrayList1, 2, 4);
	}
}
