package colt;

import org.junit.Test;

import cern.colt.list.DistinctNumberList;

public class InitialScenario {
	@Test(timeout = 4000)
	public void test0() throws Throwable {
		long[] longArray0 = new long[10];
		longArray0[0] = 1234;
		longArray0[1] = 12345;
		longArray0[2] = 123456;
		longArray0[3] = 2341234L;
		longArray0[4] = 23452345L;
		longArray0[5] = 2352345L;
		longArray0[6] = 235245L;
		longArray0[7] = 132412L;
		longArray0[8] = 1234L;
		DistinctNumberList distinctNumberList0 = new DistinctNumberList(longArray0, 10);
		distinctNumberList0.add(1234L);
		distinctNumberList0.add(2341234L);
		distinctNumberList0.add(123456);
		distinctNumberList0.add(12345);
		distinctNumberList0.removeFromTo(1, 2);
	}
}
