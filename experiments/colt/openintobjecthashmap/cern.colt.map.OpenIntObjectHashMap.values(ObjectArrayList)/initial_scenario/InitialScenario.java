package colt;

import org.junit.Test;

import cern.colt.list.ObjectArrayList;
import cern.colt.map.OpenIntObjectHashMap;

public class AbstractIntObjectMapTest {
	@Test
	public void test0() throws Throwable {
		OpenIntObjectHashMap openIntObjectHashMap0 = new OpenIntObjectHashMap();
		openIntObjectHashMap0.put(234263, "asdasf");
		openIntObjectHashMap0.put(285678263, "gh6hhh");
		openIntObjectHashMap0.put(2123, "56yh56h");
		ObjectArrayList objectArrayList0 = new ObjectArrayList();
		openIntObjectHashMap0.values(objectArrayList0);
	}
}