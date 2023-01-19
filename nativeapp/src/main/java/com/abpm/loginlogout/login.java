package com.abpm.loginlogout;

import org.testng.annotations.Test;

import com.abpm.excelhandler.ReadExcel;
import com.abpm.execution.setup.AppiumDriverInit;
import com.abpm.execution.setup.Startup;
import com.abpm.reusable.function.ScrollByText;
import io.appium.java_client.MobileBy;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class login 

{
	public static String actvertext;
	public static String extvertext;
	
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
			 WebDriverWait wait = new WebDriverWait(AppiumDriverInit.getDriver(),150);
			 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text =' REGISTER WITH PHONE/EMAIL']")));
			 
//			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.TextView[@text ='GET STARTED']")).click();
//			 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[contains(@resource-id,'LOGIN')]")));
			 
			 
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.TextView[@text =' LOGIN NOW ']")).click();
			 
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.TextView[@text ='I have a Password']")).click();
			 //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text =' LOGIN NOW ']")));
			 
			 Thread.sleep(5000);
			 
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.TextView[@text ='Enter Email/Profile Id/Phone']")).click();
			 Thread.sleep(5000);
			
//			 WebElement email1=AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.EditText[@index ='0']"));
//			 
//			 email1.sendKeys("test.test816@yopmail.com");
			 
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.EditText[@index ='0']")).sendKeys("test.test816@yopmail.com");
			 
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.EditText[@index ='1']")).click();
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.EditText[@index ='1']")).sendKeys("password");
			 
			 AppiumDriverInit.getDriver().hideKeyboard();
			 Thread.sleep(5000);
			 
			 
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.Button[@index ='0']")).click();
			 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.ImageView[contains(@resource-id,'ci_icon_edit')]")));
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
	 Thread.sleep(3000);
	 WebElement element= AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'tvProfileName')]"));
	 actvertext = element.getText();
	 System.out.println(actvertext);
	 Assert.assertEquals(extvertext, actvertext);
	 
	 
	}


	@AfterTest

	public void end() throws InterruptedException

   
  	{
	
		 WebDriverWait wait = new WebDriverWait(AppiumDriverInit.getDriver(),90);
		 ScrollByText.scrollByText("Settings");

		 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.LinearLayout[@index='10']")).click();
		 Thread.sleep(2000);
		 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.TextView[@text='Privacy Settings' and @index='0']")).click();
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.abp.abpweddings:id/privacytextvw1")));
		 AppiumDriverInit.getDriver().findElement(By.id("com.abp.abpweddings:id/privacyradioButton2")).click();
		 AppiumDriverInit.getDriver().findElement(By.id("com.abp.abpweddings:id/privacyradioButton4")).click();
		 
		 AppiumDriverInit.getDriver().quit();
		 System.out.println("end");
  	}
	
}
