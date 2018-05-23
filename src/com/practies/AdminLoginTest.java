package com.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdminLoginTest
{
	public static void main(String[] args)
	{
		String expText="Welcome Admin";
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		String actText=driver.findElement(By.id("welcome")).getText();
		if (expText.equals(actText)) 
		{
			System.out.println("AdminLogin Successfully");
		}else
		{
			System.out.println("AdminLogin Fail");
		}
		
		/*if (driver.findElement(By.id("menu_pim_viewPimModule")).isDisplayed())
		{
			System.out.println("AdminLogin Successfully");
		}else
		{
			System.out.println("AdminLogin Fail");
		}*/

	}

}
