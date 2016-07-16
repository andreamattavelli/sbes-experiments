package colt;

import org.junit.Test;

import cern.colt.matrix.DoubleFactory1D;

public class InitialScenario {
      @Test
      public void test0() throws Throwable {
            DoubleFactory1D doubleFactory1D0 = DoubleFactory1D.sparse;
            doubleFactory1D0.make(Integer.MAX_VALUE);
            double[] doubleArray0 = new double[6];
            doubleArray0[0] = (double) Integer.MAX_VALUE;
            doubleArray0[1] = (double) 0;
            doubleArray0[2] = (double) 0;
            doubleArray0[3] = (double) Integer.MAX_VALUE;
            doubleArray0[4] = (double) 0;
            doubleArray0[5] = (double) 0;
            doubleFactory1D0.make(doubleArray0);
            doubleFactory1D0.sample(Integer.MAX_VALUE, 0.0, 0.0);
      }
}
