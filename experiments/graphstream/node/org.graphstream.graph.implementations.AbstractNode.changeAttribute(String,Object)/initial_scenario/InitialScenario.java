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
      Abstract abstractNode0 = new AbstractNode(mutliGraph0, "node");
      Object[] ob = new Object[]{325, "a possible value", 42000};
      abstractNode0.changeAttribute("value", ob);
  }
}
