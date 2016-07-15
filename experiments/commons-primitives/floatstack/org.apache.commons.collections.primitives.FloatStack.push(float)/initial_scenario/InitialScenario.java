/*
* File contenente lo scenario iniziale, generato manualmente
*
*/

package org.apache.commons.collections.primitives;
import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.collections.primitives.FloatStack;

public class InitialScenario{

  @Test
  public void test0()  throws Throwable  {
	//Lo scenario iniziale rappresenta l'uso generale di un metodo
  	//Non uso la classe astratta, ma quella concreta
	
	FloatStack stack0 = new FloatStack();
	Float float0 = new Float(3.2f);
	Float float1 = new Float(25.5f);
	Float float2 = new Float(75.8f);
	float add0 = stack0.push(float0);
	float add1 = stack0.push(float1);
	float add2 = stack0.push(float2);
  }
}
