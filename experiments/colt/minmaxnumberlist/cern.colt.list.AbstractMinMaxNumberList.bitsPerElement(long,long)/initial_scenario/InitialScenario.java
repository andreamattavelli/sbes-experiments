package colt;

import org.junit.Test;

import cern.colt.list.MinMaxNumberList;

public class InitialScenario {
	@Test(timeout = 4000)
	public void test0() throws Throwable {
		MinMaxNumberList minMaxNumberList0 = new MinMaxNumberList((-98L),
				4016L, 65);
		minMaxNumberList0.add(345234);
		minMaxNumberList0.add(15);
		minMaxNumberList0.add(12);
		minMaxNumberList0.add(173);
		int int0 = minMaxNumberList0.bitsPerElement(479001602L, 479001602L);
	}
}
