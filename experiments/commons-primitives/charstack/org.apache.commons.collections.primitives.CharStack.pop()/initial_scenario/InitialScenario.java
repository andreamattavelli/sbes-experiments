/*
* File contenente lo scenario iniziale, generato manualmente
*
*/

package org.apache.commons.collections.primitives;
import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.collections.primitives.CharStack;

public class InitialScenario{

  @Test
  public void test0()  throws Throwable  {
	//Lo scenario iniziale rappresenta l'uso generale di un metodo
  	//Non uso la classe astratta, ma quella concreta
	
	CharStack stack0 = new CharStack();
	Character char0 = new Character('m');
	Character char1 = new Character('o'); 
	Character char2 = new Character('x');
	char add0 = stack0.push(char0);
	char add1 = stack0.push(char1);
	char add2 = stack0.push(char2);
	char pop0 = stack0.pop();
  }
}
