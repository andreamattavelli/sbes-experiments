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
	Byte byte0 = new Byte("13");
	Byte byte1 = new Byte("44");
	Byte byte2 = new Byte("53");
	boolean add0 = collection0.add(byte0);
	boolean add1 = collection0.add(byte1);
	boolean add2 = collection0.add(byte2);
	boolean contains0 = collection0.contains(byte1);
  }
}
