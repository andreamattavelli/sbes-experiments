/*
* File contenente lo scenario iniziale, generato manualmente
*
*/

package org.apache.commons.collections.primitives;
import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.collections.primitives.LongStack;

public class InitialScenario{

  @Test
  public void test0()  throws Throwable  {
	//Lo scenario iniziale rappresenta l'uso generale di un metodo
  	//Non uso la classe astratta, ma quella concreta
	
	LongStack stack0 = new LongStack();
	Long long0 = new Long(235);
	Long long1 = new Long(589);
	Long long2 = new Long(985);
	long add0 = stack0.push(long0);
	long add1 = stack0.push(long1);
	long add2 = stack0.push(long2);
	long peek0 = stack0.peek(2);
  }
}
