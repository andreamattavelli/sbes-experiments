package colt;

import org.junit.Test;

import cern.colt.list.IntArrayList;
import cern.colt.map.OpenIntIntHashMap;

public class AbstractIntIntMapTest {
	@Test
	public void test0() throws Throwable {
		OpenIntIntHashMap openIntIntHashMap0 = new OpenIntIntHashMap();
		openIntIntHashMap0.put(220, 220);
		openIntIntHashMap0.put(23451, 156461);
		openIntIntHashMap0.put(222, 1961);
		IntArrayList intArrayList0 = new IntArrayList(0);
		openIntIntHashMap0.pairsSortedByValue(intArrayList0, intArrayList0);
	}
}