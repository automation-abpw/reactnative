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

public class SwipeVertical2 

{
	public static String actvertext;
	public static String extvertext;
	public AndroidDriver<MobileElement> driver;
	@BeforeTest
	
	public void start() throws MalformedURLException, InterruptedException
	
	{
		ReadExcel.Excel();	
		String email = ReadExcel.Loginemail;
		String pass = ReadExcel.Password;
		extvertext = ReadExcel.extvertext;
		
		
		try
		
		{
			 Startup.setUp();	
			 WebDriverWait wait = new WebDriverWait(AppiumDriverInit.getDriver(),90);
			 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[contains(@resource-id,'ctaText')]")));
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.TextView[@text ='GET STARTED']")).click();
			 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[contains(@resource-id,'loginText')]")));
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.TextView[@text ='LOGIN NOW']")).click();
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'loginusername')]")).sendKeys(email);
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'loginpassword')]")).sendKeys(pass);
			 
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.Button[contains(@resource-id,'buttonlogin')]")).click();
			 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[contains(@resource-id,'tv_edit_profile')]")));
		}
		

		catch(NoSuchElementException e)

		{
		
		e.printStackTrace();

		}
	}
	
	@Test
	
	public void test() throws InterruptedException
	{
	
	 System.out.println("test");
	 AppiumDriverInit.getDriver().findElement(By.id("com.abp.abpweddings:id/more")).click();
	 
	 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.TextView[@text ='View your profile']")).click();
	 
	 //AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.TextView[@text ='Edit Profile']")).click();
	 Thread.sleep(10000);
	 
	 swipeRightToLeft();
	 
	 
	}


	@AfterTest

	public void end()

   
  	{
	
		//6AppiumDriverInit.getDriver().quit();
		System.out.println("end");
	
  	}
	
	
	public void swipeRightToLeft()
	
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

