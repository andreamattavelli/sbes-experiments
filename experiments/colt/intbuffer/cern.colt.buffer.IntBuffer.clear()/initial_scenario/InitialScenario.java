package colt;

import org.junit.Test;

import cern.colt.buffer.IntBuffer;
import cern.colt.buffer.IntBufferConsumer;
import cern.colt.list.IntArrayList;

public class IntBufferTest {
	@Test(timeout = 4000)
	public void test11() throws Throwable {
		IntArrayList intArrayList0 = new IntArrayList();
		IntBuffer intBuffer0 = new IntBuffer((IntBufferConsumer) intArrayList0,
				0);
		intBuffer0.add(234523);
		intBuffer0.add(2345);
		intBuffer0.add(2345);
		intBuffer0.add(1);
		intBuffer0.add(1234243);
		intBuffer0.clear();
	}
}
