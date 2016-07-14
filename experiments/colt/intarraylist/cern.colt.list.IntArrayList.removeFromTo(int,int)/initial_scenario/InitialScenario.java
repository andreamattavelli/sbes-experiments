package colt;

import org.junit.Test;

import cern.colt.list.IntArrayList;

public class InitialScenario {
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        IntArrayList intArrayList0 = new IntArrayList();
        intArrayList0.add(1);
        intArrayList0.add(2);
        intArrayList0.add(3);
        intArrayList0.add(4);
        intArrayList0.add(5);
        intArrayList0.add(6);
        intArrayList0.add(7);
        intArrayList0.removeFromTo(2, 4);
    }
}
