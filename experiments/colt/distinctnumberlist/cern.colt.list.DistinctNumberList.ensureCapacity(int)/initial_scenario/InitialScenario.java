package colt;

import org.junit.Test;

import cern.colt.list.DistinctNumberList;

public class InitialScenario {
	@Test(timeout = 4000)
	public void test0() throws Throwable {
		long[] longArray0 = new long[7];
		DistinctNumberList distinctNumberList0 = new DistinctNumberList(
				longArray0, 3);
		distinctNumberList0.ensureCapacity(120);
	}
}
