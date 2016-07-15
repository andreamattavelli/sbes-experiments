/*
* File contenente lo scenario iniziale, generato manualmente
*
*/

package org.apache.commons.collections.primitives;
import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.collections.primitives.ShortStack;

public class InitialScenario{

  @Test
  public void test0()  throws Throwable  {
	//Lo scenario iniziale rappresenta l'uso generale di un metodo
  	//Non uso la classe astratta, ma quella concreta
	
	ShortStack stack0 = new ShortStack();
	Short short0 = new Short("65");
	Short short1 = new Short("12");
	Short short2 = new Short("88");
	short add0 = stack0.push(short0);
	short add1 = stack0.push(short1);
	short add2 = stack0.push(short2);
	boolean empty0 = stack0.empty();
  }
}
