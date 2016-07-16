package colt;

import org.junit.Test;

import cern.colt.list.IntArrayList;

public class InitialScenario {
  @Test
  public void test0() throws Throwable {
    IntArrayList intArrayList0 = new IntArrayList();
    intArrayList0.ensureCapacity(256);
    int size = intArrayList0.size();
  }

  @Test
  public void test1() throws Throwable {
    int[] intArray0 = new int[0];
    IntArrayList intArrayList0 = new IntArrayList(intArray0);
    intArrayList0.ensureCapacity(10);
    int size = intArrayList0.size();
  }
}
