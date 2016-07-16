package colt;

import org.junit.Test;

import cern.colt.list.IntArrayList;

public class InitialScenario {
  @Test
  public void test0() throws Throwable {
    int[] intArray0 = new int[7];
    intArray0[3] = 1;
    IntArrayList intArrayList0 = new IntArrayList(intArray0);
    int int0 = intArrayList0.lastIndexOf(1);
  }

  @Test
  public void test1() throws Throwable {
    int[] intArray0 = new int[0];
    IntArrayList intArrayList0 = new IntArrayList(intArray0);
    int[] intArray1 = new int[27];
    intArray1[1] = 2;
    intArrayList0.elements(intArray1);
    int int0 = intArrayList0.lastIndexOf(2);
  }
}
