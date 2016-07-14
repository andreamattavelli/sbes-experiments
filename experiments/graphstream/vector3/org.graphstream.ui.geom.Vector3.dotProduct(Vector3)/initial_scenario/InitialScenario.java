package org.graphstream.ui.geom;

import static org.junit.Assert.*;
import org.junit.Test;
import org.graphstream.ui.geom.Vector3;

public class InitialScenario {

  @Test
  public void test0() throws Throwable  {
      Vector3 v1 = new Vector3();
      v1.set(345.0d, 432.0d, 125.0d);
      Vector3 v2 = new Vector3();
      v2.set(23.0d, 43.0d, 12.0d);
      double val = v1.dotProduct(v2);
  }
}
