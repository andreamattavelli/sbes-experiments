package colt;

import org.junit.Test;

import cern.colt.list.MinMaxNumberList;

public class InitialScenario {
	@Test
	public void test0() throws Throwable {
		MinMaxNumberList minMaxNumberList0 = new MinMaxNumberList((-677L),
				(-3615L), 0);
		minMaxNumberList0.add(1234);
		minMaxNumberList0.add(1234);
		minMaxNumberList0.add(1234);
		minMaxNumberList0.add(1234);
		minMaxNumberList0.add(1234);
		minMaxNumberList0.setSize(2);
	}
}
