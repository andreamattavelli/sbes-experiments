package colt;

import org.junit.Test;

import cern.colt.list.BooleanArrayList;

public class InitialScenario {
	@Test
	public void test0() throws Throwable {
		BooleanArrayList booleanArrayList0 = new BooleanArrayList();
		booleanArrayList0.setSize(10);
		int int0 = booleanArrayList0.indexOf(false);
	}

	@Test
	public void test1() throws Throwable {
		BooleanArrayList booleanArrayList0 = new BooleanArrayList();
		boolean[] booleanArray0 = new boolean[5];
		booleanArray0[1] = true;
		booleanArray0[3] = true;
		BooleanArrayList booleanArrayList1 = (BooleanArrayList) booleanArrayList0
				.elements(booleanArray0);
		int int0 = booleanArrayList1.indexOf(true);
	}
}
