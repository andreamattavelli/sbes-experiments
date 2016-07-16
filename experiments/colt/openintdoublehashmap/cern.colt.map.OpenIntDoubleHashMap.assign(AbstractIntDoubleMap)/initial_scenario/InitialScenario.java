package colt;

import org.junit.Test;

import cern.colt.map.AbstractIntDoubleMap;
import cern.colt.map.OpenIntDoubleHashMap;
import cern.jet.random.AbstractDistribution;
import cern.jet.random.Uniform;

public class InitialScenario {
      @Test
      public void test0() throws Throwable {
            OpenIntDoubleHashMap openIntDoubleHashMap0 = new OpenIntDoubleHashMap();
            openIntDoubleHashMap0.put(Integer.MIN_VALUE, Integer.MIN_VALUE);
            Uniform uniform0 = new Uniform((double) Integer.MIN_VALUE, (-2604.4),
                        Integer.MIN_VALUE);
            uniform0.nextInt();
            AbstractDistribution.makeDefaultGenerator();
            OpenIntDoubleHashMap openIntDoubleHashMap1 = (OpenIntDoubleHashMap) openIntDoubleHashMap0
                        .copy();
            openIntDoubleHashMap1.ensureCapacity(Integer.MIN_VALUE);
            openIntDoubleHashMap1.put(234, 3242.3434);
            Integer integer0 = new Integer(Integer.MIN_VALUE);
            openIntDoubleHashMap1.equals(integer0);
            openIntDoubleHashMap0
                        .assign((AbstractIntDoubleMap) openIntDoubleHashMap1);
      }
}
