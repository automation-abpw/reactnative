package com.abpm.signup;

import org.testng.annotations.Test;

import com.abpm.excelhandler.ReadExcel;
import com.abpm.excelhandler.ReadExcelStartup;
import com.abpm.execution.setup.AppiumDriverInit;
import com.abpm.execution.setup.Startup;
import com.abpm.execution.setup.WebAccess;
import com.abpm.execution.setup.WebDriverInit;
import com.abpm.moderation.RegModeration;
import com.abpm.moderation.RegModerationWithExceptionHandling;
import com.abpm.reusable.function.GetOtp;
import com.abpm.reusable.function.Swipetoptobottom;

import io.appium.java_client.HidesKeyboard;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

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


public class RegisterWithEmail

{
	public static String acawid;
	public static String awid;
	public static String expected;

	@BeforeTest

	public void start() throws MalformedURLException, InterruptedException

	{
		ReadExcel.Excel();
		ReadExcelStartup.Excel();
		String ncfurl=ReadExcelStartup.ncfurl;
		String usrname=ReadExcelStartup.ncfun;
		String ncfpass=ReadExcelStartup.ncfpass;
		String email = ReadExcel.Email;
		double mobileno = ReadExcel.mobileno;
		long mob=(long)mobileno;
		String fullname=ReadExcel.fullname;
		
		//awid = ReadExcel.Loginawid;

		try

		{
			Startup.setUp();
			
			WebDriverWait wait = new WebDriverWait(AppiumDriverInit.getDriver(),350);

			AppiumDriverInit.getDriver()
			.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView"))
			.click();
			
			Thread.sleep(8000);
			AppiumDriverInit.getDriver()
			.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView"))
			.click();
			
			 AppiumDriverInit.getDriver()
			.findElement(By.xpath("//android.widget.EditText[@text ='Enter Mobile Number']"))
			.sendKeys(Long.toString(mob));
			 
			 AppiumDriverInit.getDriver().hideKeyboard();
			
			 Thread.sleep(5000);
			 
			 AppiumDriverInit.getDriver()
				.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[2]")).click();
				
			 AppiumDriverInit.getDriver()
				.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]"))
				.click();
			 
			 AppiumDriverInit.getDriver()
				.findElement(By.xpath("//android.widget.TextView[@text ='India']"))
				.click();
			 
			 AppiumDriverInit.getDriver()
				.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView"))
				.click();
			 
			 AppiumDriverInit.getDriver()
				.findElement(By.xpath("//android.widget.TextView[@text ='Male']"))
				.click();
			 
			 AppiumDriverInit.getDriver()
			.findElement(By.xpath("//android.widget.TextView[@text ='Select mother tongue']"))
			.click();

			 AppiumDriverInit.getDriver()
				.findElement(By.xpath("//android.widget.TextView[@text ='Bengali']"))
				.click();
			 
			 AppiumDriverInit.getDriver()
				.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.TextView[2]"))
				.click();
			 
			 AppiumDriverInit.getDriver()
				.findElement(By.xpath("//android.widget.Button[@text ='CONFIRM']"))
				.click();
			 

			 AppiumDriverInit.getDriver()
				.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup[1]/android.widget.TextView"))
				.click();
			 
			 String pin=GetOtp.otp();
			 
			 
			AppiumDriverInit.getDriver()
				.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText"))
				.sendKeys(pin);
			
			AppiumDriverInit.getDriver()
			.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView"))
			.click();

			AppiumDriverInit.getDriver()
			.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView"))
			.click();
			
			AppiumDriverInit.getDriver()
			.findElement(By.xpath("//android.widget.TextView[@text ='Self']"))
			.click();
			
			
			AppiumDriverInit.getDriver()
			.findElement(By.xpath("//android.widget.EditText[@text ='Enter Bride/Groom Name']"))
			.sendKeys("Test user");

			AppiumDriverInit.getDriver()
			.findElement(By.xpath("//android.widget.EditText[@text ='Enter email here']"))
			.click();

			AppiumDriverInit.getDriver()
			.findElement(By.xpath("//android.widget.EditText[@text ='Enter email here']"))
			.sendKeys(email);
			
			AppiumDriverInit.getDriver().hideKeyboard();			
			
			
			AppiumDriverInit.getDriver()
			.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup")).click();
			
			
			
			
			
			AppiumDriverInit.getDriver()
					.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'mobilenumber')]"))
					.sendKeys(Long.toString(mob));
 
			AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'password')]"))
					.sendKeys("password");

			AppiumDriverInit.getDriver().hideKeyboard();

			AppiumDriverInit.getDriver()
					.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'btnregister')]")).click();
			
			AppiumDriverInit.getDriver()
					.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'button1')]"))
					.click();
			
			
			AppiumDriverInit.getDriver()
			.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'camerabtn')]"))
			.click();
			//Thread.sleep(5000);
			
			wait.until(ExpectedConditions.elementToBeClickable(AppiumDriverInit.getDriver()
					.findElementByXPath("//android.widget.TextView[@text='Take photo' and @index='0']")));
			
			
			AppiumDriverInit.getDriver()
		    .findElement(By.xpath("//android.widget.TextView[@text='Take photo' and @index='0']"))
		    .click();
			
			AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.LinearLayout[contains(@resource-id,'GLSurfaceLayout')]"))
			.click();
		    AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.Button[contains(@resource-id,'okay')]"))
		    .click();
		    
		    AppiumDriverInit.getDriver()
			.findElement(By.xpath("//android.widget.Button[contains(@text,'CROP & SAVE')]"))
			.click();
		       
		    AppiumDriverInit.getDriver()
			.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'fullnametextfield')]"))
			.sendKeys(fullname);
		    
		    AppiumDriverInit.getDriver().hideKeyboard();
			
		    AppiumDriverInit.getDriver()
			.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'genderbtnmale')]"))
			.click();
		    
		    AppiumDriverInit.getDriver()
			.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'editTextcalender')]"))
			.click();
		    
		    AppiumDriverInit.getDriver()
			.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'button1')]"))
			.click();
		    
		     AppiumDriverInit.getDriver()
				.findElement(By.xpath("//android.widget.Spinner[contains(@resource-id,'heightid')]"))
				.click();
			
			AppiumDriverInit.getDriver()
				.findElement(By.xpath("//android.widget.TextView[@index='2']"))
				.click();
			
			AppiumDriverInit.getDriver()
			.findElement(By.xpath("//android.widget.Spinner[contains(@resource-id,'spinnermaritalstatus')]"))
			.click();
			
			AppiumDriverInit.getDriver()
			.findElement(By.xpath("//android.widget.TextView[contains(@text,'Never Married')]"))
			.click();
			
			AppiumDriverInit.getDriver()
			.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'statespinnerid')]"))
			.click();
			
			Thread.sleep(4000);
			
			AppiumDriverInit.getDriver()
			.findElement(By.xpath("//android.widget.TextView[contains(@text,' West Bengal')]"))
			.click();
					
			AppiumDriverInit.getDriver()
			.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'cityspinnerid')]"))
			.click();
			
			AppiumDriverInit.getDriver()
			.findElement(By.id("com.abp.abpweddings:id/searchBar"))
			.click();
			
			AppiumDriverInit.getDriver()
			.findElement(By.id("com.abp.abpweddings:id/searchBar"))
			.sendKeys("Kolkata");
			
			AppiumDriverInit.getDriver()
			.findElement(By.xpath("//android.widget.TextView[contains(@text,'Kolkata')]"))
			.click();
			
			AppiumDriverInit.getDriver()
			.findElement(By.xpath("//android.widget.Spinner[contains(@resource-id,'religion')]"))
			.click();
			
			AppiumDriverInit.getDriver()
			.findElement(By.xpath("//android.widget.TextView[contains(@text,'Hindu')]"))
			.click();
				
			AppiumDriverInit.getDriver()
				.findElement(By.xpath("//android.widget.Spinner[contains(@resource-id,'mothertongue')]"))
				.click();
			
			AppiumDriverInit.getDriver()
				.findElement(By.xpath("//android.widget.TextView[@text='Bengali']"))
				.click();
			
			AppiumDriverInit.getDriver()
			.findElement(By.xpath("//android.widget.Spinner[contains(@resource-id,'caste')]"))
			.click();
		
			AppiumDriverInit.getDriver()
			.findElement(By.xpath("//android.widget.TextView[@text='Agarwal']"))
			.click();
			
			AppiumDriverInit.getDriver()
			.findElement(By.xpath("//android.widget.Spinner[contains(@resource-id,'education')]"))
			.click();
		     
			Thread.sleep(2000);
			AppiumDriverInit.getDriver()
			.findElement(By.xpath("//android.widget.TextView[@text='B.Sc']"))
			.click();
			
			AppiumDriverInit.getDriver()
			.findElement(By.xpath("//android.widget.Spinner[contains(@resource-id,'occupation')]"))
			.click();
		
			AppiumDriverInit.getDriver()
			.findElement(By.xpath("//android.widget.TextView[@text='Salaried - Private']"))
			.click();
			
			Swipetoptobottom.swipeTopBottom();
			
			AppiumDriverInit.getDriver()
			.findElement(By.xpath("//android.widget.Button[@text='Save & Continue']"))
			.click();
			
			
			
			
			wait.until(ExpectedConditions.elementToBeClickable(AppiumDriverInit.getDriver()
					.findElement(By.id("com.abp.abpweddings:id/otpverfied"))));
			
			
			AppiumDriverInit.getDriver()
			.findElement(By.id("com.abp.abpweddings:id/otpverfied"))
			.sendKeys(pin);
			
			AppiumDriverInit.getDriver().hideKeyboard();
			
			AppiumDriverInit.getDriver()
			.findElement(By.id("com.abp.abpweddings:id/buttonSubmit"))
			.click();
			
			wait.until(ExpectedConditions.elementToBeClickable(AppiumDriverInit.getDriver()
					.findElement(By.id("com.abp.abpweddings:id/uploadphotoid"))));
			
			Thread.sleep(15000);
			
			AppiumDriverInit.getDriver()
			.findElement(By.id("com.abp.abpweddings:id/uploadphotoid"))
			.click();
			
			/*Upload photo id*/
			wait.until(ExpectedConditions.elementToBeClickable(AppiumDriverInit.getDriver()
					.findElementByXPath("//android.widget.TextView[@text='Take photo' and @index='0']")));
			
			
			AppiumDriverInit.getDriver()
		    .findElement(By.xpath("//android.widget.TextView[@text='Take photo' and @index='0']"))
		    .click();
			
			AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.LinearLayout[contains(@resource-id,'GLSurfaceLayout')]"))
			.click();
		    AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.Button[contains(@resource-id,'okay')]"))
		    .click();
		    
		    AppiumDriverInit.getDriver()
			.findElement(By.xpath("//android.widget.Button[contains(@text,'CROP & SAVE')]"))
			.click();
			
		    AppiumDriverInit.getDriver()
			.findElement(By.id("com.abp.abpweddings:id/buttonSubmit"))
			.click();
		      
		    Thread.sleep(20000);

		    AppiumDriverInit.getDriver()
			.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'buttonSubmit') and @text='Continue']"))
			.click();
		    
		    Thread.sleep(11000);

		    AppiumDriverInit.getDriver().closeApp();
		    
		    RegModerationWithExceptionHandling.moderation();
		    expected=RegModerationWithExceptionHandling.exp;
		  
		}

		catch (NoSuchElementException e)

		{

			e.printStackTrace();

		}
	}
	
	@Test

	public void test() {

		System.out.println("test");
		Assert.assertEquals("LIVE", expected);
	

	}

	@AfterTest

	public void end()

	{

		//AppiumDriverInit.getDriver().closeApp();
		System.out.println("end");

	}
}
