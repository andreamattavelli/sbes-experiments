package colt;

import java.util.ArrayList;

import org.junit.Test;

public class AbstractMinMaxNumberListTest {
	@Test(timeout = 4000)
	public void test0() throws Throwable {
		long[] longArray0 = new long[7];
      DistinctNumberList distinctNumberList0 = new DistinctNumberList(longArray0, 0);
      MinMaxNumberList minMaxNumberList0 = distinctNumberList0.elements;
      minMaxNumberList0.capacity = 784;
        minMaxNumberList0.toBitVector();
	}
}