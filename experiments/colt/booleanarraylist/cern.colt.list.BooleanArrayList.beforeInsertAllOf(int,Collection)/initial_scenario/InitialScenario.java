package colt;

import java.util.ArrayList;

import org.junit.Test;

import cern.colt.list.BooleanArrayList;

public class InitialScenario {
	@Test(timeout = 4000)
	public void test1() {
		BooleanArrayList booleanArrayList0 = new BooleanArrayList();
		booleanArrayList0.setSize(3);
		ArrayList<Boolean> arrayList0 = new ArrayList<Boolean>();
		arrayList0.add(true);
		arrayList0.add(false);
		arrayList0.add(true);
		arrayList0.add(true);
		arrayList0.add(false);
		arrayList0.add(true);
		booleanArrayList0.beforeInsertAllOf(2, arrayList0);
	}
}
