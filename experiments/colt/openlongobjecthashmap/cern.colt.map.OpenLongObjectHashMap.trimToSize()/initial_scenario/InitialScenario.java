package colt;

import org.junit.Test;

import cern.colt.map.OpenLongObjectHashMap;

public class InitialScenario {
	@Test
	public void test0() throws Throwable {
		OpenLongObjectHashMap openLongObjectHashMap0 = new OpenLongObjectHashMap();
		boolean boolean0 = openLongObjectHashMap0.put(23L, "asdf");
		boolean boolean1 = openLongObjectHashMap0.put(343L, "fh45");
		boolean boolean2 = openLongObjectHashMap0.put(223453L, "asdf");
		boolean boolean3 = openLongObjectHashMap0.put(233333L, "asdf");
		openLongObjectHashMap0.ensureCapacity(12312);
		openLongObjectHashMap0.trimToSize();
	}
}
