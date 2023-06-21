package com.cn.ToCheck;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.cn.fromCheck.ValidateBoothName;

public class BoothNameValidatortest {
	@AfterAll
	public static void AfterAll() {
		System.out.println("All tested");
	}
	@BeforeAll
	public static void beforeAll() {
		System.out.println("Started testing");
	}
	static int counter;
	@BeforeEach
	public void beforeEach() {
		System.out.println("before test case "+ ++counter);
	}
	@BeforeEach
	public void AfterEach() {
		System.out.println("After test case "+ ++counter);
	}
	@org.junit.jupiter.api.Test
	public void validateBoothNameTest() throws Exception {
		String name = "";
		ValidateBoothName validator=new ValidateBoothName();
		Assertions.assertFalse(validator.validateBoothName(name));
	}
	@org.junit.jupiter.api.Test
	@Tag("valid")
	public void validateBoothNameTest3() throws Exception {
		String name = "Ravi";
		ValidateBoothName validator=new ValidateBoothName();
		Assertions.assertTrue(validator.validateBoothName(name));
	}
	@Test
	public void validateBoothNameTest2() {
		String name=null;
		ValidateBoothName validator=new ValidateBoothName();
		Exception e=Assertions.assertThrows(Exception.class,()->validator.validateBoothName(name));
		Assertions.assertEquals("Invalid name",e.getMessage());
	}
}
