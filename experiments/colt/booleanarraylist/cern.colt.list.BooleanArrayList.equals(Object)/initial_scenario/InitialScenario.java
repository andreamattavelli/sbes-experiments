package colt;

import org.junit.Test;

import cern.colt.list.BooleanArrayList;

public class AbstractBooleanListTest {
  @Test(timeout = 4000)
  public void test1() throws Throwable {
    BooleanArrayList booleanArrayList0 = new BooleanArrayList();
    boolean boolean0 = booleanArrayList0.equals(booleanArrayList0);
  }

  @Test(timeout = 4000)
  public void test2() throws Throwable {
    boolean[] booleanArray0 = new boolean[3];
    BooleanArrayList booleanArrayList0 = new BooleanArrayList(booleanArray0);
    BooleanArrayList booleanArrayList1 = (BooleanArrayList) booleanArrayList0
        .times(124);
    booleanArrayList1.shuffleFromTo(124, 369);
    boolean boolean0 = booleanArrayList0.equals((Object) booleanArrayList1);
  }

  @Test(timeout = 4000)
  public void test3() throws Throwable {
    boolean[] booleanArray0 = new boolean[3];
    BooleanArrayList booleanArrayList0 = new BooleanArrayList(booleanArray0);
    BooleanArrayList booleanArrayList1 = new BooleanArrayList(booleanArray0);
    boolean boolean0 = booleanArrayList1.equals((Object) booleanArrayList0);
  }
}