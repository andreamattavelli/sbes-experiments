package colt;

import org.junit.Test;

import cern.colt.map.OpenDoubleIntHashMap;

public class InitialScenario {
	@Test
	public void test0() {
		OpenDoubleIntHashMap openDoubleIntHashMap0 = new OpenDoubleIntHashMap();
		openDoubleIntHashMap0.put(0.0, 1);
		openDoubleIntHashMap0.put(2.0, 0);
		openDoubleIntHashMap0.put(5.4, 2);
		openDoubleIntHashMap0.put(3945.0, 0);
		openDoubleIntHashMap0.put(1.0, 9837492);
		boolean boolean0 = openDoubleIntHashMap0.removeKey(3945);
	}
}
