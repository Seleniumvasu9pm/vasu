package com.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleTest 
{
	@Test()
	public void method1()
	{
		System.out.println("method1");
	}
	@Test()
	public void method2()
	{
		System.out.println("method2");
	}
	@Test()
	public void method3()
	{
		System.out.println("method3");
	}
	@BeforeTest
	public void before()
	{
		System.out.println("BeforeTest Executed");
	}
	@AfterTest
	public void after()
	{
		System.out.println("AfterTest Executed");
	}
}
