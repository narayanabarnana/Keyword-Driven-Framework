package com.qa.hs.keyword.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver init_Driver(String browserName)
	{
		if(browserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\1024812\\Desktop\\Selenium Data\\chromedriver_win32\\chromedriver.exe");
			if(prop.getProperty("headless").equals("yes")){
				
				//headless mode
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--headless");
				driver = new ChromeDriver(options);
				
			}
			else
			{
				driver=new ChromeDriver();
			}
			
		} else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\1024812\\Desktop\\Selenium Data\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		return driver;
	}
	
	
	public Properties init_properties() throws IOException
	{
		prop=new Properties();
		try {
			
			FileInputStream ip=new FileInputStream("C:\\Users\\1024812\\Desktop\\Selenium\\KeywordDrivenFramework\\src\\main\\java\\com\\qa\\hs\\keyword\\config\\config.properties");
			prop.load(ip);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
			System.out.println("File not found");
		}
		return prop;
	}
	

}
