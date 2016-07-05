package colt;

import org.junit.Test;

import cern.colt.list.DoubleArrayList;
import cern.colt.list.IntArrayList;
import cern.colt.map.OpenDoubleIntHashMap;

public class AbstractDoubleIntMapTest {
	@Test
	public void test0() throws Throwable {
		OpenDoubleIntHashMap openDoubleIntHashMap0 = new OpenDoubleIntHashMap();
		DoubleArrayList doubleArrayList0 = new DoubleArrayList();
		IntArrayList intArrayList0 = new IntArrayList(2679);
		openDoubleIntHashMap0.put(0.0, 1);
		openDoubleIntHashMap0.put(2.0, 0);
		openDoubleIntHashMap0.put(5.4, 2);
		openDoubleIntHashMap0.put(3945.0, 0);
		openDoubleIntHashMap0.put(1.0, 9837492);
		openDoubleIntHashMap0.pairsSortedByKey(doubleArrayList0, intArrayList0);
	}
}