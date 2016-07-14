package colt;

import org.junit.Test;

import cern.colt.function.DoubleDoubleFunction;
import cern.colt.matrix.DoubleFactory1D;
import cern.colt.matrix.DoubleMatrix1D;
import cern.colt.matrix.impl.DenseDoubleMatrix1D;
import cern.jet.math.PlusMult;

public class InitialScenario {
      @Test(timeout = 4000)
      public void test0() throws Throwable {
            DoubleFactory1D doubleFactory1D0 = DoubleFactory1D.dense;
            DenseDoubleMatrix1D denseDoubleMatrix1D0 = (DenseDoubleMatrix1D) doubleFactory1D0
                        .ascending(0);
            DenseDoubleMatrix1D denseDoubleMatrix1D1 = new DenseDoubleMatrix1D(0);
            DenseDoubleMatrix1D denseDoubleMatrix1D2 = (DenseDoubleMatrix1D) denseDoubleMatrix1D1
                        .assign((double) 0);
            DenseDoubleMatrix1D denseDoubleMatrix1D3 = (DenseDoubleMatrix1D) doubleFactory1D0
                        .append(denseDoubleMatrix1D2, denseDoubleMatrix1D0);
            PlusMult plusMult0 = PlusMult.minusMult(0.0);
            plusMult0.multiplicator = 0.0;
            PlusMult.plusMult(0);
            PlusMult.minusDiv(2656.435528882281);
            denseDoubleMatrix1D1.toStringShort();
            denseDoubleMatrix1D1.aggregate((DoubleMatrix1D) denseDoubleMatrix1D3,
                        (DoubleDoubleFunction) plusMult0,
                        (DoubleDoubleFunction) plusMult0);
            doubleFactory1D0.make(0);
      }
}
