package colt;

import org.junit.Test;

import cern.colt.map.OpenLongObjectHashMap;

public class AbstractLongObjectMapTest {
	@Test
	public void test0() throws Throwable {
		OpenLongObjectHashMap openLongObjectHashMap0 = new OpenLongObjectHashMap();
		openLongObjectHashMap0.put(23L, "asdf");
		openLongObjectHashMap0.put(343L, "fh45");
		openLongObjectHashMap0.put(223453L, "asdf");
		openLongObjectHashMap0.put(233333L, "asdf");
		long long0 = openLongObjectHashMap0.keyOf("asdf");
	}
}