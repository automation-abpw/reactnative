package com.abpm.execution.setup;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class AppiumDriverInit {
	
	private static AndroidDriver mDriver;
	
	// initialized
	
	public static void initDriver(AndroidDriver driver){
		System.out.println("----initDriver-----");
		mDriver = driver;
	}
	
	// return driver object
	public static AndroidDriver getDriver() {
		return mDriver;
	}
	
	
}


