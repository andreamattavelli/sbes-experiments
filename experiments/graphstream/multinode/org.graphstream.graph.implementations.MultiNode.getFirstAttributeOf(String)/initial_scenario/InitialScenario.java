package org.graphstream.graph.implementations;

import static org.junit.Assert.*;
import org.junit.Test;
import org.graphstream.graph.implementations.AbstractNode;
import org.graphstream.graph.implementations.MultiGraph;
import org.graphstream.graph.implementations.MultiNode;

public class InitialScenario {

  @Test
  public void test0()  throws Throwable  {
      MultiGraph multiGraph0 = new MultiGraph("graph", true, true);
      MultiNode multiNode0 = new MultiNode(multiGraph0, "node");
      String attributeName = "value";
      Object[] ob = new Object[]{325, "a possible value", 42000};
      multiNode0.addAttribute(attributeName, new Integer(452));
      Integer attr = multiNode0.getFirstAttributeOf(attributeName);
  }
}
