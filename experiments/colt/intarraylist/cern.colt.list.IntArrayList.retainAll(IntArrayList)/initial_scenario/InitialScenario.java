package colt;

import org.junit.Test;

import cern.colt.list.IntArrayList;

public class IntArrayListTest {
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        int[] intArray0 = new int[3];
        intArray0[2] = 1;
        IntArrayList intArrayList0 = new IntArrayList(intArray0);
        IntArrayList intArrayList1 = new IntArrayList();
        intArrayList1.add(1);
        boolean int0 = intArrayList0.retainAll(intArrayList1);
        intArrayList0.clear();
        boolean int1 = intArrayList1.retainAll(intArrayList0);
    }
}
