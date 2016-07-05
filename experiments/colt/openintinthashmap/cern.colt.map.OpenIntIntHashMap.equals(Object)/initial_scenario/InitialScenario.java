package colt;

import org.junit.Test;

import cern.colt.map.OpenIntIntHashMap;

public class AbstractIntIntMapTest {
	@Test
	public void test0() throws Throwable {
		OpenIntIntHashMap openIntIntHashMap0 = new OpenIntIntHashMap(2659);
		openIntIntHashMap0.put(1234, (126));
		openIntIntHashMap0.put(4232, (-345));
		openIntIntHashMap0.put(234, (34126));
		boolean boolean0 = openIntIntHashMap0.equals(openIntIntHashMap0);
	}

	@Test
	public void test1() throws Throwable {
		OpenIntIntHashMap openIntIntHashMap0 = new OpenIntIntHashMap(2659);
		openIntIntHashMap0.put(1234, (126));
		openIntIntHashMap0.put(4232, (-345));
		openIntIntHashMap0.put(234, (34126));
		OpenIntIntHashMap openIntIntHashMap1 = new OpenIntIntHashMap();
		boolean boolean1 = openIntIntHashMap0.equals(openIntIntHashMap1);
	}
}