package colt;

import org.junit.Test;

import cern.colt.map.OpenLongObjectHashMap;

public class InitialScenario {
	@Test
	public void test0() throws Throwable {
		OpenLongObjectHashMap openLongObjectHashMap0 = new OpenLongObjectHashMap();
		openLongObjectHashMap0.put(23L, "asdf");
		openLongObjectHashMap0.put(343L, "fh45");
		openLongObjectHashMap0.put(223453L, "asdf");
		openLongObjectHashMap0.put(233333L, "asdf");
		boolean boolean0 = openLongObjectHashMap0.isEmpty();
		openLongObjectHashMap0.clear();
		boolean boolean1 = openLongObjectHashMap0.isEmpty();
	}
	
	@Test
	public void test1() throws Throwable {
		OpenLongObjectHashMap openLongObjectHashMap0 = new OpenLongObjectHashMap();
		openLongObjectHashMap0.put(23L, "asdf");
		openLongObjectHashMap0.put(343L, "fh45");
		openLongObjectHashMap0.put(223453L, "asdf");
		openLongObjectHashMap0.put(233333L, "asdf");
		openLongObjectHashMap0.clear();
		boolean boolean1 = openLongObjectHashMap0.isEmpty();
	}
}
