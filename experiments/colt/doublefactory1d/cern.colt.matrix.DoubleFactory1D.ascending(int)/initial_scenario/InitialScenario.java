package colt;

import org.junit.Test;

import cern.colt.matrix.DoubleFactory1D;
import cern.colt.matrix.impl.SparseDoubleMatrix1D;

public class DoubleFactory1DTest {
	@Test(timeout = 4000)
	public void test0() throws Throwable {
		DoubleFactory1D doubleFactory1D0 = DoubleFactory1D.sparse;
		SparseDoubleMatrix1D sparseDoubleMatrix1D0 = (SparseDoubleMatrix1D) doubleFactory1D0
				.ascending(624);
	}
}