/*
* File contenente lo scenario iniziale, generato manualmente
*
*/

package org.apache.commons.collections.primitives;
import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.collections.primitives.ArrayByteList;

public class InitialScenario{

  @Test
  public void test0()  throws Throwable  {

	ArrayByteList collection0 = new ArrayByteList();
	ArrayByteList argumentCollection = new ArrayByteList();
	Byte byte0 = new Byte("13");
	Byte byte1 = new Byte("44");
	Byte byte2 = new Byte("53");
	boolean add0 = argumentCollection.add(byte0);
	boolean add1 = argumentCollection.add(byte1);
	boolean add2 = argumentCollection.add(byte2);
	boolean add3 = collection0.add(byte0);
	boolean add4 = collection0.add(byte2);
	boolean containsAll0 = collection0.containsAll(argumentCollection);
  }
}
