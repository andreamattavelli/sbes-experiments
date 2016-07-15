/*
* File contenente lo scenario iniziale, generato manualmente
*
*/

package org.apache.commons.collections.primitives;
import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.collections.primitives.IntStack;

public class InitialScenario{

  @Test
  public void test0()  throws Throwable  {
	//Lo scenario iniziale rappresenta l'uso generale di un metodo
  //Non uso la classe astratta, ma quella concreta
	
	IntStack stack0 = new IntStack();
  Integer int0 = new Integer(12);
  Integer int1 = new Integer(25);
  Integer int2 = new Integer(4);
  int add0 = stack0.push(int0);
  int add1 = stack0.push(int1);
  int add2 = stack0.push(int2);
  stack0.clear();
  }
}
