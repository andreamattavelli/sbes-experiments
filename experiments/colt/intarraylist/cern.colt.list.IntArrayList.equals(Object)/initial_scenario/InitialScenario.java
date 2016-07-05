package colt;

import org.junit.Test;

import cern.colt.list.IntArrayList;

public class IntArrayListTest {
  @Test(timeout = 4000)
  public void test2() throws Throwable {
    int[] intArray0 = new int[352345];
    IntArrayList intArrayList0 = new IntArrayList(intArray0);
    IntArrayList intArrayList1 = (IntArrayList) intArrayList0.clone();
    intArrayList1.shuffleFromTo(124, 369);
    boolean int0 = intArrayList0.equals((Object) intArrayList1);
  }

  @Test(timeout = 4000)
  public void test3() throws Throwable {
    int[] intArray0 = new int[3];
    IntArrayList intArrayList0 = new IntArrayList(intArray0);
    IntArrayList intArrayList1 = new IntArrayList(intArray0);
    boolean int0 = intArrayList1.equals((Object) intArrayList0);
  }

  @Test(timeout = 4000)
  public void test4() throws Throwable {
    int[] intArray0 = new int[6];
    IntArrayList intArrayList0 = new IntArrayList(intArray0);
    Object object0 = new Object();
    boolean int0 = intArrayList0.equals(object0);
  }
}