package colt;

import org.junit.Test;

import cern.colt.list.BooleanArrayList;

public class InitialScenario {
	@Test(timeout = 4000)
	public void test1() {
		BooleanArrayList booleanArrayList0 = new BooleanArrayList();
		booleanArrayList0.setSize(3);
		BooleanArrayList booleanArrayList1 = new BooleanArrayList();
		booleanArrayList1.add(true);
		booleanArrayList1.add(true);
		booleanArrayList1.add(false);
		booleanArrayList1.add(false);
		booleanArrayList1.add(true);
		booleanArrayList1.add(true);
		booleanArrayList0.beforeInsertAllOfFromTo(2, booleanArrayList1, 1, 4);
	}
}
