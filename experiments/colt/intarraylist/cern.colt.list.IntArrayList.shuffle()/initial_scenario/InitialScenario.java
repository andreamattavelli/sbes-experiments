package colt;

import org.junit.Test;

import cern.colt.list.IntArrayList;

public class IntArrayListTest {
   @Test(timeout = 4000)
   public void test0() throws Throwable {
      int[] intArray0 = new int[15];
      intArray0[2] = 2;
      intArray0[4] = 6;
      intArray0[7] = 9;
      intArray0[10] = 3;
      intArray0[11] = 4;
      intArray0[14] = 1;
      IntArrayList intArrayList0 = new IntArrayList(intArray0);
      intArrayList0.shuffle();
   }
}