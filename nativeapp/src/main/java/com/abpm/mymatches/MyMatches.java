package com.abpm.mymatches;

import org.testng.annotations.Test;

import com.abpm.excelhandler.ReadExcel;
import com.abpm.execution.setup.AppiumDriverInit;
import com.abpm.execution.setup.Startup;
import com.abpm.reusable.function.ScrollByText;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class MyMatches 

{
	public static String actvertext;
	public static String extvertext;

	 
	
	@BeforeTest
	
	public void start() throws MalformedURLException, InterruptedException
	
	{
	
		ReadExcel.Excel();	
		String email = ReadExcel.Loginemail;
		String pass = ReadExcel.Password;
		String searchawid=ReadExcel.searchawid;
		extvertext = ReadExcel.expectedvertext;
		
		
		try
		
		{
			 Startup.setUp();	
			 WebDriverWait wait = new WebDriverWait(AppiumDriverInit.getDriver(),150);
			 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text =' REGISTER WITH PHONE/EMAIL']")));
			 
		 
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.TextView[@text =' LOGIN NOW ']")).click();
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.TextView[@text ='I have a Password']")).click();
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.TextView[@text ='Enter Email/Profile Id/Phone']")).click();
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.EditText[@index ='0']")).sendKeys(email);
			 
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.EditText[@index ='1']")).click();
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.EditText[@index ='1']")).sendKeys(pass);
			 AppiumDriverInit.getDriver().hideKeyboard();
			 
			 Thread.sleep(5000);
			 
			 
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.Button[@index ='0']")).click();
			
			 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text ='Hi Test user,']")));
			 
			 Thread.sleep(5000);
			 
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.TextView[@text ='Matches']")).click();
			 
			 ScrollByText.scrollByText("Exclusive member");
			 
			 
		}
		

		catch(NoSuchElementException e)

		{
		
		e.printStackTrace();

		}
	}
	
	@Test
	
	public void test()
	{
		
	 WebElement element= AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.TextView[@text ='Exclusive member']"));
	 actvertext = element.getText();
	 System.out.println(actvertext);
	 Assert.assertEquals("Exclusive member", actvertext);
	 
	}


	@AfterTest

	public void end()

   
  	{
	
		AppiumDriverInit.getDriver().quit();
		System.out.println("end");
	
  	}
}
