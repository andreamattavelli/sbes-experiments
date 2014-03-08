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
      AdjacencyListGraph adjacencyListGraph0 = new AdjacencyListGraph("-");
      MultiNode multiNode0 = new MultiNode((AbstractGraph) adjacencyListGraph0, "Tz|!");
      MultiGraph multiGraph0 = new MultiGraph("Tz|!", true, true);
      SingleNode singleNode0 = new SingleNode(multiGraph0, "-");
      AbstractEdge abstractEdge0 = new AbstractEdge("-", multiNode0, singleNode0, true);
      Object[] arrayObject0 = new Object[]{325, "a possible value", 42000};
      abstractEdge0.setAttribute("value", arrayObject0);
  }
}
