package com.testng;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AddEmpTest extends OHRM
{
@Test
public void empAdd() throws Exception
{
	
	driver.findElement(By.linkText("PIM")).click();
	driver.findElement(By.linkText("Add Employee")).click();
	driver.findElement(By.id("firstName")).sendKeys("Vasudeva");
	driver.findElement(By.id("lastName")).sendKeys("Selenium23");
	//driver.findElement(By.xpath(".//*[@id='photofile']")).click();
	//driver.findElement(By.xpath(".//*[@id='photofile']")).sendKeys("D:\\desert.jpg");
	//Runtime.getRuntime().exec("C:\\Users\\vasu\\Desktop\\shobha.exe");
	Thread.sleep(2000);
	driver.findElement(By.id("btnSave")).click();
	
}
}
