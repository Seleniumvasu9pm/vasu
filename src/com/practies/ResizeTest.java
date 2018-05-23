package com.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizeTest 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		//identify frames
	//List<WebElement> frame=driver.findElements(By.tagName("iframe"));
		//System.out.println(frame.size());
		//giving focus to particular frame
		driver.switchTo().frame(0);
		WebElement rs=driver.findElement(By.xpath(".//*[@id='resizable']/div[3]"));
		
		
		Actions resize=new Actions(driver);
		resize.clickAndHold(rs).moveByOffset(90, 100).release(rs).build().perform();
	}

}
