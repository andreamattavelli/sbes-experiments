package colt;

import org.junit.Test;

import cern.colt.list.BooleanArrayList;

public class AbstractBooleanListTest {
	@Test(timeout = 4000)
	public void test0() throws Throwable {
		BooleanArrayList booleanArrayList0 = new BooleanArrayList(
				new boolean[10]);
		booleanArrayList0.set(1, true);
		booleanArrayList0.set(5, false);
		booleanArrayList0.set(8, true);
		booleanArrayList0.set(1, false);
		booleanArrayList0.set(2, true);
		boolean[] booleanArray = booleanArrayList0.elements();
	}
}