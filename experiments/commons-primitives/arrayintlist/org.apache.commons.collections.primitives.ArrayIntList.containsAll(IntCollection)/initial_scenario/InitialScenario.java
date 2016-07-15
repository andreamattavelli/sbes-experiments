/*
* File contenente lo scenario iniziale, generato manualmente
*
*/

package org.apache.commons.collections.primitives;
import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.collections.primitives.ArrayIntList;

public class InitialScenario{

  @Test
  public void test0()  throws Throwable  {
	//Lo scenario iniziale rappresenta l'uso generale di un metodo
  	//Non uso la classe astratta, ma quella concreta
	
	ArrayIntList collection0 = new ArrayIntList();
	ArrayIntList argumentCollection = new ArrayIntList();
	Integer int0 = new Integer(12);
	Integer int1 = new Integer(28);
	Integer int2 = new Integer(3);
	boolean add0 = argumentCollection.add(int0);
	boolean add1 = argumentCollection.add(int1);
	boolean add2 = argumentCollection.add(int2);
	boolean add3 = collection0.add(int0);
	boolean add4 = collection0.add(int2);
	boolean contains0 = collection0.containsAll(argumentCollection);
  }
}
