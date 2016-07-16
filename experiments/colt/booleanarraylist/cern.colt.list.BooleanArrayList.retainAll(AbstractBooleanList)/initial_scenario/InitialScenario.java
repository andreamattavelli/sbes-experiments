package colt;

import org.junit.Test;

import cern.colt.list.BooleanArrayList;

public class InitialScenario {
  @Test
  public void test0() throws Throwable {
    boolean[] booleanArray0 = new boolean[3];
    booleanArray0[2] = true;
    BooleanArrayList booleanArrayList0 = new BooleanArrayList(booleanArray0);
    BooleanArrayList booleanArrayList1 = new BooleanArrayList(1);
    booleanArrayList0.retainAll(booleanArrayList1);
  }
}
