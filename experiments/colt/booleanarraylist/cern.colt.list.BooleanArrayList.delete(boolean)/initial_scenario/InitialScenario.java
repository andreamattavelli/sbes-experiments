package colt;

import org.junit.Test;

import cern.colt.list.BooleanArrayList;

public class InitialScenario {
	@Test(timeout = 4000)
	public void test0() throws Throwable {
		boolean[] booleanArray0 = new boolean[3];
		booleanArray0[0] = true;
		booleanArray0[2] = true;
		BooleanArrayList booleanArrayList0 = new BooleanArrayList(booleanArray0);
		booleanArrayList0.delete(true);
	}
	
	@Test(timeout = 4000)
	public void test1() throws Throwable {
		boolean[] booleanArray0 = new boolean[3];
		booleanArray0[0] = true;
		booleanArray0[2] = true;
		BooleanArrayList booleanArrayList0 = new BooleanArrayList(booleanArray0);
		booleanArrayList0.delete(false);
	}
}
