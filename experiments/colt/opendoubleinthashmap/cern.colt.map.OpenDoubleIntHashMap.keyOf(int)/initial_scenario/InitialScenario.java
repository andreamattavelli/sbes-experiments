package colt;

import org.junit.Test;

import cern.colt.map.OpenDoubleIntHashMap;

public class InitialScenario {
	@Test
	public void test0() {
		OpenDoubleIntHashMap openDoubleIntHashMap0 = new OpenDoubleIntHashMap(
				1427, Double.NaN, Double.NaN);
		openDoubleIntHashMap0.put(0.0, 0);
		double double0 = openDoubleIntHashMap0.keyOf(0);
	}

	@Test
	public void test01() throws Throwable {
		OpenDoubleIntHashMap openDoubleIntHashMap0 = new OpenDoubleIntHashMap();
		double double0 = openDoubleIntHashMap0.keyOf(687);
	}
}
