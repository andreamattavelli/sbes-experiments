package colt;

import org.junit.Test;

import cern.colt.list.DoubleArrayList;
import cern.colt.map.OpenDoubleIntHashMap;

public class InitialScenario {
	@Test
	public void test0() {
      OpenDoubleIntHashMap openDoubleIntHashMap0 = new OpenDoubleIntHashMap();
      DoubleArrayList doubleArrayList0 = new DoubleArrayList(0);
      openDoubleIntHashMap0.keys(doubleArrayList0);
	}
}
