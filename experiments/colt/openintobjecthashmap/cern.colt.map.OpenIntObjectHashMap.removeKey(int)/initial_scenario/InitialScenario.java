package colt;

import org.junit.Test;

import cern.colt.map.OpenIntObjectHashMap;

public class InitialScenario {
	@Test
	public void test0() throws Throwable {
		OpenIntObjectHashMap openIntObjectHashMap0 = new OpenIntObjectHashMap();
		openIntObjectHashMap0.put(0, (Object) null);
		openIntObjectHashMap0.put(234263, "asdasf");
		openIntObjectHashMap0.put(285678263, "gh6hhh");
		openIntObjectHashMap0.put(2123, "56yh56h");
		boolean boolean0 = openIntObjectHashMap0.removeKey(0);
	}
}
