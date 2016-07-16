package colt;

import org.junit.Test;

import cern.colt.bitvector.BitVector;
import cern.colt.list.MinMaxNumberList;

public class InitialScenario {
	@Test
	public void test0() throws Throwable {
		long[] longArray0 = new long[9];
		longArray0[2] = 1234234;
		longArray0[3] = 74567;
		longArray0[4] = 74252;
		longArray0[5] = 3452354;
		longArray0[6] = 1345;
		longArray0[7] = 568467;
		
		MinMaxNumberList minMaxNumberList0 = new MinMaxNumberList(1234134,
				(13241), 1234);
		minMaxNumberList0.add(1324);
		minMaxNumberList0.add(546356);
		minMaxNumberList0.add(12342);
		minMaxNumberList0.add(234234);
		minMaxNumberList0.add(53464);
		BitVector bitVector0 = minMaxNumberList0.toBitVector();

		MinMaxNumberList minMaxNumberList1 = new MinMaxNumberList(1234134,
				(13241), 1234);
		minMaxNumberList1.add(2345);
		minMaxNumberList1.add(3735634);
		minMaxNumberList1.add(234523);
		minMaxNumberList1.add(353453);
		minMaxNumberList1.add(3452234);
		minMaxNumberList0.partFromTo(2, 4, bitVector0, 1, longArray0, 5);
	}
}
