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
    	Integer integer0 = 1;
		Integer integer1 = -141097;
		ImmutableMultiset<Integer> map = RegularImmutableMultiset.of(integer0, integer1);
		boolean boolean0 = map.contains(integer0);
  }
}
