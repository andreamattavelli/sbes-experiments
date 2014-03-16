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
	  MultiNode node = new MultiNode(multiGraph0, "aNode");
	  Object[] ob1 = new Object[]{325, "a possible value", 42000};
	  node.changeAttribute("value1", ob1);
  }
}
