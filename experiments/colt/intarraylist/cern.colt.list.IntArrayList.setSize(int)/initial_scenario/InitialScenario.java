package colt;

import org.junit.Test;

import cern.colt.list.IntArrayList;

public class IntArrayListTest {
  @Test(timeout = 4000)
  public void test0() throws Throwable {
    int[] intArray0 = new int[6];
    intArray0[1] = 1;
    intArray0[3] = 2;
    intArray0[5] = 3;
    IntArrayList intArrayList0 = new IntArrayList(intArray0);
    intArrayList0.add(8678);
    intArrayList0.add(1232342);
    intArrayList0.add(456);
    intArrayList0.add(234);
    intArrayList0.add(786);
    intArrayList0.setSize(4);
  }
}
