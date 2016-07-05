package colt;

import org.junit.Test;

import cern.colt.map.OpenIntObjectHashMap;

public class AbstractIntObjectMapTest {
	@Test
	public void test0() throws Throwable {
		OpenIntObjectHashMap openIntObjectHashMap0 = new OpenIntObjectHashMap(
				591);
		boolean boolean0 = openIntObjectHashMap0.put((-117),
				openIntObjectHashMap0);
		openIntObjectHashMap0.put(234263, "asdasf");
		boolean boolean1 = openIntObjectHashMap0.isEmpty();
	}

	@Test
	public void test1() throws Throwable {
		OpenIntObjectHashMap openIntObjectHashMap0 = new OpenIntObjectHashMap(
				591);
		boolean boolean0 = openIntObjectHashMap0.put((-117),
				openIntObjectHashMap0);
		openIntObjectHashMap0.put(234263, "asdasf");
		openIntObjectHashMap0.clear();
		boolean boolean2 = openIntObjectHashMap0.isEmpty();
	}
}