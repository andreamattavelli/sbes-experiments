package colt;

import org.junit.Test;

import cern.colt.function.DoubleProcedure;
import cern.colt.map.OpenDoubleIntHashMap;

public class AbstractDoubleIntMapTest {
	@Test
	public void test0() {
		OpenDoubleIntHashMap openDoubleIntHashMap0 = new OpenDoubleIntHashMap(
				1427, Double.NaN, Double.NaN);
		boolean boolean0 = openDoubleIntHashMap0
				.forEachKey((DoubleProcedure) null);
	}
}