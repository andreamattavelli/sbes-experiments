package colt;

import org.junit.Test;

import cern.colt.list.MinMaxNumberList;

public class InitialScenario {
	@Test(timeout = 4000)
	public void test0() throws Throwable {
		MinMaxNumberList minMaxNumberList0 = new MinMaxNumberList((-1484L), 0L,
				857);
		minMaxNumberList0.add(1066L);
		minMaxNumberList0.add(1066L);
		minMaxNumberList0.add(1066L);
		minMaxNumberList0.add(52345);
		minMaxNumberList0.add(1066L);
		minMaxNumberList0.add(1066L);
		minMaxNumberList0.times(75);
		int int0 = minMaxNumberList0.size();
	}
}
