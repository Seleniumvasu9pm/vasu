package com.practies;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailTest 
{
	public static void main(String[] args) throws Exception 
	{
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.navigate().to("Http://gmail.com");
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait myWait=new WebDriverWait(driver, 30);
	driver.findElement(By.id("identifierId")).sendKeys("vasu.584");
	driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
	myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")));
	//Thread.sleep(2000);//static
	driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("afafag");

	}

}
