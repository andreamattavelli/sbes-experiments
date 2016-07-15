/*
* File contenente lo scenario iniziale, generato manualmente
*
*/

package org.apache.commons.collections.primitives;
import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.collections.primitives.ArrayDoubleList;

public class InitialScenario{

  @Test
  public void test0()  throws Throwable  {

	ArrayDoubleList collection0 = new ArrayDoubleList();
	Double double0 = new Double(2.1);
	Double double1 = new Double(4.5);
	Double double2 = new Double(7.4);
	boolean add0 = collection0.add(double0);
	boolean add1 = collection0.add(double1);
	boolean add2 = collection0.add(double2);
	DoubleList subList0 = collection0.subList(1,2);
  }
}
