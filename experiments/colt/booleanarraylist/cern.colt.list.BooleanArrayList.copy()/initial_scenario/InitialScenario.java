package colt;

import org.junit.Test;

import cern.colt.list.BooleanArrayList;

public class AbstractBooleanListTest {
  @Test(timeout = 4000)
  public void test0() throws Throwable {
    boolean[] booleanArray0 = new boolean[5];
    booleanArray0[0] = true;
    booleanArray0[3] = true;
    booleanArray0[4] = true;
    BooleanArrayList booleanArrayList0 = new BooleanArrayList(booleanArray0);
    BooleanArrayList booleanArrayList1 = booleanArrayList0.copy();
    booleanArrayList0.equals(booleanArrayList1);
  }
}