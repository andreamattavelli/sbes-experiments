package org.graphstream.ui.geom;

import static org.junit.Assert.*;
import org.junit.Test;
import org.graphstream.ui.geom.Vector2;

public class InitialScenario {

  @Test
  public void test0() throws Throwable  {
      Vector2 v1 = new Vector2();
      double a = 345.0d;
      double b = 432.0d;
      v1.set(a, b);
  }
}
