package colt;

import org.junit.Test;

import cern.colt.list.IntArrayList;

public class InitialScenario {
	@Test
	public void test0() {
		IntArrayList intArrayList0 = new IntArrayList();
		intArrayList0.add(1);
		boolean element1 = intArrayList0.contains(0);
	}

	@Test
	public void test1() {
		IntArrayList intArrayList1 = new IntArrayList();
		intArrayList1.add(0);
		boolean element2 = intArrayList1.contains(0);
	}
}
