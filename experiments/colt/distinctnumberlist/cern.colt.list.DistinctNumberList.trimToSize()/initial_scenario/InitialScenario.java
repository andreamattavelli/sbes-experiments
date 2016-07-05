package colt;

import org.junit.Test;

import cern.colt.list.DistinctNumberList;

public class DistinctNumberListTest {
	@Test(timeout = 4000)
	public void test0() throws Throwable {
		long[] longArray0 = new long[1];
		DistinctNumberList distinctNumberList0 = new DistinctNumberList(
				longArray0, 1);
		distinctNumberList0.trimToSize();
	}
}