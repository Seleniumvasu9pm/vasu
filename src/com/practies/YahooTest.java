package com.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooTest
{
	public static void main(String[] args) throws Exception 
	{
		//String expTitle="Selenium - Yahoo India Search Results";
		//Launching Firefox
		
		FirefoxDriver driver=new FirefoxDriver();
		//navigate to yahoo
		driver.get("Http://Yahoo.com");
		//maximize window
		driver.manage().window().maximize();
		//identify search field with id and enter data by using Sendkeys
		driver.findElement(By.id("uh-search-box")).sendKeys("Selenium");
		Thread.sleep(2000);
		
	List<WebElement> list=driver.findElements(By.xpath("//*[starts-with(@id,'yui_3_18_0_3_15')]/span"));
		
	//	System.out.println(list.size());
	
	list.get(3).click();
		
		
		
		

	}

}
