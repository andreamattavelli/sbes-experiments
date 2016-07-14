package colt;

import org.junit.Test;

import cern.colt.buffer.DoubleBuffer;
import cern.colt.list.DoubleArrayList;

public class InitialScenario {
  @Test
  public void test0() {
    DoubleArrayList doubleArrayList0 = new DoubleArrayList();
    DoubleBuffer doubleBuffer0 = new DoubleBuffer(doubleArrayList0, 0);
    DoubleArrayList doubleArrayList1 = new DoubleArrayList();
    doubleArrayList1.add(3423);
    doubleArrayList1.add(23423);
    doubleArrayList1.add(242342);
    doubleArrayList1.add(67567);
    doubleArrayList1.add(5253245);
    doubleBuffer0.addAllOf(doubleArrayList1);
  }
}
