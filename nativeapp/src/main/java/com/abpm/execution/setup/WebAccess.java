package com.abpm.execution.setup;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.abpm.excelhandler.ReadExcelStartup;
import com.abpm.execution.setup.WebDriverInit;


public class WebAccess 

{

public static WebDriver driver;


	public static void set() throws MalformedURLException 
	
	{
		String driverloc=ReadExcelStartup.geckodriver;
		System.setProperty("webdriver.chrome.driver",driverloc);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverInit.initDriver(driver);

   }

}



