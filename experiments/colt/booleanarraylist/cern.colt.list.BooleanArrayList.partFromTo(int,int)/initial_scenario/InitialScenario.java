package colt;

import org.junit.Test;

import cern.colt.list.AbstractBooleanList;
import cern.colt.list.BooleanArrayList;

public class AbstractBooleanListTest {
	@Test(timeout = 4000)
	public void test0() throws Throwable {
		boolean[] booleanArray0 = new boolean[6];
		booleanArray0[2] = true;
		BooleanArrayList booleanArrayList0 = new BooleanArrayList(booleanArray0);
		AbstractBooleanList abstractBooleanList0 = booleanArrayList0.partFromTo(2, 4);
	}
}