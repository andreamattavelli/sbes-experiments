/*
 * This file was automatically generated by EvoSuite
 */

package com.google.common.collect;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import com.google.common.collect.ArrayListMultimap;

public class InitialScenario {

  @Test
  public void test0()  throws Throwable  {
    	LinkedListMultimap<Integer, String> linkedListMultimap0 = LinkedListMultimap.create();
		boolean boolean1 = linkedListMultimap0.put(-1698, "pluto");
		boolean boolean2 = linkedListMultimap0.put(123, "asd");
		boolean boolean3 = linkedListMultimap0.put(18, "ginger");
		boolean boolean4 = linkedListMultimap0.put(18, "ginger2");
		List<String> string0 = linkedListMultimap0.get(18);
  }
}
