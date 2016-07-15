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
	ArrayBooleanList argumentCollection = new ArrayBooleanList();
	Boolean boolean0 = new Boolean(true);
	Boolean boolean1 = new Boolean(false);
	Boolean boolean2 = new Boolean(false);
	boolean add0 = argumentCollection.add(boolean0);
	boolean add1 = argumentCollection.add(boolean1);
	boolean add2 = argumentCollection.add(boolean2);
	boolean add3 = collection0.add(boolean0);
	boolean add4 = collection0.add(boolean2);
	boolean contains0 = collection0.containsAll(argumentCollection);
  }
}
