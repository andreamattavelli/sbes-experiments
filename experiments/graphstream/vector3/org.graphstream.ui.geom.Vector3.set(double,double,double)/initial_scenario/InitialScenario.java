package org.graphstream.ui.geom;

import static org.junit.Assert.*;
import org.junit.Test;
import org.graphstream.ui.geom.Vector3;

public class Vector3EvoSuiteTest {

  @Test
  public void test0() throws Throwable  {
      Vector3 v1 = new Vector3();
      double a = 320.0d;
      double b = 530.0d;
      double c = 123.0d;
      v1.set(a, b, c);
  }
}
