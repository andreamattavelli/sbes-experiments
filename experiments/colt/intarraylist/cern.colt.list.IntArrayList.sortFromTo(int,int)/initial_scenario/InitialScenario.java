package colt;

import org.junit.Test;

import cern.colt.list.IntArrayList;

public class IntArrayListTest {
  @Test(timeout = 4000)
  public void test0() throws Throwable {
    int[] intArray0 = new int[6];
    intArray0[2] = 1;
    IntArrayList intArrayList0 = new IntArrayList(intArray0);
    intArrayList0.sortFromTo(2, 5);
  }

  @Test(timeout = 4000)
  public void test1() throws Throwable {
    int[] expectedArray = new int[27];
    expectedArray[2] = 9;
    expectedArray[6] = 1;
    expectedArray[7] = 5;
    IntArrayList intArrayList0 = new IntArrayList();
    IntArrayList intArrayList1 = new IntArrayList(expectedArray);
    int[] intArray1 = new int[27];
    intArray1[2] = 9;
    intArray1[5] = 5;
    intArray1[7] = 1;
    intArrayList0.elements(intArray1);
    intArrayList0.sortFromTo(3, 7);
  }
}
