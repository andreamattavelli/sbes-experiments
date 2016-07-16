package colt;

import org.junit.Test;

import cern.colt.function.DoubleIntProcedure;
import cern.colt.list.IntArrayList;
import cern.colt.list.DoubleArrayList;
import cern.colt.map.OpenDoubleIntHashMap;

public class InitialScenario {
	@Test
	public void test0() {
		OpenDoubleIntHashMap openDoubleIntHashMap0 = new OpenDoubleIntHashMap(0);
      	DoubleArrayList doubleArrayList0 = new DoubleArrayList();
      	IntArrayList intArrayList0 = new IntArrayList();
      	openDoubleIntHashMap0.pairsMatching((DoubleIntProcedure) null, doubleArrayList0, intArrayList0);
	}
}
