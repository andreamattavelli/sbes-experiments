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
	//Boolean boolean0 = new Boolean(true);
	/*	Proviamo a mettere false perché  il problema è che add(boolean) 
		ritorna un boolean mentre add(int, boolean) no. 
		SBES prova a mettere p0 (un ipotetico valore usato come input 
		a add(int x, boolean p0)) ma non è semanticamente corretto. 
		Proviamo a mettere nello scenario iniziale false, e vediamo cosa
		fa SBES.
	*/
	Integer int0 = new Integer(34);
	boolean add0 = collection0.add(int0);
  }
}
