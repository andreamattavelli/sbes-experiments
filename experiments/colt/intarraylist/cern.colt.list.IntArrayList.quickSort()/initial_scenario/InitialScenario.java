package colt;

import org.junit.Test;

import cern.colt.list.IntArrayList;

public class IntArrayListTest {
  @Test(timeout = 4000)
  public void test0() throws Throwable {
    int[] intArray0 = new int[20];
    intArray0[1] = 1;
    intArray0[3] = 23542;
    intArray0[5] = 3;
    intArray0[6] = 3534;
    intArray0[7] = 56747856;
    intArray0[8] = 2354;
    intArray0[9] = 2352345;
    intArray0[5] = 3;
    IntArrayList intArrayList0 = new IntArrayList(intArray0);
    intArrayList0.quickSort();
  }
}