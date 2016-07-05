package colt;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import cern.colt.list.IntArrayList;

public class IntArrayListTest {

  @Test(timeout = 4000)
  public void test0() throws Throwable {
    IntArrayList intArrayList0 = new IntArrayList();
    boolean int0 = intArrayList0.removeAll(intArrayList0);
    assertFalse(int0);
  }

  @Test(timeout = 4000)
  public void test1() throws Throwable {
    IntArrayList intArrayList0 = new IntArrayList();
    IntArrayList intArrayList1 = intArrayList0.copy();
    intArrayList1.add(1);
    boolean int0 = intArrayList0.removeAll(intArrayList1);
    assertEquals(1, intArrayList1.size());
    assertFalse(int0);
  }

  @Test(timeout = 4000)
  public void test2() throws Throwable {
    IntArrayList intArrayList0 = new IntArrayList(10);
    IntArrayList intArrayList1 = new IntArrayList();
    int[] intArray0 = new int[6];
    intArrayList1.setSize(10);
    intArray0[2] = 4;
    intArrayList0.elements(intArray0);
    boolean int0 = intArrayList0.removeAll(intArrayList1);
    assertEquals(1, intArrayList0.size());
    assertTrue(int0);
  }

  @Test(timeout = 4000)
  public void test3() throws Throwable {
    IntArrayList intArrayList0 = new IntArrayList();
    boolean int0 = intArrayList0.removeAll(intArrayList0);
    assertFalse(int0);
  }

  @Test(timeout = 4000)
  public void test4() throws Throwable {
    int[] intArray0 = new int[3];
    IntArrayList intArrayList0 = new IntArrayList(intArray0);
    boolean int0 = intArrayList0.removeAll(intArrayList0);
    assertEquals(0, intArrayList0.size());
    assertTrue(int0);
  }

  @Test(timeout = 4000)
  public void test5() throws Throwable {
    IntArrayList intArrayList0 = new IntArrayList();
    intArrayList0.add(8);
    intArrayList0.add(10);
    assertEquals(2, intArrayList0.size());

    boolean int0 = intArrayList0.removeAll(intArrayList0);
    assertTrue(int0);
  }
}