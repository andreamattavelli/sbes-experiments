package colt;

import java.util.ArrayList;

import org.junit.Test;

import cern.colt.list.IntArrayList;

public class InitialScenario {
	@Test
	public void test0() {
		ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
		arrayList0.add(1);
		arrayList0.add(2);
		arrayList0.add(3);
		arrayList0.add(4);
		IntArrayList abstractList0 = new IntArrayList();
		abstractList0.addAllOf(arrayList0);
		abstractList0.clear();
	}
}
