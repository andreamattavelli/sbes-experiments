package colt;

import org.junit.Test;

import cern.colt.list.LongArrayList;
import cern.colt.map.OpenLongObjectHashMap;

public class InitialScenario {
	@Test
	public void test0() throws Throwable  {
           OpenLongObjectHashMap openLongObjectHashMap0 = new OpenLongObjectHashMap(1677);
	      LongArrayList longArrayList0 = openLongObjectHashMap0.keys();
	      openLongObjectHashMap0.keysSortedByValue(longArrayList0);
  }
}
