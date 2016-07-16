package colt;

import org.junit.Test;

import cern.colt.map.OpenIntIntHashMap;

public class InitialScenario {
	@Test
	public void test0() throws Throwable  {
            OpenIntIntHashMap openIntIntHashMap0 = new OpenIntIntHashMap(2659);
            openIntIntHashMap0.put(1234, (126));
            openIntIntHashMap0.put(4232, (-345));
            openIntIntHashMap0.put(234, (34126));
            openIntIntHashMap0.put(12234, (-2126));
            int int0 = openIntIntHashMap0.get((234));
	}
}
