package com.cloudthing.technical.coderound.AutomationCodeBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class Driver {
	
	private static Driver obj;
	ReadConfig readconfig= ReadConfig.getInstance();
	WebDriver driver;
	
	
	private Driver()
	{
		
	}
	public static Driver getInstance()
	{
		if(obj == null)
			obj = new Driver();
		return obj;
	}
	
	public WebDriver getDriver(String driverName)
	{	
		
		if(driverName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
			
			driver=new ChromeDriver();
		}
		else if(driverName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxPath());
			
			driver = new FirefoxDriver();
		}
		else if(driverName.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver",readconfig.getIEPath());
			
			driver = new InternetExplorerDriver();
		}
		return driver;

	}
	
	public void quitBrowser(WebDriver driver)
	{
		driver.quit();
	}
}
