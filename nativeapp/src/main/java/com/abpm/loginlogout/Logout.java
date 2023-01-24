package com.abpm.loginlogout;

import org.testng.annotations.Test;

import com.abpm.excelhandler.ReadExcel;
import com.abpm.execution.setup.AppiumDriverInit;
import com.abpm.execution.setup.Startup;
import com.abpm.execution.setup.WebDriverInit;
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

public class Logout 

{
	public static String expectedtext;

		
	
	@BeforeTest
	
	public void start() throws MalformedURLException, InterruptedException
	
	{
		ReadExcel.Excel();	
		String email = ReadExcel.Loginemail;
		String pass = ReadExcel.Password;
		expectedtext = ReadExcel.vertext;
		
		
		
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
			 
			 Thread.sleep(3000);
			 
			 
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.Button[@index ='0']")).click();
			// wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text ='Hi Saurabh Test,']")));
			 
			 Thread.sleep(3000);
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.view.View[@index='4']")).click();
			 
			 //Thread.sleep(6000);
			 ScrollByText.scrollByText("About");
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.TextView[@text ='Settings']")).click();
			 //Thread.sleep(3000);
			 ScrollByText.scrollByText("About");
			 
			 
//			 WebDriverWait wait1 = new WebDriverWait(AppiumDriverInit.getDriver(),10);
//			 wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text ='Logout']")));
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.TextView[@text ='Logout']")).click();
			 
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.Button[@text ='LOGOUT']")).click();
			
		}
		

		catch(NoSuchElementException e)

		{
		
		e.printStackTrace();

		}
	}
	
	@Test
	
	public void test()
	
	{
	
		WebDriverWait wait = new WebDriverWait(AppiumDriverInit.getDriver(),90);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text ='Enter Email/Profile Id/Phone']")));
		WebElement element= AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.TextView[@text ='Enter Email/Profile Id/Phone']"));
		String actualtext=element.getText();
	    
	    System.out.println(actualtext);
	    
	    Assert.assertEquals(expectedtext , actualtext);
	 	
	}


	@AfterTest

	public void end()   
  	{
	
		AppiumDriverInit.getDriver().quit();
	
  	}
}
