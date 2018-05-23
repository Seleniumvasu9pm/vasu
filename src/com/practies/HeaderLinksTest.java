package com.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HeaderLinksTest
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("Http://Bing.com");
		driver.manage().window().maximize();
		//identify header section by using classname and stored in a virable
	WebElement header=driver.findElement(By.className("sw_tb"));
	
//capture multiple links under header by using tagname
	
	List<WebElement> headerLinks=header.findElements(By.tagName("a"));
	
	System.out.println(headerLinks.size());

	}

}
