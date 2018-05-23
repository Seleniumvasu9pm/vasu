package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidationTest
{
@Test
public void verifyTest()
{
	/*String data="Qedge";
	String data1="Qedge";*/
	
	//Assert.assertEquals(data1, data);
	Assert.assertEquals(14, 15, "Both are not equal");
	
}
}
