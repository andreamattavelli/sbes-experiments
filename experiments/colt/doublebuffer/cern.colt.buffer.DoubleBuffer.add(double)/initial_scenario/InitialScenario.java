package colt;

import org.junit.Test;

import cern.colt.buffer.DoubleBuffer;
import cern.colt.buffer.DoubleBufferConsumer;
import cern.colt.list.DoubleArrayList;

public class InitialScenario {
  @Test
  public void test0() {
      DoubleArrayList doubleArrayList0 = new DoubleArrayList();
      DoubleBuffer doubleBuffer0 = new DoubleBuffer((DoubleBufferConsumer) doubleArrayList0, 100);
      doubleBuffer0.add(2.0);
  }

    @Test
  public void test1()  throws Throwable  {
      DoubleBuffer doubleBuffer0 = new DoubleBuffer((DoubleBufferConsumer) null, 1);
      doubleBuffer0.add(1780.771857);
  }
}
