package colt;

import org.junit.Test;

import cern.colt.list.IntArrayList;
import cern.colt.list.ObjectArrayList;
import cern.colt.map.OpenIntObjectHashMap;

public class InitialScenario {
  @Test
  public void test0() throws Throwable {
    OpenIntObjectHashMap openIntObjectHashMap0 = new OpenIntObjectHashMap(
        591);
    openIntObjectHashMap0.put(234263, "asdasf");
    openIntObjectHashMap0.put(285678263, "gh6hhh");
    openIntObjectHashMap0.put(2123, "56yh56h");
    openIntObjectHashMap0.put(268783, "asdasf");
    IntArrayList intArrayList0 = new IntArrayList();
    Object[] objectArray0 = new Object[0];
    ObjectArrayList objectArrayList0 = new ObjectArrayList(objectArray0);
    openIntObjectHashMap0.pairsSortedByKey(intArrayList0, objectArrayList0);
  }
}
