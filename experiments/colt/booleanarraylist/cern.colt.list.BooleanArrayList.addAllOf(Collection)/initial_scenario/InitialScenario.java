package colt;

import java.util.ArrayList;

import org.junit.Test;

import cern.colt.list.BooleanArrayList;

public class InitialScenario {
  @Test
	public void test0() throws Throwable {
		BooleanArrayList booleanArrayList0 = new BooleanArrayList();
		booleanArrayList0.setSize(3);
		ArrayList<Boolean> arrayList0 = new ArrayList<Boolean>();
		arrayList0.add(true);
		arrayList0.add(false);
		arrayList0.add(true);
		arrayList0.add(false);
		arrayList0.add(false);
		arrayList0.add(true);
		booleanArrayList0.addAllOf(arrayList0);
	}
}
