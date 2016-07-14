package colt;

import org.junit.Test;

import cern.colt.list.IntArrayList;

public class InitialScenario {
	@Test(timeout = 4000)
	public void test0() throws Throwable {
		IntArrayList intArrayList0 = new IntArrayList();
		intArrayList0.setSize(10);
		intArrayList0.add(2345);
		intArrayList0.beforeInsert(1, 35423452);
		intArrayList0.add(45636);
	}
}
