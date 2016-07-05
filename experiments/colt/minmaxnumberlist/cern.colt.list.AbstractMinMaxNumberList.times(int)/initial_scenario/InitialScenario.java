package colt;

import org.junit.Test;

import cern.colt.bitvector.BitVector;
import cern.colt.list.MinMaxNumberList;

public class AbstractMinMaxNumberListTest {
	@Test(timeout = 4000)
	public void test0() throws Throwable {
		MinMaxNumberList minMaxNumberList0 = new MinMaxNumberList((-1484L), 0L,
				857);
		minMaxNumberList0.add(1066L);
		minMaxNumberList0.add(1066L);
		minMaxNumberList0.add(35234);
		minMaxNumberList0.add(1234);
		minMaxNumberList0.add(1234);
		minMaxNumberList0.add(3454);
		BitVector bitVector0 = minMaxNumberList0.toBitVector();
	}
}