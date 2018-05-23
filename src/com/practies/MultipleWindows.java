package com.practies;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindows {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
	driver.get("https://www.naukri.com/");
	driver.manage().window().maximize();
	
Set<String>	windows=driver.getWindowHandles();

/*for(String child:windows)
{
	driver.switchTo().window(child);
	driver.close();
}*/
List<String> child=new ArrayList<>(windows);
driver.switchTo().window(child.get(2));
driver.close();
driver.switchTo().window(child.get(1));
driver.close();
driver.switchTo().window(child.get(0));
driver.close();
		
	}

}
