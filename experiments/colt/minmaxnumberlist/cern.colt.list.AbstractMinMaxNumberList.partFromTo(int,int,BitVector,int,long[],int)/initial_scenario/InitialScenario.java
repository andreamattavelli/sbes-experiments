package colt;

import java.util.ArrayList;

import org.junit.Test;

public class InitialScenario {
	@Test
	public void test0() throws Throwable {
		long[] longArray0 = new long[9];
      DistinctNumberList distinctNumberList0 = new DistinctNumberList(longArray0, 0);
      MinMaxNumberList minMaxNumberList0 = distinctNumberList0.elements;
      BitVector bitVector0 = minMaxNumberList0.toBitVector();
        minMaxNumberList0.partFromTo(2, 2458, bitVector0, 0, longArray0, 0);
	}
}
