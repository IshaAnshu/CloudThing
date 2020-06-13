package com.cloudthing.technical.coderound.AutomationCodeBase;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


public class ReadConfig {

    Properties pro;
	
	private static ReadConfig obj;
	
	public static ReadConfig getInstance()
	{
		if(obj == null)
			obj = new ReadConfig();
		return obj;	
	}
	
	private ReadConfig()
	{
		File src = new File("./Configuration/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}
	public  String getApplicationURL()
	{
		String url=pro.getProperty("baseURL");
		return url;
	}

	
	public  String getChromePath()
	{
	String chromepath=pro.getProperty("chromepath");
	return chromepath;
	}
	
	public  String getIEPath()
	{
	String iepath=pro.getProperty("iepath");
	return iepath;
	}
	
	public  String getFirefoxPath()
	{
	String firefoxpath=pro.getProperty("firefoxpath");
	return firefoxpath;
	}

		
}




