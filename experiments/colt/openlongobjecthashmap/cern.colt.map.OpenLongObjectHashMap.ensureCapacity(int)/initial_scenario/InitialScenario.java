package colt;

import org.junit.Test;

import cern.colt.map.OpenLongObjectHashMap;

public class AbstractLongObjectMapTest {
	@Test
	public void test0() throws Throwable {
		OpenLongObjectHashMap openLongObjectHashMap0 = new OpenLongObjectHashMap(
				5);
		openLongObjectHashMap0.ensureCapacity(9183457);
	}
}