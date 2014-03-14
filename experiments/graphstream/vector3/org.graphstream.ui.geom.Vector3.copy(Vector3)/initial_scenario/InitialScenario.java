package org.graphstream.ui.geom;

import static org.junit.Assert.*;
import org.junit.Test;
import org.graphstream.ui.geom.Vector3;

public class Vector3EvoSuiteTest {

  @Test
  public void test0() throws Throwable  {
      Vector3 v1 = new Vector3();
      v1.set(345.0d, 432.0d, 231.0d);
      Vector3 v2 = new Vector3();
      v2.set(35.0d, 42.0d, 12.0d);
      v1.copy(v2);
  }
}
