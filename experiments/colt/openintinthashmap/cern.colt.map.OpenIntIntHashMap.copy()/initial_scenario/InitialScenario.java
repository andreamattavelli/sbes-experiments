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
		OpenIntIntHashMap openIntIntHashMap1 = (OpenIntIntHashMap) openIntIntHashMap0
				.copy();
	}
}