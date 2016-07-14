package colt;

import org.junit.Test;

import cern.colt.list.IntArrayList;

public class InitialScenario {
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        int[] intArray0 = new int[7];
        intArray0[1] = 13452;
        intArray0[3] = 5634;
        intArray0[5] = 345635;
        intArray0[6] = 45635;
        IntArrayList intArrayList0 = new IntArrayList(intArray0);

        IntArrayList intArrayList1 = new IntArrayList();
        intArrayList1.setSize(6);
        intArrayList0.replaceFromToWithFromTo(2, 4, intArrayList1, 3, 5);
    }
}
