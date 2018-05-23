package com.testng;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AdminLoginTest 
{
@Test
public void appLaunch()
{
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://opensource.demo.orangehrmlive.com");
	driver.manage().window().maximize();
	Assert.assertTrue(driver.findElement(By.id("btnLogin")).isDisplayed());
	//Assert.assertEquals(expTitle, actTitle);
	
}
}
