package colt;

import org.junit.Test;

import cern.colt.list.BooleanArrayList;

public class InitialScenario {
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        boolean[] booleanArray0 = new boolean[6];
        booleanArray0[1] = true;
        booleanArray0[3] = true;
        booleanArray0[5] = true;
        BooleanArrayList booleanArrayList0 = new BooleanArrayList(booleanArray0);

        BooleanArrayList booleanArrayList1 = new BooleanArrayList();
        booleanArrayList1.setSize(6);
        booleanArrayList0.replaceFromToWithFrom(2, 4, booleanArrayList1, 3);
    }
}
