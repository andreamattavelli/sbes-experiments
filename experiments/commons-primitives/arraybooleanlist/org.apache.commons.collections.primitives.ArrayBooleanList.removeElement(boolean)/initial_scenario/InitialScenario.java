/*
* File contenente lo scenario iniziale, generato manualmente
*
*/

package org.apache.commons.collections.primitives;
import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.collections.primitives.ArrayBooleanList;

public class InitialScenario{

  @Test
  public void test0()  throws Throwable  {
	//Lo scenario iniziale rappresenta l'uso generale di un metodo
  	//Non uso la classe astratta, ma quella concreta
	
	ArrayBooleanList collection0 = new ArrayBooleanList();
	Boolean boolean0 = new Boolean(true);
	Boolean boolean1 = new Boolean(false);
	Boolean boolean2 = new Boolean(false);
	boolean add0 = collection0.add(boolean0);
	boolean add1 = collection0.add(boolean1);
	boolean add2 = collection0.add(boolean2);
	boolean removeElement0 = collection0.removeElement(boolean1);
  }
}
