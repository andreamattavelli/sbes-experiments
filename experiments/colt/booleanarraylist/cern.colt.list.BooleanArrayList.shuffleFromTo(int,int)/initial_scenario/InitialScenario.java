package colt;

import org.junit.Test;

import cern.colt.list.BooleanArrayList;

public class InitialScenario {
   @Test(timeout = 4000)
   public void test0() throws Throwable {
      boolean[] booleanArray0 = new boolean[15];
      booleanArray0[2] = true;
      booleanArray0[4] = true;
      booleanArray0[7] = true;
      booleanArray0[10] = true;
      booleanArray0[11] = true;
      booleanArray0[14] = true;
      BooleanArrayList booleanArrayList0 = new BooleanArrayList(booleanArray0);
      booleanArrayList0.shuffleFromTo(3, 13);
   }
}
