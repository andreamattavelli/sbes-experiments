package colt;

import org.junit.Test;

import cern.colt.list.DistinctNumberList;

public class DistinctNumberListTest {
	@Test(timeout = 4000)
	public void test0() throws Throwable {
		long[] longArray0 = new long[1];
		longArray0[0] = 10;
		DistinctNumberList distinctNumberList0 = new DistinctNumberList(
				longArray0, 123);
		distinctNumberList0.add(10L);
	}
}