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
	Integer argumentInteger = new Integer(1);
	Boolean boolean0 = new Boolean(true);
	collection0.add(argumentInteger,boolean0);
  }
}
