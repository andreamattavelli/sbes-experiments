package colt;

import java.util.ArrayList;

import org.junit.Test;

public class InitialScenario {
	@Test(timeout = 4000)
	public void test0() throws Throwable {
		long[] longArray0 = new long[8];
      longArray0[0] = 1L;
      DistinctNumberList distinctNumberList0 = new DistinctNumberList(longArray0, 10);
      long long0 = distinctNumberList0.getQuick(1);
	}
}
