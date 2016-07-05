package colt;

import org.junit.Test;

import cern.colt.map.OpenDoubleIntHashMap;

public class AbstractDoubleIntMapTest {
	@Test
	public void test0() throws Throwable {
		OpenDoubleIntHashMap openDoubleIntHashMap0 = new OpenDoubleIntHashMap();
		openDoubleIntHashMap0.put(0, 0);
		boolean boolean0 = openDoubleIntHashMap0.containsValue(0);
	}

	@Test
	public void test1() throws Throwable {
		OpenDoubleIntHashMap openDoubleIntHashMap0 = new OpenDoubleIntHashMap();
		openDoubleIntHashMap0.put(0, 0);
		boolean boolean1 = openDoubleIntHashMap0.containsValue(5);
	}
}