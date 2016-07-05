package colt;

import org.junit.Test;

import cern.colt.function.DoubleFunction;
import cern.colt.map.OpenIntDoubleHashMap;
import cern.jet.random.AbstractDistribution;
import cern.jet.random.Uniform;

public class AbstractIntDoubleMapTest {
      @Test
      public void test0() throws Throwable {
            OpenIntDoubleHashMap openIntDoubleHashMap0 = new OpenIntDoubleHashMap();
            openIntDoubleHashMap0.put(Integer.MIN_VALUE, Integer.MIN_VALUE);
            Uniform uniform0 = new Uniform((double) Integer.MIN_VALUE, (-2604.4),
                        Integer.MIN_VALUE);
            uniform0.nextInt();
            AbstractDistribution.makeDefaultGenerator();
            openIntDoubleHashMap0.assign((DoubleFunction) uniform0);
            OpenIntDoubleHashMap openIntDoubleHashMap1 = (OpenIntDoubleHashMap) openIntDoubleHashMap0
                        .copy();
            openIntDoubleHashMap1.ensureCapacity(Integer.MIN_VALUE);
      }
}