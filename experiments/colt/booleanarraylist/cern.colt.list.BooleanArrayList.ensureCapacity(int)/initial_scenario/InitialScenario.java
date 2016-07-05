package colt;

import org.junit.Test;

import cern.colt.list.BooleanArrayList;

public class AbstractBooleanListTest {
  @Test(timeout = 4000)
  public void test0() throws Throwable {
    BooleanArrayList booleanArrayList0 = new BooleanArrayList();
    booleanArrayList0.ensureCapacity(256);
  }

  @Test(timeout = 4000)
  public void test1() throws Throwable {
    boolean[] booleanArray0 = new boolean[0];
    BooleanArrayList booleanArrayList0 = new BooleanArrayList(booleanArray0);
    booleanArrayList0.ensureCapacity(10);
  }
}