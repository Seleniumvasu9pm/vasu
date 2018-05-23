package com.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RedbusTest {

	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://Redbus.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='src']")).sendKeys("H");
		Thread.sleep(2000);
	List<WebElement> city=driver.findElements(By.xpath(".//*[@id='search']/div/div[1]/div/ul/li"));
		System.out.println(city.size());
		for(WebElement element:city)
		{
			System.out.println(element.getText());
		}
	}

}
