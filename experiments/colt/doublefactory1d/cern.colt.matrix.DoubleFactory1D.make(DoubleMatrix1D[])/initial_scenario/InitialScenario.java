package colt;

import org.junit.Test;

import cern.colt.list.AbstractDoubleList;
import cern.colt.list.DoubleArrayList;
import cern.colt.matrix.DoubleFactory1D;
import cern.colt.matrix.DoubleMatrix1D;
import cern.colt.matrix.impl.DenseDoubleMatrix1D;

public class DoubleFactory1DTest {
      @Test(timeout = 4000)
      public void test0() throws Throwable {
            DoubleFactory1D doubleFactory1D0 = DoubleFactory1D.dense;
            DenseDoubleMatrix1D denseDoubleMatrix1D0 = (DenseDoubleMatrix1D) doubleFactory1D0
                        .descending(3813);
            DoubleFactory1D doubleFactory1D1 = DoubleFactory1D.dense;
            DoubleArrayList doubleArrayList0 = doubleFactory1D1
                        .toList(denseDoubleMatrix1D0);
            DenseDoubleMatrix1D denseDoubleMatrix1D1 = (DenseDoubleMatrix1D) doubleFactory1D1
                        .make((AbstractDoubleList) doubleArrayList0);
            DoubleMatrix1D[] doubleMatrix1DArray0 = new DoubleMatrix1D[8];
            doubleMatrix1DArray0[0] = (DoubleMatrix1D) denseDoubleMatrix1D1;
            doubleMatrix1DArray0[1] = (DoubleMatrix1D) denseDoubleMatrix1D0;
            doubleFactory1D0.append(doubleMatrix1DArray0[1],
                        doubleMatrix1DArray0[0]);
            doubleMatrix1DArray0[2] = (DoubleMatrix1D) denseDoubleMatrix1D0;
            doubleMatrix1DArray0[3] = (DoubleMatrix1D) denseDoubleMatrix1D1;
            doubleMatrix1DArray0[4] = (DoubleMatrix1D) denseDoubleMatrix1D0;
            doubleMatrix1DArray0[5] = (DoubleMatrix1D) denseDoubleMatrix1D1;
            doubleMatrix1DArray0[6] = (DoubleMatrix1D) denseDoubleMatrix1D0;
            doubleMatrix1DArray0[7] = (DoubleMatrix1D) denseDoubleMatrix1D1;
            doubleFactory1D1.make(doubleMatrix1DArray0);
      }
}