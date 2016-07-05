package colt;

import org.junit.Test;

import cern.colt.list.DistinctNumberList;

public class DistinctNumberListTest {
	@Test(timeout = 4000)
	public void test0() throws Throwable {
		long[] longArray0 = new long[5];
		longArray0[4] = 232L;
		DistinctNumberList distinctNumberList0 = new DistinctNumberList(
				longArray0, 63);
		distinctNumberList0.setQuick(63, 232L);
	}
}