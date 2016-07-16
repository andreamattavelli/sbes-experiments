package colt;

import org.junit.Test;

import cern.colt.map.OpenLongObjectHashMap;

public class InitialScenario {
	@Test
	public void test0() throws Throwable {
		OpenLongObjectHashMap openLongObjectHashMap0 = new OpenLongObjectHashMap();
		Object object0 = new Object();
		openLongObjectHashMap0.put(0L, object0);
		OpenLongObjectHashMap openLongObjectHashMap1 = new OpenLongObjectHashMap();
		boolean boolean0 = openLongObjectHashMap0
				.equals(openLongObjectHashMap1);
	}

	@Test
	public void test1() throws Throwable {
		OpenLongObjectHashMap openLongObjectHashMap0 = new OpenLongObjectHashMap();
		Object object0 = new Object();
		openLongObjectHashMap0.put(0L, object0);
		OpenLongObjectHashMap openLongObjectHashMap1 = new OpenLongObjectHashMap();
		boolean boolean1 = openLongObjectHashMap0
				.equals(openLongObjectHashMap0);
	}
}
