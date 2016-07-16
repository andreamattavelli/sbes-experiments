package colt;

import org.junit.Test;

import cern.colt.bitvector.BitVector;
import cern.colt.list.DistinctNumberList;
import cern.colt.list.MinMaxNumberList;

public class InitialScenario {
	@Test
	public void test0() throws Throwable {
      MinMaxNumberList minMaxNumberList0 = new MinMaxNumberList(0l, 12345l, 10);
      minMaxNumberList0.add(0l);
      minMaxNumberList0.add(8491l);
      minMaxNumberList0.add(1055l);
      minMaxNumberList0.add(190l);
      long longArray0[] = new long[10];
      BitVector bitVector0 = new BitVector(10);
      bitVector0.set(1);
      bitVector0.set(3);
      bitVector0.set(8);
      minMaxNumberList0.partFromTo(2, 10, bitVector0, 0, longArray0, 0);
	}
}
