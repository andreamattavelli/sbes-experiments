package org.graphstream.graph.implementations;

import static org.junit.Assert.*;
import org.junit.Test;
import org.graphstream.graph.implementations.AbstractNode;
import org.graphstream.graph.implementations.MultiGraph;
import org.graphstream.graph.implementations.MultiNode;

public class AbstractEdgeEvoSuiteTest {

  @Test
  public void test0()  throws Throwable  {
      MultiGraph multiGraph0 = new MultiGraph("graph", true, true);
      MultiNode multiNode0 = new MultiNode(multiGraph0, "node");
      Object[] ob = new Object[]{325, "a possible value", 42000};
      multiNode0.addAttribute("value", ob);
       Object[] attrs = abstractNode0.getAttribute("value");
  }
}
