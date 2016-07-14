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
		boolean boolean1 = openIntObjectHashMap0
				.containsValue(openIntObjectHashMap0);
	}

	@Test
	public void test1() throws Throwable {
		OpenIntObjectHashMap openIntObjectHashMap0 = new OpenIntObjectHashMap(
				591);
		boolean boolean0 = openIntObjectHashMap0.put((-117),
				openIntObjectHashMap0);
		boolean boolean2 = openIntObjectHashMap0.containsValue(new Object());
	}
}
