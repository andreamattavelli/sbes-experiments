/*
 * This file was automatically generated by EvoSuite
 */

package stack.util;

import static org.junit.Assert.*;
import org.junit.Test;
import stack.util.Stack;

public class InitialScenario {


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 stack.util.Stack.peek()Ljava/lang/Object;: I8 Branch 1 IFNE L104 - true
   */

  @Test
  public void test0()  throws Throwable  {
      Stack<Integer> stack0 = new Stack<Integer>();
      Integer integer0 = new Integer(234);
      Integer integer1 = new Integer(55);
      Integer integer2 = new Integer(-602);
      boolean boolean0 = stack0.add(integer0);
      boolean boolean1 = stack0.add(integer1);
      boolean boolean2 = stack0.add(integer2);
      Integer integer3 = stack0.lastElement();
  }
}
