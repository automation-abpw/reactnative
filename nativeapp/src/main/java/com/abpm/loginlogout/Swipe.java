/**
 * 
 */
package com.abpm.loginlogout;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Swipe 

{

	public static AndroidDriver driver;
	static DesiredCapabilities capabilities = new DesiredCapabilities();
	
	
	public static void main(String[] args) throws MalformedURLException
	
	{
		capabilities.setCapability("deviceName", "969257a3");
		//capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");
		capabilities.setCapability(CapabilityType.VERSION, "5.1.1");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("newCommandTimeout", 120);
		/*To avoid data Reset*/
		capabilities.setCapability(MobileCapabilityType.FULL_RESET, false);
		capabilities.setCapability("appPackage", "com.abp.abpweddings");
		capabilities.setCapability("appActivity", "com.abp.abpweddings.ui.activites.registration.SplashActivity");
	     
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}

}
