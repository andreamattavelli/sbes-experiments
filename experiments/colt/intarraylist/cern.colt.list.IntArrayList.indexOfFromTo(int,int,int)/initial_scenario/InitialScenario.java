package colt;

import org.junit.Test;

import cern.colt.list.IntArrayList;

public class InitialScenario {
  @Test
  public void test0() throws Throwable {
    int[] intArray0 = new int[6];
    intArray0[1] = 1;
    intArray0[5] = 1;
    IntArrayList intArrayList0 = new IntArrayList(intArray0);
    int int0 = intArrayList0.indexOfFromTo(0, 1, 4);
  }

  @Test
  public void test1() throws Throwable {
    IntArrayList intArrayList0 = new IntArrayList();
    int int0 = intArrayList0.indexOfFromTo(2, (-259), 0);
  }

  @Test
  public void test2() throws Throwable {
    int[] intArray0 = new int[6];
    intArray0[0] = 1;
    IntArrayList intArrayList0 = new IntArrayList(intArray0);
    int int0 = intArrayList0.indexOfFromTo(0, 0, 0);
  }
}
