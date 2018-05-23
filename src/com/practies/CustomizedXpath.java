package com.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CustomizedXpath 
{
	public static void main(String[] args) 
	{
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://Google.co.in");
		driver.manage().window().maximize();
		//gmail
		//driver.findElement(By.xpath("//a[@class='gb_P']")).click();
		//images 
		//driver.findElement(By.xpath("//a[@class='gb_P'][@data-pid='2']")).click();
		driver.findElement(By.xpath("//*[text()='Images']")).click();
	}

}
