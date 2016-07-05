package colt;

import org.junit.Test;

import cern.colt.list.MinMaxNumberList;

public class AbstractMinMaxNumberListTest {
	@Test(timeout = 4000)
	public void test0() throws Throwable {
		MinMaxNumberList minMaxNumberList0 = new MinMaxNumberList(1000L, 1000L,
				12341);
		long[] longArray0 = new long[100];
		longArray0[5] = 10;
		longArray0[7] = 2345;
		longArray0[9] = 2345;
		longArray0[10] = 124;
		longArray0[13] = 14;
		longArray0[23] = 154124;
		minMaxNumberList0.addAllOfFromTo(longArray0, 7, 20);
	}
}