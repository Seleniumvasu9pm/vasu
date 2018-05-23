package com.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleRadio
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		
	WebElement table=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
	List<WebElement> rodioList=table.findElements(By.name("group1"));
System.out.println(rodioList.size());
for (int i = 0; i < rodioList.size(); i++) 
{
	//System.out.println(rodioList.get(i).getAttribute("checked")+"---"+rodioList.get(i).getAttribute("value"));
rodioList.get(i).click();
for (int j = 0; j <rodioList.size(); j++)
{
	System.out.println(rodioList.get(j).getAttribute("checked")+"---"+rodioList.get(j).getAttribute("value"));
}
System.out.println("######");
}
		

	}

}
