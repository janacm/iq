package iq;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringManipulationTest {

	@Test
	public void test() {
		String s = "test";
		assertEquals("test", s);
	}

	@Test
	public void testConvert() {
		assertEquals("atlassian", StringManipulation.convert(7792875));
		assertEquals("a0", StringManipulation.convert(7));
	}
}
