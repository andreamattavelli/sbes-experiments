package colt;

import org.junit.Test;

import cern.colt.list.MinMaxNumberList;

public class InitialScenario {
	@Test
	public void test0() throws Throwable {
		MinMaxNumberList minMaxNumberList0 = new MinMaxNumberList(
				121645100408832000L, 121645100408832000L, (-66));
		minMaxNumberList0.trimToSize();
	}
}
