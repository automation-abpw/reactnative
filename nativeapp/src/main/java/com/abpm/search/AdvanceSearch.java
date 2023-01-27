package com.abpm.search;

import org.testng.annotations.Test;

import com.abpm.excelhandler.ReadExcel;
import com.abpm.execution.setup.AppiumDriverInit;
import com.abpm.execution.setup.Startup;

import io.appium.java_client.TouchAction;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class AdvanceSearch 

{
	public static String actvertext;
	public static String extvertextadv;
	
	@BeforeTest
	
	public void start() throws MalformedURLException, InterruptedException
	
	{
		ReadExcel.Excel();	
		String email = ReadExcel.searechloginemail;
		String pass = ReadExcel.Password;
		String searchawid=ReadExcel.searchawid;
		extvertextadv = ReadExcel.expectedadvsearchvertext;
		
		
		try
		
		{
			 Startup.setUp();	
			 
			 WebDriverWait wait = new WebDriverWait(AppiumDriverInit.getDriver(),120);
			
			
			 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.ImageView[contains(@resource-id,'ci_icon_edit')]")));
			 
			 AppiumDriverInit.getDriver().findElement(By.id("com.abp.abpweddings:id/search")).click();
			 
			 /*Voice search handle screen handle by adding below line */
			 
			// AppiumDriverInit.getDriver().findElement(By.id("com.abp.abpweddings:id/tv_close")).click();
			 
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.Spinner[contains(@resource-id,'advsearchagefromspinner')]")).click();
			 
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.TextView[contains(@text,'22')]")).click();
			
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.Spinner[contains(@resource-id,'advsearchagetospinner')]")).click();
			
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.TextView[contains(@text,'25')]")).click();
			 
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.Spinner[contains(@resource-id,'advsearchheightfrom')]")).click();
			 
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.TextView[contains(@index,'3')]")).click();
			 
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.Spinner[contains(@resource-id,'advsearchheightto')]")).click();
			 
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.TextView[contains(@index,'6')]")).click();

			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.Spinner[contains(@resource-id,'advsearchmaritalstatus')]")).click();
			 
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.TextView[contains(@text,'Never Married')]")).click();
			 
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.TextView[contains(@index,'0')]")).click();
			
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.Spinner[contains(@resource-id,'advsearchreligion')]")).click();
			 
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.TextView[contains(@text,'Hindu')]")).click();
			 
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.TextView[contains(@index,'0')]")).click();
			 
			 AppiumDriverInit.getDriver().findElement(By.id("com.abp.abpweddings:id/btnSearch")).click();
			 
			 wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.abp.abpweddings:id/textViewSalarytext")));
			 
		}
		

		catch(NoSuchElementException e)

		{
		
		e.printStackTrace();

		}
	}
	
	@Test
	
	public void test()
	{
		
	 WebElement element= AppiumDriverInit.getDriver().findElement(By.id("com.abp.abpweddings:id/textViewReligiontext"));
	 actvertext = element.getText();
	 System.out.println(actvertext); 
	 Assert.assertEquals(extvertextadv, actvertext);
	 
	}


	@AfterTest

	public void end()

   
  	{
	
		AppiumDriverInit.getDriver().quit();
		System.out.println("end");
	
  	}
}
