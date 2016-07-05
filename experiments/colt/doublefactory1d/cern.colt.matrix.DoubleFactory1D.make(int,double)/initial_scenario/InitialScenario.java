package colt;

import org.junit.Test;

import cern.colt.matrix.DoubleFactory1D;

public class DoubleFactory1DTest {
	@Test(timeout = 4000)
	public void test0() throws Throwable {
		DoubleFactory1D doubleFactory1D0 = DoubleFactory1D.sparse;
		doubleFactory1D0.make(663608941, 0.0);
	}
}