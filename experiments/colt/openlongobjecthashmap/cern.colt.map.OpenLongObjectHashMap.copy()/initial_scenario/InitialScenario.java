package colt;
import org.junit.Test;

import cern.colt.map.OpenLongObjectHashMap;

public class InitialScenario {
	@Test
	public void test0() throws Throwable {
		OpenLongObjectHashMap openLongObjectHashMap0 = new OpenLongObjectHashMap();
		Integer integer0 = new Integer((-1));
		openLongObjectHashMap0.put((-1040L), integer0);
		OpenLongObjectHashMap openLongObjectHashMap1 = (OpenLongObjectHashMap) openLongObjectHashMap0
				.copy();
	}
}
