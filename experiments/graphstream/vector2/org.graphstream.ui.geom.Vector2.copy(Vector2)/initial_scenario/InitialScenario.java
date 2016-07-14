package org.graphstream.ui.geom;

import static org.junit.Assert.*;
import org.junit.Test;
import org.graphstream.ui.geom.Vector2;

public class InitialScenario {

  @Test
  public void test0() throws Throwable  {
      Vector2 v1 = new Vector2();
      v1.set(345.0d, 432.0d);
      Vector2 v2 = new Vector2();
      v2.set(35.0d, 42.0d);
      v1.copy(v2);
  }
}
