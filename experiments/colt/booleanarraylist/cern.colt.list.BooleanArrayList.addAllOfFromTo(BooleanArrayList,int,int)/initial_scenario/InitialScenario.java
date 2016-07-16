package colt;

import org.junit.Test;

import cern.colt.list.BooleanArrayList;

public class InitialScenario {
	@Test
	public void test1() {
		BooleanArrayList booleanArrayList0 = new BooleanArrayList();
		BooleanArrayList booleanArrayList1 = new BooleanArrayList();
		booleanArrayList1.add(true);
		booleanArrayList1.add(true);
		booleanArrayList1.add(false);
		booleanArrayList1.add(false);
		booleanArrayList1.add(true);
		booleanArrayList1.add(true);
		booleanArrayList0.addAllOfFromTo(booleanArrayList1, 1, 4);
	}
}
