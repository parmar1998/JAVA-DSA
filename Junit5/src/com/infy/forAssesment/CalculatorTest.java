package com.infy.forAssesment;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

//import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	Calculator calculator = new Calculator();

	@Test
//	@Disabled("until the bug is fixed") //if we do not want a test to run
	void additionTest() {
		assertEquals(20, calculator.addition(10, 10));// checks the actual value and expected results
	}

	// Assert that actual is null
	@Test
	void assertNullTest() {
		String var = null;
		assertNull("Expecting a null value for var ", var);
	}

	@Test
	void assertNotNullTest() {
		String var = null;
		assertNull("Expecting a not null value for var ", var);
	}

	@Test
	void assertFalseTest() {
		int expected = Arrays.asList("x", "y", "z").size();
		int result = Arrays.asList("a", "b", "c", "d").size();
		assertTrue(result > expected);
	}

	@Test
	void assertTrueTest() {
		int expected = Arrays.asList("x", "y", "z").size();
		int result = Arrays.asList("a", "b", "c", "d").size();
		assertTrue(result > expected);
	}

	@Test
	void assertNotSameTest() {
		String c2 = "JAVA";
		String c1 = "java";
		assertNotSame("Expecting different objects for c1 aand c2", c1, c2);
	}

	@Test
	void assertSameTest() {
		String c2 = "JUNIT";
		String c1 = "JUNIT";
		assertSame("Expecting same objects for c1 aand c2", c1, c2);
	}

	@Test
	void arrayEquals() {
		int expected[] = { 10, 20, 30, 40 };
		int result[] = { 10, 20, 30, 40 };
		assertArrayEquals(expected, result);
	}
	
	@Test
	void divisionTest() {
		Exception exception=assertThrows(ArithmeticException.class, ()->calculator.division(2, 0));
		assertEquals("Divide by zero", exception.getMessage());
	}
}
