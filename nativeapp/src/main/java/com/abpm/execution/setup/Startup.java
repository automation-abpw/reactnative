package com.abpm.execution.setup;

//import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.MalformedURLException;

import java.net.URL;
import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.abpm.execution.setup.AppiumDriverInit;


public class Startup 

{

public static AndroidDriver driver;
static DesiredCapabilities capabilities = new DesiredCapabilities();

	public static void setUp() throws MalformedURLException 
	
	{
	    
		
		//capabilities.setCapability("deviceName", "e34290a9");
		
		capabilities.setCapability("deviceName", "9fa27b5e");
		//capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");
		
		capabilities.setCapability(CapabilityType.VERSION, "12.0");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("newCommandTimeout", 150);
		/*To avoid data Reset*/
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		//capabilities.setCapability(MobileCapabilityType.FULL_RESET, false);
		capabilities.setCapability(MobileCapabilityType.NO_RESET,false);
		capabilities.setCapability("appPackage", "com.abp.abpweddings");
		capabilities.setCapability("appActivity", "com.rnabpweddings.MainActivity");
	     
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		AppiumDriverInit.initDriver(driver);
		
   }

}
