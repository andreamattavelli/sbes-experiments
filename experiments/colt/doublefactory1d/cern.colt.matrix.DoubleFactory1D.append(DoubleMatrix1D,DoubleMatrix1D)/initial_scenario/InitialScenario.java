package colt;

import org.junit.Test;

import cern.colt.matrix.DoubleFactory1D;
import cern.colt.matrix.impl.DenseDoubleMatrix1D;

public class DoubleFactory1DTest {
      @Test(timeout = 4000)
      public void test0() throws Throwable {
            DoubleFactory1D doubleFactory1D0 = DoubleFactory1D.sparse;
            doubleFactory1D0.make(0, (double) 2);
            doubleFactory1D0.clone();
            double[] doubleArray0 = new double[3];
            doubleArray0[0] = (double) 3269;
            doubleArray0[1] = (double) 3269;
            doubleArray0[2] = (double) 3269;
            DenseDoubleMatrix1D denseDoubleMatrix1D0 = new DenseDoubleMatrix1D(
                        doubleArray0);
            doubleFactory1D0.repeat(denseDoubleMatrix1D0, 2);
      }
}