package colt;

import org.junit.Test;

import cern.colt.map.OpenDoubleIntHashMap;

public class InitialScenario {
	@Test(timeout = 4000)
	public void test0() {
		OpenDoubleIntHashMap openDoubleIntHashMap0 = new OpenDoubleIntHashMap();
		openDoubleIntHashMap0.put(2.0,3);
		int int0 = openDoubleIntHashMap0.get(3.0);
		int int1 = openDoubleIntHashMap0.get(2.0);
	}
}
