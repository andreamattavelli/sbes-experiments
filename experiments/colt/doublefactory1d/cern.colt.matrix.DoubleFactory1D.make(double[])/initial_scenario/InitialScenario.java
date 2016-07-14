package colt;

import org.junit.Test;

import cern.colt.matrix.DoubleFactory1D;

public class InitialScenario {
	@Test(timeout = 4000)
	public void test0() throws Throwable {
		DoubleFactory1D doubleFactory1D0 = DoubleFactory1D.dense;
		double[] doubleArray0 = new double[10];
		doubleFactory1D0.make(doubleArray0);
	}
}
