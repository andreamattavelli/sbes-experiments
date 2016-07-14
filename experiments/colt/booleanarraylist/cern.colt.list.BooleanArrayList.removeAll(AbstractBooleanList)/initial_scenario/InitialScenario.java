package colt;

import org.junit.Test;

import cern.colt.list.BooleanArrayList;

public class InitialScenario {
  @Test(timeout = 4000)
  public void test2() throws Throwable {
    BooleanArrayList booleanArrayList0 = new BooleanArrayList(10);
    BooleanArrayList booleanArrayList1 = new BooleanArrayList();
    boolean[] booleanArray0 = new boolean[6];
    booleanArrayList1.setSize(10);
    booleanArray0[2] = true;
    booleanArrayList0.elements(booleanArray0);
    booleanArrayList0.removeAll(booleanArrayList1);
  }
}
