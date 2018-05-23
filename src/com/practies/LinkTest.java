package com.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("Http://Google.co.in");
		driver.manage().window().maximize();
		//identify all links by using tagname and stored into a variable
	List<WebElement> list=driver.findElements(By.tagName("a"));
	System.out.println(list.size());
	for (int i = 0; i < list.size(); i++) 
	{
		if(list.get(i).getText().equals("Images"))
		{
			list.get(i).click();
			break;
		}
	}
		

	}

}
