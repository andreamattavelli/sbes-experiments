package colt;

import java.util.ArrayList;

import org.junit.Test;

import cern.colt.list.IntArrayList;

public class InitialScenario {
	@Test
	public void test52() throws Throwable {
		IntArrayList intArrayList0 = new IntArrayList();
		intArrayList0.setSize(3);
		ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
		arrayList0.add(1);
		arrayList0.add(2);
		arrayList0.add(3);
		arrayList0.add(3);
		arrayList0.add(2);
		arrayList0.add(1);
		intArrayList0.beforeInsertAllOf(2, arrayList0);
	}
}
