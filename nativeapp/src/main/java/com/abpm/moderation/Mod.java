package com.abpm.moderation;

import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.abpm.excelhandler.ReadExcel;
import com.abpm.excelhandler.ReadExcelStartup;
import com.abpm.execution.setup.AppiumDriverInit;
import com.abpm.execution.setup.WebAccess;
import com.abpm.execution.setup.WebDriverInit;

public class Mod 

{
	
	public static void main(String args[]) throws InterruptedException, MalformedURLException
	
	{
		ReadExcel.Excel();
		ReadExcelStartup.Excel();
		String ncfurl=ReadExcelStartup.ncfurl;
		String usrname=ReadExcelStartup.ncfun;
		String ncfpass=ReadExcelStartup.ncfpass;
		String exename=ReadExcelStartup.executivename;
		String email = ReadExcel.Email;
		
	    WebAccess.set();
	    WebDriverInit.getDriver().get(ncfurl);
	    

		
	    /*Login as moderator TL*/
	    //WebElement element1=WebDriverInit.getDriver().findElement(By.name("emailid"));
	    
	   // wait.until(ExpectedConditions.elementToBeClickable(element1));
	    
		WebDriverInit.getDriver().findElement(By.name("emailid")).sendKeys(usrname);
		WebDriverInit.getDriver().findElement(By.name("password")).sendKeys(ncfpass);
		WebDriverInit.getDriver().findElement(By.cssSelector("button.orange-btn_login")).click();
		
		new Select(WebDriverInit.getDriver().findElement(By.id("roleId"))).selectByVisibleText("Moderator - TL");
		new Select(WebDriverInit.getDriver().findElement(By.id("sourceId"))).selectByVisibleText("FSE");
		WebDriverInit.getDriver().findElement(By.id("selectRole")).click();
		
		/*Test server moderation time*/
		Thread.sleep(5000);
		
		WebDriverInit.getDriver().findElement(By.xpath("//input[@type='search']")).click();
	    WebDriverInit.getDriver().findElement(By.xpath("//input[@type='search']")).sendKeys(email);
	    
	    Thread.sleep(5000);
	    WebElement element=  WebDriverInit.getDriver().findElement(By.xpath("//td[contains(.,'Unique')]"));
	    String usr = element.getText();
	    
	    System.out.println(usr);
	    
	    Assert.assertEquals("Unique", usr);
	    
	    WebDriverInit.getDriver().close();
	    
//	    Thread.sleep(1000);
//	    
//	    WebDriverInit.getDriver().findElement(By.id("modSelectChkBoxId")).click();
//	    
//	    /*Moderator Executive assignment*/
//	    new Select(WebDriverInit.getDriver().findElement(By.id("moderatorSelectedId"))).selectByVisibleText(exename);
//	    WebDriverInit.getDriver().findElement(By.id("submit_btn")).click();
//	 
//	    Thread.sleep(1000); 
//	    WebDriverInit.getDriver().switchTo().alert().dismiss();
//	    WebDriverInit.getDriver().findElement(By.cssSelector("a.dropdown-toggle > img")).click();
//	    
//	    /*NCF url and login as moderator TL */
//	    WebDriverInit.getDriver().get(ncfurl);
//	    WebDriverInit.getDriver().findElement(By.name("emailid")).sendKeys(usrname);
//		WebDriverInit.getDriver().findElement(By.name("password")).sendKeys(ncfpass);
//	    WebDriverInit.getDriver().findElement(By.cssSelector("button.orange-btn_login")).click();
//	    Thread.sleep(1000);
//	    
///*NCf executive role selection*/
//	    new Select(WebDriverInit.getDriver().findElement(By.id("roleId"))).selectByVisibleText("Moderator Executive");
//		new Select(WebDriverInit.getDriver().findElement(By.id("sourceId"))).selectByVisibleText("FSE");
//		WebDriverInit.getDriver().findElement(By.id("selectRole")).click();
//	    
//		Thread.sleep(1000);
//		
//	    WebDriverInit.getDriver().findElement(By.xpath("//label/input")).click();
//	    WebDriverInit.getDriver().findElement(By.xpath("//label/input")).sendKeys(email);
//	    Thread.sleep(1000);
//	    
//	    WebDriverInit.getDriver().findElement(By.xpath("//td/a")).click();
//		Thread.sleep(3000);
//		WebDriverInit.getDriver().findElement(By.id("contentAccept")).click();
//		WebDriverInit.getDriver().findElement(By.linkText("Photo Moderation")).click();
//		Thread.sleep(2000);
//		WebDriverInit.getDriver().findElement(By.xpath("//td[3]/input")).click();
//		
//		WebDriverInit.getDriver().findElement(By.linkText("Documents Moderation")).click();
//		WebDriverInit.getDriver().findElement(By.xpath("//td[4]/input")).click();
//		
//		WebDriverInit.getDriver().findElement(By.id("submitButton2")).click();
//		Thread.sleep(2000);
//		
//		WebDriverInit.getDriver().switchTo().alert().dismiss();
//		
//		Thread.sleep(3000);
//		
//		WebDriverInit.getDriver().findElement(By.xpath("//a[@id='9MenuId']/img")).click();
//		WebDriverInit.getDriver().findElement(By.id("custEmail")).sendKeys(email);
//	    
//	    WebDriverInit.getDriver().findElement(By.id("search_btn")).click();
//		System.out.println("User created");
	}
}
