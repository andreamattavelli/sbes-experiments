package colt;

import org.junit.Test;

import cern.colt.list.MinMaxNumberList;

public class AbstractMinMaxNumberListTest {
	@Test(timeout = 4000)
	public void test0() throws Throwable {
		MinMaxNumberList minMaxNumberList0 = new MinMaxNumberList((-677L),
				(-3615L), 0);
		minMaxNumberList0.add(2202L);
		minMaxNumberList0.add(22345L);
		minMaxNumberList0.add(1235345);
		minMaxNumberList0.add(1223);
		minMaxNumberList0.add(123);
		minMaxNumberList0.add(36568);
		minMaxNumberList0.mergeSortFromTo(0, 0);
	}
}