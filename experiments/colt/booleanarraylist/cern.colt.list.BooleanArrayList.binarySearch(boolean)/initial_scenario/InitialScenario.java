package colt;

import org.junit.Test;

import cern.colt.list.BooleanArrayList;

public class InitialScenario {
	@Test(timeout = 4000)
	public void test0() throws Throwable {
		boolean[] booleanArray0 = new boolean[13];
		booleanArray0[1] = true;
		booleanArray0[2] = true;
		booleanArray0[3] = false;
		booleanArray0[4] = true;
		booleanArray0[5] = false;
		booleanArray0[6] = true;
		booleanArray0[7] = false;
		booleanArray0[8] = false;
		booleanArray0[9] = true;
		booleanArray0[10] = false;
		booleanArray0[11] = true;
		booleanArray0[12] = true;
		BooleanArrayList booleanArrayList0 = new BooleanArrayList(booleanArray0);
		booleanArrayList0.binarySearch(true);
	}
}
