package org.graphstream.graph.implementations;

import static org.junit.Assert.*;
import org.junit.Test;
import org.graphstream.graph.implementations.AbstractNode;
import org.graphstream.graph.implementations.MultiGraph;
import org.graphstream.graph.implementations.MultiNode;
import java.util.Collection;

public class InitialScenario {

  @Test
  public void test0()  throws Throwable  {
      MultiGraph multiGraph0 = new MultiGraph("graph", true, true);
	  MultiNode node0 = multiGraph0.addNode("aNode");
	  MultiNode node1 = multiGraph0.addNode("anotherNode");
	  MultiNode node_ = multiGraph0.getNode("aNode");
	  multiGraph0.addEdge("edge1", node_, node1);
	  multiGraph0.addEdge("edge2", node_, node1);
	  Collection edges = node0.getEdgeSetBetween(node1.getId());
  }
}
