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
    	Table<Integer, String, Character> table = TreeBasedTable.create();
		table.put(0, "0", 'a');
		table.put(1, "0", 'b');
		HashBasedTable<Integer, String, Character> hashBasedTable0 = HashBasedTable.create(table);
  }
}
