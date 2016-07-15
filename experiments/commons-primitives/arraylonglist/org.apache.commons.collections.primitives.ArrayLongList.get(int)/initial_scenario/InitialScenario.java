/*
* File contenente lo scenario iniziale, generato manualmente
*
*/

package org.apache.commons.collections.primitives;
import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.collections.primitives.ArrayLongList;

public class InitialScenario{

  @Test
  public void test0()  throws Throwable  {

	ArrayLongList collection0 = new ArrayLongList();
	Long long0 = new Long(235);
	Long long1 = new Long(589);
	Long long2 = new Long(973);
	boolean add0 = collection0.add(long0);
	boolean add1 = collection0.add(long1);
	boolean add2 = collection0.add(long2);
	long get0 = collection0.get(1);
  }
}
