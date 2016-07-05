package colt;

import org.junit.Test;

import cern.colt.function.IntDoubleProcedure;
import cern.colt.map.OpenIntDoubleHashMap;

public class AbstractIntDoubleMapTest {
      @Test
      public void test0() throws Throwable {
            OpenIntDoubleHashMap openIntDoubleHashMap0 = new OpenIntDoubleHashMap();
            openIntDoubleHashMap0.toStringByValue();
            openIntDoubleHashMap0.forEachPair((IntDoubleProcedure) null);
            boolean boolean0 = openIntDoubleHashMap0.containsValue(3273.0);
      }
      @Test
      public void test1() throws Throwable {
            OpenIntDoubleHashMap openIntDoubleHashMap0 = new OpenIntDoubleHashMap();
            openIntDoubleHashMap0.toStringByValue();
            openIntDoubleHashMap0.forEachPair((IntDoubleProcedure) null);
            openIntDoubleHashMap0.put(29742, 3273.0);
            boolean boolean1 = openIntDoubleHashMap0.containsValue(3273.0);
      }
}