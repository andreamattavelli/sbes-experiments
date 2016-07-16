package colt;

import org.junit.Test;

import cern.colt.list.BooleanArrayList;

public class InitialScenario {
  @Test
  public void test1() throws Throwable {
    BooleanArrayList booleanArrayList0 = new BooleanArrayList();
    boolean[] booleanArray0 = new boolean[27];
    booleanArray0[2] = true;
    booleanArray0[5] = true;
    booleanArray0[7] = true;
    booleanArrayList0.elements(booleanArray0);
    booleanArrayList0.sortFromTo(3, 7);
  }
}
