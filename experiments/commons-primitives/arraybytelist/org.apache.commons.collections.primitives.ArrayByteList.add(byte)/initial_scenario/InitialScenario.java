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
	boolean add0 = collection0.add(byte0);
  }
}
