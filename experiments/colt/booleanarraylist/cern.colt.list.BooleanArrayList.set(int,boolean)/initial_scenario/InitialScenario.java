package colt;

import org.junit.Test;

import cern.colt.list.BooleanArrayList;

public class InitialScenario {
  @Test
  public void test0() throws Throwable {
    boolean[] booleanArray0 = new boolean[10];
    BooleanArrayList booleanArrayList0 = new BooleanArrayList(booleanArray0);
    booleanArrayList0.set(3, true);
  }
}
