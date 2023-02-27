package com.abpm.partnerpreference;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.abpm.excelhandler.ReadExcel;
import com.abpm.excelhandler.ReadExcelStartup;
import com.abpm.execution.setup.AppiumDriverInit;
import com.abpm.execution.setup.Startup;
import com.abpm.execution.setup.WebAccess;
import com.abpm.execution.setup.WebDriverInit;

public class ppmoderation

{
	public static String actper;
	//public static void main(String[] args) throws MalformedURLException, InterruptedException
	public static void ppmoderation() throws MalformedURLException, InterruptedException
	
	{
	
	try
	
	{
		ReadExcel.Excel();
		ReadExcelStartup.Excel();
		String ncfurl=ReadExcelStartup.ncfurl;
		String ncfemail=ReadExcelStartup.ncfun;
		String ncfpass=ReadExcelStartup.ncfpass;
		String exename=ReadExcelStartup.executivename;
		String emailid = ReadExcel.Loginemail;
		String pass = ReadExcel.Password;

/*Login as moderator TL*/
			
		 Thread.sleep(3000);
		 WebAccess.set();
		 WebDriverInit.getDriver().manage().window().maximize();
		 WebDriverInit.getDriver().get(ncfurl);
		 WebDriverInit.getDriver().findElement(By.name("emailid")).sendKeys(ncfemail);
		 WebDriverInit.getDriver().findElement(By.name("password")).sendKeys(ncfpass);
		 WebDriverInit.getDriver().findElement(By.cssSelector("button.orange-btn_login")).click();
		 Thread.sleep(3000);
		 		 
		 new Select(WebDriverInit.getDriver().findElement(By.id("roleId"))).selectByVisibleText("Moderator - TL");
		 new Select(WebDriverInit.getDriver().findElement(By.id("sourceId"))).selectByVisibleText("FSE");
		 WebDriverInit.getDriver().findElement(By.id("selectRole")).click();
		 
		 Thread.sleep(3000);
		 
		 WebDriverInit.getDriver().findElement(By.xpath("//a[@id='9MenuId']/img")).click();
		 
		 Thread.sleep(2000);
		 
		 WebDriverInit.getDriver().findElement(By.id("custEmail")).click();
		 WebDriverInit.getDriver().findElement(By.id("custEmail")).clear();
		 WebDriverInit.getDriver().findElement(By.id("custEmail")).sendKeys(emailid);
		 Thread.sleep(3000);
		 WebDriverInit.getDriver().findElement(By.id("search_btn")).click();
		 Thread.sleep(3000);
		 
		 WebDriverInit.getDriver().findElement(By.xpath("//td/a")).click();
		 Thread.sleep(3000);
		 
		 /*Handle moderation dialog box*/
		 try
		 {
			 WebDriverInit.getDriver().switchTo().alert().accept();
		 }
		 
		 catch(NoAlertPresentException e)
		 
		 {
			 System.out.println("Moderation assignement dialog box is not diaplay");
			 
		 }
		 
		 WebElement element= WebDriverInit.getDriver().findElement(By.id("PreferenceCompleteness"));
		 actper=element.getText();
		 System.out.println(actper);

}


		

 catch(NoSuchElementException e)

{

e.printStackTrace();

}

	
	}
}