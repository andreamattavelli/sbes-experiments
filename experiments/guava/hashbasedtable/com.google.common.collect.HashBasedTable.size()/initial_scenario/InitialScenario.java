/*
 * This file was automatically generated by EvoSuite
 */

package com.google.common.collect;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.Map;

import org.junit.Test;

import com.google.common.collect.ArrayListMultimap;

public class StackEvoSuiteTest {

  @Test
  public void test0()  throws Throwable  {
    	HashBasedTable<Integer, String, Character> hashBasedTable0 = HashBasedTable.create();
		hashBasedTable0.put(0, "0", 'a');
		hashBasedTable0.put(1, "0", 'b');
		hashBasedTable0.put(0, "1", 'c');
		hashBasedTable0.put(2, "2", 'd');
		hashBasedTable0.put(2, "1", 'e');
		int i = hashBasedTable0.size();
  }
}
