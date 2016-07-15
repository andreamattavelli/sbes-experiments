/*
* File contenente lo scenario iniziale, generato manualmente
*
*/

package org.apache.commons.collections.primitives;
import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.collections.primitives.ByteStack;

public class InitialScenario{

  @Test
  public void test0()  throws Throwable  {
	//Lo scenario iniziale rappresenta l'uso generale di un metodo
  	//Non uso la classe astratta, ma quella concreta
	
	ByteStack stack0 = new ByteStack();
	Byte byte0 = new Byte("5");
	Byte byte1 = new Byte("26");
	Byte byte2 = new Byte("42");
	byte add0 = stack0.push(byte0);
	byte add1 = stack0.push(byte1);
	byte add2 = stack0.push(byte2);
	boolean isempty = stack0.empty();
  }
}
