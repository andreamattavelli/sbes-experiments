package colt;

import org.junit.Test;

import cern.colt.list.AbstractDoubleList;
import cern.colt.list.DoubleArrayList;
import cern.colt.matrix.DoubleFactory1D;

public class DoubleFactory1DTest {
      @Test(timeout = 4000)
      public void test0() throws Throwable {
            DoubleFactory1D doubleFactory1D0 = DoubleFactory1D.sparse;
            double[] doubleArray0 = new double[6];
            doubleArray0[0] = 1420.75080076;
            doubleArray0[1] = 48.93077;
            doubleArray0[2] = (-5633.257817029818);
            doubleArray0[3] = 1.2;
            doubleArray0[4] = 0.0;
            doubleArray0[5] = 1.0;
            DoubleArrayList doubleArrayList0 = new DoubleArrayList(doubleArray0);
            DoubleArrayList doubleArrayList1 = doubleArrayList0.copy();
            DoubleArrayList doubleArrayList2 = (DoubleArrayList) doubleArrayList1
                        .times(1766);
            doubleFactory1D0.make((AbstractDoubleList) doubleArrayList2);
      }
}