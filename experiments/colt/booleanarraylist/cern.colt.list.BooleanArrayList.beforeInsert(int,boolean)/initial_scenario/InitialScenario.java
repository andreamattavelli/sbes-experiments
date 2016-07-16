package colt;

import org.junit.Test;

import cern.colt.list.BooleanArrayList;

public class InitialScenario {
	@Test
	public void test0() throws Throwable {
		boolean[] booleanArray0 = new boolean[2];
		BooleanArrayList booleanArrayList0 = new BooleanArrayList(booleanArray0);
		booleanArrayList0.setSize(10);
		booleanArrayList0.add(true);
		booleanArrayList0.add(false);
		booleanArrayList0.add(false);
		booleanArrayList0.add(true);
		booleanArrayList0.add(true);
		booleanArrayList0.beforeInsert(1, true);
	}
}
