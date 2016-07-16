package colt;

import org.junit.Test;

import cern.colt.list.IntArrayList;
import cern.colt.map.OpenIntIntHashMap;

public class InitialScenario {
	@Test
	public void test0() throws Throwable {
		OpenIntIntHashMap openIntIntHashMap0 = new OpenIntIntHashMap();
		openIntIntHashMap0.put(220, 220);
		openIntIntHashMap0.put(221, 1961);
		openIntIntHashMap0.put(222, 196);
		IntArrayList intArrayList0 = openIntIntHashMap0.values();
	}
}
