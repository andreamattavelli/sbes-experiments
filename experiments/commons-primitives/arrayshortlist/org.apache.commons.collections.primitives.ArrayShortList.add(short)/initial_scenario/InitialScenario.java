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
	boolean add0 = collection0.add(short0);
  }
}
