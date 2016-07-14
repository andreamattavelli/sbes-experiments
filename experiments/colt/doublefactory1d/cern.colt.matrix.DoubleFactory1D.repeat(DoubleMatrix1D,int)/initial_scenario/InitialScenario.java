package colt;

import org.junit.Test;

public class InitialScenario {
	@Test(timeout = 4000)
	public void test0() throws Throwable {
		DoubleFactory1D doubleFactory1D0 = DoubleFactory1D.sparse;
      doubleFactory1D0.make(0, (double) 2);
      doubleFactory1D0.clone();
      doubleFactory1D0.repeat((DoubleMatrix1D) null, 2);
	}
}
