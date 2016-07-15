/*
* File contenente lo scenario iniziale, generato manualmente
*
*/

package org.apache.commons.collections.primitives;
import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.collections.primitives.ArrayFloatList;

public class InitialScenario{

  @Test
  public void test0()  throws Throwable  {
	//Lo scenario iniziale rappresenta l'uso generale di un metodo
  	//Non uso la classe astratta, ma quella concreta
	
	ArrayFloatList collection0 = new ArrayFloatList();
	Float float0 = new Float(12.5f);
	Float float1 = new Float(23.3f);
	Float float2 = new Float(58.1f);
	boolean add0 = collection0.add(float0);
	boolean add1 = collection0.add(float1);
	boolean add2 = collection0.add(float2);
	float removeElementAt0 = collection0.removeElementAt(1);
  }
}
