package colt;

import org.junit.Test;

import cern.colt.list.IntArrayList;

public class IntArrayListTest {
  @Test(timeout = 4000)
  public void test0() throws Throwable {
    int[] intArray0 = new int[5];
    IntArrayList intArrayList0 = new IntArrayList(intArray0);
    intArrayList0.set(3, 5634356);
  }
}