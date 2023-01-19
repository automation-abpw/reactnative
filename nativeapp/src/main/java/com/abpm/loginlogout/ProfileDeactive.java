package com.abpm.loginlogout;

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

public class ProfileDeactive 

{

	public static String exp;
	public static String deactivatemsg;
	
	@BeforeTest
	
	public void start() throws MalformedURLException, InterruptedException
	
	{
		ReadExcel.Excel();	
		String email = ReadExcel.forgotemail;
		String newpass = ReadExcel.forgotnewpass;
		String reason=ReadExcel.deactreason;
		deactivatemsg=ReadExcel.deactmsg;
		exp = "Login";
				
		
		try
		
		{
			 Startup.setUp();	
			
			 WebDriverWait wait = new WebDriverWait(AppiumDriverInit.getDriver(),120);
			 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[contains(@resource-id,'ctaText')]")));
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.TextView[@text ='GET STARTED']")).click();
			 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[contains(@resource-id,'loginText')]")));
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.TextView[@text ='LOGIN NOW']")).click();
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'loginusername')]")).sendKeys(email);
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'loginpassword')]")).sendKeys(newpass);
			 
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.Button[contains(@resource-id,'buttonlogin')]")).click();
			 
			 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.ImageView[contains(@resource-id,'ci_icon_edit')]")));
			 
			 AppiumDriverInit.getDriver().findElement(By.id("com.abp.abpweddings:id/more")).click();
			 
			 Thread.sleep(3000);
			 ScrollByText.scrollByText("Settings");
			  
			 
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.LinearLayout[@index='10']")).click();
				
			 Thread.sleep(2000);
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.TextView[@text='Deactivate Profile' and @index='0']")).click();
			 
			 AppiumDriverInit.getDriver().findElement(By.id("com.abp.abpweddings:id/radioButton10")).click();
			 AppiumDriverInit.getDriver().findElement(By.id("com.abp.abpweddings:id/editTextOthers")).sendKeys(reason);
			 
			 AppiumDriverInit.getDriver().hideKeyboard();
			 AppiumDriverInit.getDriver().findElement(By.id("com.abp.abpweddings:id/btn_deactivate")).click();
			 
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.Button[contains(@resource-id,'button1')]")).click();
			 
			 /*Login in application with Deactivated profile*/
		     
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'loginusername')]")).sendKeys(email);
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'loginpassword')]")).sendKeys(newpass);
			 
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.Button[contains(@resource-id,'buttonlogin')]")).click();
			 
		}
		

		catch(NoSuchElementException e)

		{
		
		e.printStackTrace();

		}
	}
	
	@Test
	
	public void test()
	{
	
		WebElement element= AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'message')]"));
		String act = element.getText();
		System.out.println(act);
		exp=deactivatemsg;
		 
		Assert.assertEquals(act, deactivatemsg);
	}


	@AfterTest

	public void end()

   
  	{
	
		AppiumDriverInit.getDriver().closeApp();
	
  	}
}
