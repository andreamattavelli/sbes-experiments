/*
* File contenente lo scenario iniziale, generato manualmente
*
*/

package org.apache.commons.collections.primitives;
import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.collections.primitives.BooleanStack;

public class InitialScenario{

  @Test
  public void test0()  throws Throwable  {
	//Lo scenario iniziale rappresenta l'uso generale di un metodo
  	//Non uso la classe astratta, ma quella concreta
	
  BooleanStack stack0 = new BooleanStack();
  Boolean boolean0 = new Boolean(true);
  Boolean boolean1 = new Boolean(false);
  Boolean boolean2 = new Boolean(true);
  boolean add0 = stack0.push(boolean0);
  boolean add1 = stack0.push(boolean1);
  boolean add2 = stack0.push(boolean2);
  boolean get0 = stack0.get(2);
  }
}
