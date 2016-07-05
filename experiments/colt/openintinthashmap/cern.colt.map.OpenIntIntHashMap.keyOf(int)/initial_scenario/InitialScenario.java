package colt;

import org.junit.Test;

import cern.colt.map.OpenIntIntHashMap;

public class AbstractIntIntMapTest {
	@Test
	public void test0() throws Throwable {
		OpenIntIntHashMap openIntIntHashMap0 = new OpenIntIntHashMap(2659);
		openIntIntHashMap0.put(1234, (-2126));
		openIntIntHashMap0.put(4232, (-2126));
		openIntIntHashMap0.put(234, (-2126));
		openIntIntHashMap0.put(12234, (-2126));
		int int0 = openIntIntHashMap0.keyOf(-2126);
	}
}