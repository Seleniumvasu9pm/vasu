package com.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderTest 
{

	public static void main(String[] args) throws Exception 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://jqueryui.com/slider/");
		driver.manage().window().maximize();
		//identify frames
	//List<WebElement> frame=driver.findElements(By.tagName("iframe"));
		//System.out.println(frame.size());
		//giving focus to particular frame
		driver.switchTo().frame(0);
		WebElement sl=driver.findElement(By.xpath(".//*[@id='slider']/span"));
		
		
		Actions slider=new Actions(driver);
		slider.clickAndHold(sl).moveByOffset(90,0).release(sl).build().perform();
		Thread.sleep(3000);
		slider.clickAndHold(sl).moveByOffset(-90,0).release(sl).build().perform();
	}

}
