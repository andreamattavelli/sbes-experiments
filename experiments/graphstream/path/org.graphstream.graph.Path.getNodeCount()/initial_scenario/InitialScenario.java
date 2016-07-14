package org.graphstream.graph;

import static org.junit.Assert.*;
import org.junit.Test;
import org.graphstream.graph.Path;
import org.graphstream.graph.implementations.SingleGraph;

public class InitialScenario {

  @Test
  public void test0()  throws Throwable  {
      SingleGraph sg = new SingleGraph("graph1");
      sg.addNode("0");
      sg.addNode("1");
      sg.addNode("2");
      sg.addNode("3");
      sg.addNode("4");
      
      sg.addEdge("edge0", "0", "1");
      sg.addEdge("edge1", "1", "2");
      sg.addEdge("edge2", "2", "3");
      sg.addEdge("edge3", "3", "4");
      sg.addEdge("edge4", "4", "1");
      
      Path p = new Path();
      p.setRoot(sg.getNode("0"));
      p.add(sg.getEdge("edge0"));
      p.add(sg.getEdge("edge1"));
      p.add(sg.getEdge("edge2"));
      p.add(sg.getEdge("edge3"));
      p.add(sg.getEdge("edge4"));
      int edgeCount = p.getNodeCount();
  }
}
