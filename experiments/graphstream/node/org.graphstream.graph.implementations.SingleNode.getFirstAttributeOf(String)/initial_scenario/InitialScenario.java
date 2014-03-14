package org.graphstream.graph.implementations;

import static org.junit.Assert.*;
import org.junit.Test;
import org.graphstream.graph.implementations.AbstractNode;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.graph.implementations.SingleNode;

public class AbstractEdgeEvoSuiteTest {

  @Test
  public void test0()  throws Throwable  {
      SingleGraph multiGraph0 = new SingleGraph("graph", true, true);
      SingleNode multiNode0 = new SingleNode(multiGraph0, "node");
      Object[] ob = new Object[]{325, "a possible value", 42000};
      multiNode0.addAttribute(attributeName, new Integer(452));
      Integer attr = multiNode0.getFirstAttributeOf(attributeName);
  }
}
