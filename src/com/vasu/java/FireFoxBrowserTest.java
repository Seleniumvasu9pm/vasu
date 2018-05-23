package com.vasu.java;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserTest 
{
	public static void main(String[] args)
	{
		//launch firefox
FirefoxDriver driver=new FirefoxDriver();
//navigate to Gmail
driver.get("Http://gmail.com");

	}

}
