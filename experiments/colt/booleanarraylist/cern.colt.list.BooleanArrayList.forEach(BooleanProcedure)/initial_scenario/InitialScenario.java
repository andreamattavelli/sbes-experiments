package colt;

import org.junit.Test;

import cern.colt.function.BooleanProcedure;
import cern.colt.list.BooleanArrayList;

public class AbstractBooleanListTest {
	@Test(timeout = 4000)
	public void test0() throws Throwable {
		BooleanArrayList booleanArrayList0 = new BooleanArrayList();
		booleanArrayList0.forEach((BooleanProcedure) null);
	}
}