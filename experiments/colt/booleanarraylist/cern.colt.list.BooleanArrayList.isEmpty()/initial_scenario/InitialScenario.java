package colt;

import org.junit.Test;

import cern.colt.list.BooleanArrayList;

public class InitialScenario {
	@Test
	public void test0() throws Throwable {
		BooleanArrayList booleanArrayList0 = new BooleanArrayList();
		boolean boolean0 = booleanArrayList0.isEmpty();
		booleanArrayList0.setSize(3);
		booleanArrayList0.add(true);
		booleanArrayList0.add(true);
		booleanArrayList0.add(false);
	}

	@Test
	public void test1() throws Throwable {
		BooleanArrayList booleanArrayList0 = new BooleanArrayList();
		booleanArrayList0.setSize(3);
		booleanArrayList0.add(true);
		booleanArrayList0.add(false);
		booleanArrayList0.add(true);
		boolean boolean1 = booleanArrayList0.isEmpty();
	}
}
