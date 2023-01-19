package com.abpm.reusable.function;

import org.openqa.selenium.Dimension;

import com.abpm.execution.setup.AppiumDriverInit;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import org.testng.annotations.Test;

import com.abpm.excelhandler.ReadExcel;
import com.abpm.execution.setup.AppiumDriverInit;
import com.abpm.execution.setup.Startup;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class SwipeVertical 

{
	
	
	public static void swipeTopBottom()
	
	{
		//getDriver().manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Dimension size = AppiumDriverInit.getDriver().manage().window().getSize();
		System.out.println(size);

		int startx = (int) (size.width *0.40);
		int endx = (int) (size.width *0.20);
		int starty = size.height / 2;
		int finalendx = startx-endx;
		int endy = 0;

		TouchAction ta = new TouchAction(AppiumDriverInit.getDriver());
        ta.press(PointOption.point(207, 582)).moveTo(PointOption.point(8, 
                200)).release().perform();
      
     }

}	

