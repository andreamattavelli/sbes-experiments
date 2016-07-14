package colt;

import org.junit.Test;

import cern.colt.map.OpenLongObjectHashMap;

public class InitialScenario {
	@Test
	public void test0() throws Throwable {
		OpenLongObjectHashMap openLongObjectHashMap0 = new OpenLongObjectHashMap();
		Object object0 = openLongObjectHashMap0.get(0L);
	}

	@Test
	public void test1() throws Throwable {
		OpenLongObjectHashMap openLongObjectHashMap0 = new OpenLongObjectHashMap();
		openLongObjectHashMap0.put(23L, "asdf");
		Object object1 = openLongObjectHashMap0.get(23L);
	}
}
