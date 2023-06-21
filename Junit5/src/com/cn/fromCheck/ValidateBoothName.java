package com.cn.fromCheck;

public class ValidateBoothName {

	public boolean validateBoothName(String name) throws Exception {
		if(name==null)throw new Exception("Invalid name");
		else if(name.isEmpty()) return false;
		else return true;
	}
}
