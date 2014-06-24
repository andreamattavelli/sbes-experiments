package org.graphstream.ui.geom;

import static org.junit.Assert.*;
import org.junit.Test;
import org.graphstream.ui.geom.Vector3;

public class Vector3EvoSuiteTest {

  @Test
  public void test0() throws Throwable  {
      Vector3 v1 = new Vector3();
      v1.set(345.0d, 432.0d, 123.0d);
      double val = v1.z();
  }
}
