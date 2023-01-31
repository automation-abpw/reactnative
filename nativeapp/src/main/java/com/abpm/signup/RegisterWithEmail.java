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
import com.abpm.reusable.function.ScrollByText;
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
			
			 //Thread.sleep(2000);
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
			.sendKeys("And Appium");

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
			.findElement(By.xpath("//android.widget.TextView[@text ='Hindu']"))
			.click();
			
			AppiumDriverInit.getDriver()
			.findElement(By.xpath("//android.view.ViewGroup[@index ='9']"))
			.click();
			
			AppiumDriverInit.getDriver()
			.findElement(By.xpath("//android.widget.TextView[@text ='Banik']"))
			.click();
			
			AppiumDriverInit.getDriver()
			.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup/android.widget.ImageView"))
			.click();
			
			AppiumDriverInit.getDriver()
			.findElement(By.xpath("//android.widget.TextView[@text ='Never Married']"))
			.click();
		    
			 ScrollByText.scrollByText("Select height");
			 
			 AppiumDriverInit.getDriver()
				.findElement(By.xpath("//android.view.ViewGroup[@index ='13']"))
				.click();
			 
			 Thread.sleep(2000);
			 AppiumDriverInit.getDriver()
				.findElement(By.xpath("//android.widget.TextView[@text ='Kalchini, West Bengal, India']"))
				.click();
			 
			 
			 AppiumDriverInit.getDriver()
				.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[7]/android.view.ViewGroup/android.widget.ImageView"))
				.click();
			 
			 AppiumDriverInit.getDriver()
				.findElement(By.xpath("//android.widget.TextView[@text ='4 feet 2 inch']"))
				.click();
			    
			AppiumDriverInit.getDriver()
				.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView"))
				.click();
			 
					 
			 AppiumDriverInit.getDriver()
				.findElement(By.xpath("//android.view.ViewGroup[@index ='2']"))
				.click();

			 AppiumDriverInit.getDriver()
				.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView"))
				.click();
			 
			 AppiumDriverInit.getDriver()
				.findElement(By.xpath("//android.widget.Button[@text='While using the app']"))
				.click();
			 
			 AppiumDriverInit.getDriver()
				.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[11]/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.ImageView"))
				.click();
			 
			 AppiumDriverInit.getDriver()
				.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Done']"))
				.click();
			 
			 AppiumDriverInit.getDriver()
				.findElement(By.xpath("	//android.widget.TextView[@content-desc='Crop']"))
				.click();
			 
			 AppiumDriverInit.getDriver()
				.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView"))
				.click();
			 
			 AppiumDriverInit.getDriver()
				.findElement(By.xpath("//android.view.ViewGroup[@index ='4']"))
				.click();
			 
			 AppiumDriverInit.getDriver()
				.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView"))
				.click();
			 
			 AppiumDriverInit.getDriver()
				.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[11]/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.ImageView"))
				.click();
			 
			 AppiumDriverInit.getDriver()
				.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Done']"))
				.click();
			 
			 AppiumDriverInit.getDriver()
				.findElement(By.xpath("	//android.widget.TextView[@content-desc='Crop']"))
				.click();
			 
			 
		    //AppiumDriverInit.getDriver().closeApp();
			 
			
		    
		    
			 
//			RegModerationWithExceptionHandling.moderation();
//		    expected=RegModerationWithExceptionHandling.exp;
		  
		}

		catch (NoSuchElementException e)

		{

			e.printStackTrace();

		}
	}
	
	@Test

	public void test() {
		
		WebElement element= AppiumDriverInit.getDriver().findElement(By.xpath("//android.widget.TextView[@text ='Hi And Appium,']"));
		String actualtext=element.getText();

		
		Assert.assertEquals("Hi And Appium,", actualtext);
	

	}

	@AfterTest

	public void end()

	{

		AppiumDriverInit.getDriver().closeApp();
		System.out.println("end");

	}
}
