package com.vasu.java;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonTest 
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("Http://amazon.in");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Potter");
		
		driver.findElement(By.className("nav-input")).click();
		
		

	}

}
