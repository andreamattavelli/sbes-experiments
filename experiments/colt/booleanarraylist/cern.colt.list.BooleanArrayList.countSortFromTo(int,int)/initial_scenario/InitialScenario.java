package colt;

import org.junit.Test;

import cern.colt.list.BooleanArrayList;

public class InitialScenario {
	@Test(timeout = 4000)
	public void test1() throws Throwable {
		BooleanArrayList booleanArrayList0 = new BooleanArrayList();
		boolean[] booleanArray1 = new boolean[27];
		booleanArray1[2] = true;
		booleanArray1[5] = true;
		booleanArray1[7] = true;
		booleanArrayList0.elements(booleanArray1);
		booleanArrayList0.countSortFromTo(3, 7);
	}
}
