package org.graphstream.ui.geom;

import static org.junit.Assert.*;
import org.junit.Test;
import org.graphstream.ui.geom.Vector2;

public class Vector2EvoSuiteTest {

  @Test
  public void test0() throws Throwable  {
      Vector2 v1 = new Vector2();
      Vector2 v2 = new Vector2();
      v1.set(345, 432);
      v2.set(42, 543);
      v1.add(v2);
  }
}
