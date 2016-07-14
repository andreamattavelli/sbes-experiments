package colt;

import org.junit.Test;

import cern.colt.list.BooleanArrayList;

public class InitialScenario {
	@Test(timeout = 4000)
	public void test0() {
		BooleanArrayList booleanArrayList1 = new BooleanArrayList();
		booleanArrayList1.add(false);
		booleanArrayList1.contains(true);
	}

	@Test(timeout = 4000)
	public void test1() {
		BooleanArrayList booleanArrayList0 = new BooleanArrayList();
		booleanArrayList0.add(true);
		booleanArrayList0.contains(true);
	}
}
