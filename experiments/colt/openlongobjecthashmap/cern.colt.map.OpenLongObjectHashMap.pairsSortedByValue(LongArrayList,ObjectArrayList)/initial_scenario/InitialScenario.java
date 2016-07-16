package colt;

import org.junit.Test;

import cern.colt.list.LongArrayList;
import cern.colt.list.ObjectArrayList;
import cern.colt.map.OpenLongObjectHashMap;

public class InitialScenario {
	@Test
	public void test0() throws Throwable {
		OpenLongObjectHashMap openLongObjectHashMap0 = new OpenLongObjectHashMap();
		openLongObjectHashMap0.put(23L, "asdf");
		openLongObjectHashMap0.put(343L, "fh45");
		openLongObjectHashMap0.put(223453L, "asdf");
		openLongObjectHashMap0.put(233333L, "asdf");
		LongArrayList longArrayList0 = new LongArrayList();
		ObjectArrayList objectArrayList0 = new ObjectArrayList(656429);
		openLongObjectHashMap0.pairsSortedByValue(longArrayList0,
				objectArrayList0);
	}
}
