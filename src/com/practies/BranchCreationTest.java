package com.practies;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BranchCreationTest 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		//applaunch
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vasu\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		//appLogin
		driver.findElement(By.name("txtuId")).sendKeys("Admin");
		driver.findElement(By.name("txtPword")).sendKeys("Admin");
		driver.findElement(By.name("login")).click();
		//branchcreation
		driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		driver.findElement(By.id("BtnNewBR")).click();
		driver.findElement(By.id("txtbName")).sendKeys("Aswini123");
		driver.findElement(By.id("txtAdd1")).sendKeys("Ameerpet");
		driver.findElement(By.id("txtZip")).sendKeys("22222");
		
	//dropdown
	Select country=new Select(driver.findElement(By.id("lst_counrtyU")));
	country.selectByVisibleText("INDIA");
	Thread.sleep(3000);
	Select state=new Select(driver.findElement(By.id("lst_stateI")));
	state.selectByVisibleText("Andhra Pradesh");
	Thread.sleep(3000);
	Select city=new Select(driver.findElement(By.id("lst_cityI")));
	city.selectByVisibleText("Hyderabad");
	Thread.sleep(3000);
driver.findElement(By.id("btn_insert")).click();
//alert
Alert alt=driver.switchTo().alert();
String text=alt.getText();
alt.accept();//ok
if (text.contains("created Sucessfully")) 
{
	System.out.println("Branch Created Successfully");
}else
{
	System.out.println("Branch Creation Faild");
}


	}

}
