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
      minMaxNumberList0.toBitVector();
	}
}
