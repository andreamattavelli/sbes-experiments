package colt;

import org.junit.Test;

import cern.colt.list.MinMaxNumberList;

public class AbstractMinMaxNumberListTest {
	@SuppressWarnings("deprecation")
	@Test(timeout = 4000)
	public void test0() throws Throwable {
		MinMaxNumberList minMaxNumberList0 = new MinMaxNumberList((-677L),
				(-3615L), 0);
		minMaxNumberList0.add(1234);
		minMaxNumberList0.add(4634);
		minMaxNumberList0.add(35);
		minMaxNumberList0.add(47564);
		minMaxNumberList0.add(98765);
		minMaxNumberList0.setSize(64);
		long long0 = minMaxNumberList0.xminimum();
	}
}