package org.graphstream.graph.implementations;

import static org.junit.Assert.*;
import org.junit.Test;
import org.graphstream.graph.implementations.AbstractNode;
import org.graphstream.graph.implementations.MultiGraph;
import org.graphstream.graph.implementations.MultiNode;

public class MultiNodeEvoSuiteTest {

  @Test
  public void test0()  throws Throwable  {
      MultiGraph multiGraph0 = new MultiGraph("graph", true, true);
	  Node node = multiGraph0.addNode("aNode");
	  Object[] ob1 = new Object[]{325, "a possible value", 42000};
	  Object[] ob2 = new Object[]{245, "another possible value", 14587};
	  node.changeAttribute("value1", ob1);
  }
}
