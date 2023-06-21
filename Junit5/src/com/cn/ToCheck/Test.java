package com.cn.ToCheck;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.cn.fromCheck.VoterValidator;

//Junit5
//if u want to throw the type of exception to be thrown we can use that type of exception assertthrow method from JUNIT 
public class Test {
	@org.junit.Test
	public void test() throws Exception {
		int age = -1;
		VoterValidator validator = new VoterValidator();
		boolean obtained = validator.validateVoterAge(age);
		Exception e = Assertions.assertThrows(Exception.class, () -> validator.validateVoterAge(age));
		Assertions.assertEquals("Invalid Age!", e.getMessage());
	}

	@ParameterizedTest
	@CsvSource(value= {"18","20"})
	public void Validatetest2(int age) throws Exception {
	
		VoterValidator validator = new VoterValidator();
		boolean obtained = validator.validateVoterAge(age);
		Assertions.assertTrue(obtained);
	}
	@org.junit.Test
	public void validateVoterAgeInvalidtest() throws Exception{
		int age =17;
		VoterValidator validator = new VoterValidator();
		boolean obtained=validator.validateVoterAge(age);
		Assertions.assertFalse(obtained);
		
	}
}
