package colt;

import org.junit.Test;

import cern.colt.buffer.DoubleBuffer;
import cern.colt.list.DoubleArrayList;

public class DoubleBufferTest {
	@Test
	public void test0() {
		DoubleArrayList doubleArrayList0 = new DoubleArrayList();
		DoubleBuffer doubleBuffer0 = new DoubleBuffer(doubleArrayList0, 100);
		doubleBuffer0.add(3423);
		doubleBuffer0.add(23423);
		doubleBuffer0.add(242342);
		doubleBuffer0.add(67567);
		doubleBuffer0.add(5253245);
		doubleBuffer0.clear();
	}
}