package colt;

import org.junit.Test;

import cern.colt.function.DoubleIntProcedure;
import cern.colt.map.OpenDoubleIntHashMap;

public class AbstractDoubleIntMapTest {
	@Test(timeout = 4000)
	public void test0() {
		OpenDoubleIntHashMap openDoubleIntHashMap0 = new OpenDoubleIntHashMap();
		boolean boolean0 = openDoubleIntHashMap0
				.forEachPair((DoubleIntProcedure) null);
	}
}