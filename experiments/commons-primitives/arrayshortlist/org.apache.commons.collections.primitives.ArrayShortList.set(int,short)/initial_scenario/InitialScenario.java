/*
* File contenente lo scenario iniziale, generato manualmente
*
*/

package org.apache.commons.collections.primitives;
import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.collections.primitives.ArrayShortList;

public class InitialScenario{

  @Test
  public void test0()  throws Throwable  {

	ArrayShortList collection0 = new ArrayShortList();
	Short short0 = new Short("65");
	Short short1 = new Short("12");
	Short short2 = new Short("88");
	boolean add0 = collection0.add(short0);
	boolean add1 = collection0.add(short1);
	boolean add2 = collection0.add(short2);
	short set0 = collection0.set(0,short1);
  }
}
