package colt;

import org.junit.Test;

import cern.colt.buffer.IntBuffer;
import cern.colt.buffer.IntBufferConsumer;
import cern.colt.list.IntArrayList;

public class InitialScenario {
  @Test
  public void test11() throws Throwable {
    IntArrayList intArrayList0 = new IntArrayList();
    IntBuffer intBuffer0 = new IntBuffer((IntBufferConsumer) intArrayList0,
        10);
    int[] intArray0 = new int[8];
    intBuffer0.add(0);
    intBuffer0.add((-1878));
    intBuffer0.flush();
  }
}
