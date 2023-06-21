package com.infy.forAssesment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/*
 * use of tag to group like success test and failure test
 * We can also exclude the tag if needed i.e failure or success tag - this grouping can be done
 */
public class TestDemo {
	@Test // does not take any attributes
	void test() {
		fail("Not yet Implemented");
	}
	
	@Test
	@DisplayName("Test case to check addition")
	void additionTest() {
		Calculator calculator=new Calculator();
		assertEquals(2, calculator.addition(1, 1));
	}
}
