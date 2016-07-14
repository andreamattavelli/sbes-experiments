package colt;

import org.junit.Test;

import cern.colt.list.BooleanArrayList;

public class InitialScenario {

	@Test(timeout = 4000)
	public void test0() throws Throwable {
		boolean[] booleanArray0 = new boolean[6];
		booleanArray0[0] = true;
		BooleanArrayList booleanArrayList0 = new BooleanArrayList(booleanArray0);
		boolean boolean0 = booleanArrayList0.get(0);
	}
	@Test(timeout = 4000)
	public void test1() throws Throwable {
		boolean[] booleanArray0 = new boolean[6];
		booleanArray0[0] = true;
		BooleanArrayList booleanArrayList0 = new BooleanArrayList(booleanArray0);
		boolean boolean0 = booleanArrayList0.get(1);
	}
}
