package com.infy.forAssesment;

import static org.junit.jupiter.api.Assertions.*;

import java.util.logging.Logger;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class TestFixtureDemo {

	static final Logger logger = Logger.getLogger(TestFixtureDemo.class.getName());
	Calculator calculator = new Calculator();
	int a;
	int b;
	int actual;

	@BeforeEach // before each method
	void setup(TestInfo test) {
		a = 20;
		b = 30;
		logger.info("Before Test: " + test.getDisplayName());
	}

	@AfterEach // after each method
	void tearDown(TestInfo info) throws Exception {
		a = 0;
		b = 0;
		logger.info("After Test: " + info.getDisplayName());
	}

	@BeforeAll // only once before program starts
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll // only once before program ends
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void additionSuccessTest() {
		actual = calculator.addition(a, b);
		assertEquals(50, actual);
	}

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}

}
