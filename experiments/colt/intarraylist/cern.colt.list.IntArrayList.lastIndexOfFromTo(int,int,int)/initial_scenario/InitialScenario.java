package colt;

import org.junit.Test;

import cern.colt.list.IntArrayList;

public class IntArrayListTest {
  @Test(timeout = 4000)
  public void test0() throws Throwable {
    IntArrayList intArrayList0 = new IntArrayList(0);
    int int0 = intArrayList0.lastIndexOfFromTo(0, 1084, 1635);
  }

  @Test(timeout = 4000)
  public void test1() throws Throwable {
    IntArrayList intArrayList0 = new IntArrayList();
    int int0 = intArrayList0.lastIndexOfFromTo(1, (-1701), (-1701));
  }

  @Test(timeout = 4000)
  public void test2() throws Throwable {
    int[] intArray0 = new int[5];
    intArray0[1] = 1;
    IntArrayList intArrayList0 = new IntArrayList(intArray0);
    int int0 = intArrayList0.lastIndexOfFromTo(0, 1, 4);
  }
}