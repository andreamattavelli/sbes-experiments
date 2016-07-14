package colt;

import org.junit.Test;

import cern.colt.function.IntDoubleProcedure;
import cern.colt.list.DoubleArrayList;
import cern.colt.list.IntArrayList;
import cern.colt.map.OpenIntDoubleHashMap;

public class InitialScenario {
      @Test
      public void test0() throws Throwable {
            OpenIntDoubleHashMap openIntDoubleHashMap0 = new OpenIntDoubleHashMap();
            int[] intArray0 = new int[4];
            intArray0[0] = 38747;
            intArray0[1] = (-1);
            intArray0[2] = 2900;
            intArray0[3] = 52679969;
            IntArrayList intArrayList0 = new IntArrayList(intArray0);
            DoubleArrayList doubleArrayList0 = new DoubleArrayList();
            DoubleArrayList doubleArrayList1 = doubleArrayList0.copy();
            doubleArrayList0.indexOf((-532.16102921264));
            doubleArrayList1.shuffleFromTo(634, (-2566));
            openIntDoubleHashMap0.pairsSortedByKey(intArrayList0, doubleArrayList1);
            IntArrayList intArrayList1 = new IntArrayList(intArray0);
            intArrayList0.addAllOf(intArrayList1);
            openIntDoubleHashMap0.equals((Object) null);
            DoubleArrayList doubleArrayList2 = new DoubleArrayList();
            doubleArrayList2.clone();
            openIntDoubleHashMap0.pairsMatching((IntDoubleProcedure) null,
                        intArrayList0, doubleArrayList2);
            openIntDoubleHashMap0.get(Integer.MIN_VALUE);
            openIntDoubleHashMap0.containsValue((-369.650181608));
      }
}
