package com.abpm.partnerpreference;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.abpm.excelhandler.ReadExcel;
import com.abpm.excelhandler.ReadExcelProileComp;
import com.abpm.excelhandler.ReadExcelStartup;
import com.abpm.execution.setup.AppiumDriverInit;
import com.abpm.execution.setup.Startup;
import com.abpm.execution.setup.WebAccess;
import com.abpm.execution.setup.WebDriverInit;
import com.abpm.reusable.function.ScrollByText;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;


public class PartnerPreference 

{
	public static String actvertext;
	
	@BeforeTest
	
	public void start() throws MalformedURLException, InterruptedException
	
	{
		
		ReadExcel.Excel();
		ReadExcelProileComp.Excel();
		
		String aboutpartner=ReadExcelProileComp.aboutpartner;
		String email = ReadExcel.Loginemail;
		String pass = ReadExcel.Password;
		ReadExcelStartup.Excel();
		String ncfurl=ReadExcelStartup.ncfurl;
		String ncfemail=ReadExcelStartup.ncfun;
		String ncfpass=ReadExcelStartup.ncfpass;
		
		
	 	
		try
		
		{
			
		    
			 
			 Startup.setUp();	
			 WebDriverWait wait = new WebDriverWait(AppiumDriverInit.getDriver(),120);
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
			 
			 Thread.sleep(3000);
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.view.View[@index='4']")).click();
			 
			 //Thread.sleep(3000);
			 
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.TextView[@text ='Edit Profile']")).click();
			 
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.TextView[@text ='Partner Preference']")).click();
			 
			 AppiumDriverInit.getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView")).click();
			 
			 /*Age from*/
			 
			 
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView")));
			 AppiumDriverInit.getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView")).click();
			
			 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text ='19']")));
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.TextView[@text ='19']")).click();
			 
			 /*Age to*/
			 
			 AppiumDriverInit.getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView")).click();
			 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text ='22']")));
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.TextView[@text ='22']")).click();
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.TextView[@text ='SUBMIT']")).click();
			 
			 /*Religion*/
			 
			 Thread.sleep(8000);
			
			// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView")));
			 
			 AppiumDriverInit.getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView")).click(); 
			 //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text ='Hindu']")));
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.TextView[@text ='Hindu']")).click();
			 Thread.sleep(2000);
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.TextView[@text ='SUBMIT']")).click();
			 
			 
			/*Marital status */
			 Thread.sleep(10000);
			
			 AppiumDriverInit.getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.ImageView")).click();
			
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.TextView[@text ='Never Married']")).click();
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.TextView[@text ='SUBMIT']")).click();
			 Thread.sleep(8000);
			 
			 /*Scroll to Professional & educational information*/
			
			 
			 AppiumDriverInit.getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView")).click();
			//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text ='Professional & Educational Information']")));
			 AppiumDriverInit.getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView")).click();
			 AppiumDriverInit.getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView")).click();
			 
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.TextView[@text ='Aviation degree']")).click();
			 AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.TextView[@text ='SUBMIT']")).click();
		}	
		
		catch(NoSuchElementException e)

		{
		
		e.printStackTrace();

		}
	}
	
	@Test
	
	public void test() throws InterruptedException, MalformedURLException
	
	{
		
	//	Assert.assertEquals(actvertext,"95 %");		 
	}


	@AfterTest

	public void end()

   
  	{
	
		//AppiumDriverInit.getDriver().closeApp();
			
  	}
}
