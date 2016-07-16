package colt;

import org.junit.Test;

import cern.colt.buffer.IntBuffer;
import cern.colt.buffer.IntBufferConsumer;
import cern.colt.list.IntArrayList;

public class InitialScenario {
	@Test
	public void test11() throws Throwable {
		IntArrayList intArrayList0 = new IntArrayList();
		IntBuffer intBuffer0 = new IntBuffer((IntBufferConsumer) intArrayList0,
				0);
		int[] intArray0 = new int[8];
		intArray0[2] = 2523545;
		intArray0[4] = 12342;
		intArray0[5] = 456456;
		intArray0[7] = 23;
		intBuffer0.addAllOf(intArrayList0);
	}
}
