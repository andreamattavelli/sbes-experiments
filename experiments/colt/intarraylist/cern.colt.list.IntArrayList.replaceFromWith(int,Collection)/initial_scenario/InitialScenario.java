package colt;

import java.util.ArrayList;

import org.junit.Test;

import cern.colt.list.IntArrayList;

public class IntArrayListTest {
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        int[] intArray0 = new int[6];
        intArray0[1] = 1;
        intArray0[3] = 2;
        intArray0[5] = 3;
        IntArrayList intArrayList0 = new IntArrayList(intArray0);

        ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
        arrayList0.add(23524);
        arrayList0.add(2);
        arrayList0.add(67348);
        arrayList0.add(978394);
        arrayList0.add(2345);
        arrayList0.add(234);
        intArrayList0.replaceFromWith(2, arrayList0);
    }
}