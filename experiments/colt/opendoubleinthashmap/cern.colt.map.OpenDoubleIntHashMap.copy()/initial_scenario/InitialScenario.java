package colt;

import org.junit.Test;

import cern.colt.map.OpenDoubleIntHashMap;

public class AbstractDoubleIntMapTest {
  @Test
  public void test0() throws Throwable {
    OpenDoubleIntHashMap openDoubleIntHashMap0 = new OpenDoubleIntHashMap(0);
    openDoubleIntHashMap0.put(0, 0);
    OpenDoubleIntHashMap openDoubleIntHashMap1 = (OpenDoubleIntHashMap) openDoubleIntHashMap0
        .copy();
  }

  @Test(timeout = 4000)
  public void test1() throws Throwable {
    OpenDoubleIntHashMap openDoubleIntHashMap0 = new OpenDoubleIntHashMap();
    OpenDoubleIntHashMap openDoubleIntHashMap1 = (OpenDoubleIntHashMap) openDoubleIntHashMap0
        .copy();
  }
}