package colt;

import java.util.ArrayList;

import org.junit.Test;

import cern.colt.list.BooleanArrayList;

public class InitialScenario {
	@Test
	public void test0() {
		ArrayList<Boolean> arrayList0 = new ArrayList<Boolean>();
		arrayList0.add(true);
		arrayList0.add(false);
		arrayList0.add(true);
		arrayList0.add(true);
		BooleanArrayList abstractList0 = new BooleanArrayList();
		abstractList0.addAllOf(arrayList0);
		abstractList0.clear();
	}
}
