package colt;

import org.junit.Test;

import cern.colt.list.AbstractIntList;
import cern.colt.list.IntArrayList;

public class InitialScenario {
    @Test
    public void test0() throws Throwable {
        int[] intArray0 = new int[3];
        intArray0[2] = 1;
        AbstractIntList intArrayList0 = new IntArrayList(intArray0);
        AbstractIntList intArrayList1 = new IntArrayList();
        intArrayList1.add(1);
        intArrayList1.add(12762354);
        intArrayList1.add(1235245);
        intArrayList1.add(1678678);
        intArrayList1.add(174572);
        intArrayList1.add(463568251);
        boolean int0 = intArrayList0.retainAll(intArrayList1);
    }
}
