package colt;

import org.junit.Test;

import cern.colt.map.OpenLongObjectHashMap;

public class InitialScenario {
	@Test
	public void test0() throws Throwable {
		OpenLongObjectHashMap openLongObjectHashMap0 = new OpenLongObjectHashMap();
		boolean boolean0 = openLongObjectHashMap0.put((-1145L),
				openLongObjectHashMap0);
		String object0 = "object";
		boolean boolean1 = openLongObjectHashMap0.put((-1145L), object0);
		boolean boolean2 = openLongObjectHashMap0.containsValue(object0);
	}
}
