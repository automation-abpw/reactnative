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
			 WebDriverWait wait = new WebDriverWait(AppiumDriverInit.getDriver(),120);
//			 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[contains(@resource-id,'ctaText')]")));
//			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.TextView[@text ='GET STARTED']")).click();
//			 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[contains(@resource-id,'LOGIN')]")));
//			 
//			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.TextView[@text ='LOGIN']")).click();
//			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'loginusername')]")).sendKeys(email);
//			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'loginpassword')]")).sendKeys(pass);
//			 
//			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.Button[contains(@resource-id,'buttonlogin')]")).click();
//			 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.ImageView[contains(@resource-id,'ci_icon_edit')]")));
			 AppiumDriverInit.getDriver().findElement(By.id("com.abp.abpweddings:id/more")).click();
			 
			 Thread.sleep(3000);
			
			 ScrollByText.scrollByText("Settings");

			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.LinearLayout[@index='10']")).click();
			 Thread.sleep(2000);
			 
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.TextView[(@text='Logout')]")).click();
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.Button[(@text='Logout')]")).click();		 
			
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
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.EditText[contains(@resource-id,'loginusername')]")));
		WebElement element= AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'action_bar_title')]"));
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
