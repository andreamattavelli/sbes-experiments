package colt;

import org.junit.Test;

import cern.colt.list.BooleanArrayList;

public class AbstractBooleanListTest {
  @Test(timeout = 4000)
  public void test0() throws Throwable {
    boolean[] booleanArray0 = new boolean[5];
    BooleanArrayList booleanArrayList0 = new BooleanArrayList(booleanArray0);
    booleanArrayList0.setQuick(3, true);
  }
}
