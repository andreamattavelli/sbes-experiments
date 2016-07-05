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
	ArrayDoubleList argumentCollection = new ArrayDoubleList();
	Double double0 = new Double(2.1);
	Double double1 = new Double(4.5);
	Double double2 = new Double(7.4);
	boolean add0 = argumentCollection.add(double0);
	boolean add1 = argumentCollection.add(double1);
	boolean add2 = argumentCollection.add(double2);
	boolean addAll0 = collection0.addAll(argumentCollection);
  }
}
