package com.cn.fromCheck;

public class VoterValidator {

public boolean validateVoterAge(int age) throws  Exception 
{
	if(age<0) throw new Exception("Invalid Age");
	else if(age>=18) return true;
	else return false;
}

}

