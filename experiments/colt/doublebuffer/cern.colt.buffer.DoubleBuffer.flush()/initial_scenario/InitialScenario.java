package colt;

import org.junit.Test;

import cern.colt.buffer.DoubleBuffer;
import cern.colt.buffer.DoubleBufferConsumer;
import cern.colt.list.DoubleArrayList;

public class InitialScenario {
	@Test
	public void test0() {
		DoubleArrayList doubleArrayList0 = new DoubleArrayList();
		DoubleBuffer doubleBuffer0 = new DoubleBuffer(
				(DoubleBufferConsumer) doubleArrayList0, 887);
		doubleBuffer0.add(23562);
		doubleBuffer0.add(12);
		doubleBuffer0.add(523452);
		doubleBuffer0.add(23562);
		doubleBuffer0.add(234234);
		doubleBuffer0.flush();
	}
}
