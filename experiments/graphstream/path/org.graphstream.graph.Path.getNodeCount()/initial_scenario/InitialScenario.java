/*
 * This file was automatically generated by EvoSuite
 */

package org.graphstream.graph.implementations;

import static org.junit.Assert.*;
import org.junit.Test;
import org.graphstream.graph.implementations.AbstractEdge;
import org.graphstream.graph.Path;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.graph.implementations.SingleNode;

public class AbstractEdgeEvoSuiteTest {

  @Test
  public void test0()  throws Throwable  {
      SingleGraph graph = new SingleGraph("graph");
      SingleNode node0 = new SingleNode(graph, "node0");
      SingleNode node1 = new SingleNode(graph, "node1");
      AbstractEdge edge0 = new AbstractEdge("edge", node0, node1, true);
      Path p = new Path();
      p.setRoot(node0);
      p.add(edge0);
      int nodeCount = p.getNodeCount();
  }
}