package colt;

import java.util.ArrayList;

import org.junit.Test;

import cern.colt.list.BooleanArrayList;

public class InitialScenario {
	@Test(timeout = 4000)
	public void test0() throws Throwable {
		boolean[] booleanArray0 = new boolean[6];
		booleanArray0[1] = true;
		booleanArray0[3] = true;
		booleanArray0[5] = true;
		BooleanArrayList booleanArrayList0 = new BooleanArrayList(booleanArray0);
		ArrayList<Boolean> arrayList0 = booleanArrayList0.toList();
	}
}
