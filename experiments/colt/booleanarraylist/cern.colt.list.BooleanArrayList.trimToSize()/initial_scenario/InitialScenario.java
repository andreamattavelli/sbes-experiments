package colt;

import org.junit.Test;

import cern.colt.list.BooleanArrayList;

public class InitialScenario {
    @Test
    public void test0() throws Throwable {
        BooleanArrayList booleanArrayList0 = new BooleanArrayList();
        booleanArrayList0.add(true);
        booleanArrayList0.add(false);
        booleanArrayList0.add(false);
        booleanArrayList0.add(true);
        booleanArrayList0.add(true);
        booleanArrayList0.add(false);
        booleanArrayList0.add(true);
        booleanArrayList0.trimToSize();
    }
}
