package com.infy.forAssesment;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;


//main point here - regression testing is possible
public class DynamicCalculatortest {

	private Calculator calculator = new Calculator();

	@TestFactory
	Collection<DynamicTest> converttoNumber() {
		List<String> romanSymbolList = new ArrayList<>(Arrays.asList("I", "II", "III", "IV", "V", "VI"));
		List<Integer> number = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
		Collection<DynamicTest> dynamicTests = new ArrayList<DynamicTest>();
		for (int i = 0; i < romanSymbolList.size(); i++) {
			String romanSymbol = romanSymbolList.get(i);
			Integer num = number.get(i);
			Executable executable = () -> assertEquals(num, calculator.convertToNumber(romanSymbol));
			String testName = "Testing Input" + romanSymbol;
			DynamicTest dynamicTest = DynamicTest.dynamicTest(testName, executable);
			dynamicTests.add(dynamicTest);
		}
		return dynamicTests;
	}
}
