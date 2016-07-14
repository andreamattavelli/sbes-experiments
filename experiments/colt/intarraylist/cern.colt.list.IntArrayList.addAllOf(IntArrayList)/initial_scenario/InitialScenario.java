package colt;

import org.junit.Test;

import cern.colt.list.IntArrayList;

public class InitialScenario {
	@Test(timeout = 4000)
	public void test0() throws Throwable {
		IntArrayList intArrayList0 = new IntArrayList();
		intArrayList0.setSize(2234);
		intArrayList0.add(8678);
		intArrayList0.add(1232342);
		intArrayList0.add(456);
		intArrayList0.add(234);
		intArrayList0.add(786);
		IntArrayList intArrayList1 = new IntArrayList();
		intArrayList1.add(234);
		intArrayList1.addAllOf(intArrayList0);
		intArrayList0.add(345);
	}
}
