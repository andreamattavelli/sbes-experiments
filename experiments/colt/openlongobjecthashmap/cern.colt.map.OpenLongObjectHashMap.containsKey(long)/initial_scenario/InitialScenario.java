package colt;

import org.junit.Test;

import cern.colt.map.OpenLongObjectHashMap;

public class AbstractLongObjectMapTest {
	@Test
	public void test0() throws Throwable {
		OpenLongObjectHashMap openLongObjectHashMap0 = new OpenLongObjectHashMap();
		boolean boolean0 = openLongObjectHashMap0.put((-1145L),
				openLongObjectHashMap0);
		boolean boolean1 = openLongObjectHashMap0.containsKey((-1145L));
	}

	@Test
	public void test1() throws Throwable {
		OpenLongObjectHashMap openLongObjectHashMap0 = new OpenLongObjectHashMap();
		boolean boolean0 = openLongObjectHashMap0.put((-1145L),
				openLongObjectHashMap0);
		boolean boolean2 = openLongObjectHashMap0.containsKey(2342L);
	}
}