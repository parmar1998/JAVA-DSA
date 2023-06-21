package com.infy;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MainTest {

	@Test
	public void shouldreturnTrue() {
		Main main=new Main();
		assertTrue(main.getboolean());
	}
}
