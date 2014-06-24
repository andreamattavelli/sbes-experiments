package org.graphstream.graph.implementations;

import static org.junit.Assert.*;
import org.junit.Test;
import org.graphstream.graph.implementations.AbstractEdge;
import org.graphstream.graph.implementations.AbstractGraph;
import org.graphstream.graph.implementations.AdjacencyListGraph;
import org.graphstream.graph.implementations.MultiGraph;
import org.graphstream.graph.implementations.MultiNode;
import org.graphstream.graph.implementations.SingleNode;

public class AbstractEdgeEvoSuiteTest {

  @Test
  public void test0()  throws Throwable  {
      MultiGraph multiGraph0 = new MultiGraph("graph", true, true);
      SingleNode singleNode0 = new SingleNode(multiGraph0, "0");
      SingleNode singleNode1 = new SingleNode(multiGraph0, "1");
      AbstractEdge abstractEdge0 = new AbstractEdge("-", singleNode0, singleNode1, true);
      Object[] ob = new Object[]{325, "a possible value", 42000};
      abstractEdge0.addAttribute("value", ob);
  }
}
