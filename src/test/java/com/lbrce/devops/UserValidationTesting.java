package com.lbrce.devops;

public class UserValidationTesting {
@Test
public void testCase1()
{
	UserValidation uv=new UserVadliation();
	Assert.assertEquals(false,uv.check("srinu", "srinu@12345"));
}
}
