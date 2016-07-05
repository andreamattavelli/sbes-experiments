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
	
	Integer int0 = new Integer(34);
	Integer int1 = new Integer(12);
	boolean add0 = collection0.add(0,int0);
	boolean add1 = collection0.add(0,int1);

  }
}
