package com.jUnit.tdd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class JUnitTest {
	public static JUnit j = new JUnit();
	
	@Test
	void revTest() {
		assertEquals("olleh", j.rev("hello"));
		assertEquals("dog", j.rev("god"));
		assertEquals(null, j.rev(null));
		assertEquals("", j.rev(""));
	}
}