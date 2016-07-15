/*
* File contenente lo scenario iniziale, generato manualmente
*
*/

package org.apache.commons.collections.primitives;
import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.collections.primitives.DoubleStack;

public class InitialScenario{

  @Test
  public void test0()  throws Throwable  {
	//Lo scenario iniziale rappresenta l'uso generale di un metodo
  	//Non uso la classe astratta, ma quella concreta
	
	DoubleStack stack0 = new DoubleStack();
	Double double0 = new Double(2.1);
	Double double1 = new Double(4.5);
	Double double2 = new Double(7.4);
	double add0 = stack0.push(double0);
	double add1 = stack0.push(double1);
	double add2 = stack0.push(double2);
	stack0.clear();
  }
}
