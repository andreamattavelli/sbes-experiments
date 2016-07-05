package colt;

import org.junit.Test;

import cern.colt.map.OpenIntIntHashMap;

public class AbstractIntIntMapTest {
	@Test
	public void test0() throws Throwable {
		OpenIntIntHashMap openIntIntHashMap0 = new OpenIntIntHashMap(2659);
		openIntIntHashMap0.put(1, 1734);
		boolean boolean0 = openIntIntHashMap0.isEmpty();
	}
	@Test
	public void test1() throws Throwable {
		OpenIntIntHashMap openIntIntHashMap0 = new OpenIntIntHashMap(2659);
		openIntIntHashMap0.put(1, 1734);
		openIntIntHashMap0.clear();
		boolean boolean1 = openIntIntHashMap0.isEmpty();
	}
}