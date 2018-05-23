package com.method;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FunLibrary 
{
	//global variables
	public FirefoxDriver driver;
public String res;
//appLaunch
	public String appLaunch(String url)
	{
	 driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		if (driver.findElement(By.id("btnLogin")).isDisplayed())
		{
			res="Pass";
			
		}else
		{
			res="Fail";
		}
		return res;
	}
	//appLogin
	
	public String appLogin(String userName,String password)
	{
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		
		if (driver.findElement(By.id("welcome")).isDisplayed()) 
		{
			res="Pass";
		}else
		{
			res="Fail";
		}
		return res;
	}
	//empAdd
	public String empAdd(String fName,String lName) throws Exception
	{
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys(fName);
		driver.findElement(By.id("lastName")).sendKeys(lName);
		
		Thread.sleep(2000);
		driver.findElement(By.id("btnSave")).click();
		if (driver.findElement(By.xpath(".//*[@id='profile-pic']/h1")).isDisplayed()) 
		{
			res="Pass";
		}else
		{
			res="Fail";
		}
		return res;
	}
}
