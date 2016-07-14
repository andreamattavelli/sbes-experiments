package colt;

import org.junit.Test;

import cern.colt.list.BooleanArrayList;

public class InitialScenario {
	@Test
	public void test0() {
		boolean[] booleanArray0 = new boolean[10];
		booleanArray0[0] = true;
		booleanArray0[3] = true;
		booleanArray0[4] = true;
		booleanArray0[5] = true;
		booleanArray0[6] = true;
		booleanArray0[9] = true;
		BooleanArrayList booleanArrayList0 = new BooleanArrayList(booleanArray0);
		booleanArrayList0.binarySearchFromTo(false, (1), (9));
	}
}
