package com.cn.fromCheck;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

//test suite is supported in junit 4 @Runwith will create a bridge between junit 4 and junit 5
@RunWith(JUnitPlatform.class)
@IncludeTags("valid")//this tag will include selected tags needed
@SelectClasses({VoterValidator.class,ValidateBoothName.class})
public class TestSuite {

}

