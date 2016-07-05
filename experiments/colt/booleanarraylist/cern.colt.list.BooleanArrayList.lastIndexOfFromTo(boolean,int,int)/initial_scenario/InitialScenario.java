package colt;

import org.junit.Test;

import cern.colt.list.BooleanArrayList;

public class AbstractBooleanListTest {
  @Test(timeout = 4000)
  public void test2() throws Throwable {
    boolean[] booleanArray0 = new boolean[5];
    booleanArray0[1] = true;
    BooleanArrayList booleanArrayList0 = new BooleanArrayList(booleanArray0);
    int int0 = booleanArrayList0.lastIndexOfFromTo(false, 1, 4);
  }
}