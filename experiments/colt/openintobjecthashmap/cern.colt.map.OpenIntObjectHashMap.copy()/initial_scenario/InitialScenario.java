package colt;

import org.junit.Test;

import cern.colt.map.OpenIntObjectHashMap;

public class InitialScenario {
	@Test
	public void test0() throws Throwable {
		OpenIntObjectHashMap openIntObjectHashMap0 = new OpenIntObjectHashMap(
				591);
		boolean boolean0 = openIntObjectHashMap0.put((-117),
				openIntObjectHashMap0);
		openIntObjectHashMap0.put(234263, "asdasf");
		OpenIntObjectHashMap openIntObjectHashMap1 = (OpenIntObjectHashMap) openIntObjectHashMap0
				.copy();
	}
}
