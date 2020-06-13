package com.cloudthing.technical.coderound.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import com.cloudthing.technical.coderound.AutomationCodeBase.Driver;
import com.cloudthing.technical.coderound.AutomationCodeBase.ReadConfig;

public class BaseClass {

	WebDriver driver;
	@BeforeTest
	public void baseTest()
	{
		ReadConfig readconfig= ReadConfig.getInstance();
		String url = readconfig.getApplicationURL();		
		Driver obj = Driver.getInstance();
		driver = obj.getDriver("Chrome");
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	
	
	@AfterTest
	public void quitBrowser()
	{
		driver.quit();
	}
}
