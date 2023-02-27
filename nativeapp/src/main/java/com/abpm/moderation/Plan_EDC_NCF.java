package com.abpm.moderation;


import java.io.IOException;
import java.net.MalformedURLException;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import com.abpm.excelhandler.ReadExcel;
//import org.openqa.selenium.support.ui.WebDriverWait;
import com.abpm.excelhandler.ReadExcelStartup;
import com.abpm.execution.setup.*;



public class Plan_EDC_NCF 
{
	public static String Transactionid;
 
  
@BeforeTest
  
	public static void start() throws InterruptedException, IOException
	{
	ReadExcelStartup.Excel();
	ReadExcel.Excel();
	WebAccess.set();
	String useremail= ReadExcel.femaleun;
	
  	WebDriverInit.getDriver().get(ReadExcelStartup.ncfurl);
	WebDriverInit.getDriver().findElement(By.name("emailid")).clear();
	WebDriverInit.getDriver().findElement(By.name("emailid")).sendKeys(ReadExcelStartup.ncfplanun);
	WebDriverInit.getDriver().findElement(By.name("password")).clear();
	WebDriverInit.getDriver().findElement(By.name("password")).sendKeys(ReadExcelStartup.ncfpass);
	WebDriverInit.getDriver().findElement(By.cssSelector("button.orange-btn_login")).click();
	Thread.sleep(5000);
	WebDriverInit.getDriver().findElement(By.xpath("//li[3]/a/img")).click();
    Thread.sleep(8000);
    WebDriverInit.getDriver().findElement(By.id("custEmail")).sendKeys(useremail);
    WebDriverInit.getDriver().findElement(By.id("search_btn")).click();
    Thread.sleep(5000);
    WebDriverInit.getDriver().findElement(By.xpath("//td/a")).click();
    Thread.sleep(10000);
    WebDriverInit.getDriver().findElement(By.linkText("Plan Status")).click();
    Thread.sleep(5000);
    WebDriverInit.getDriver().findElement(By.id("base")).click();
    Thread.sleep(5000);
    WebDriverInit.getDriver().findElement(By.id("scrollerData2")).click();
    Thread.sleep(5000);
    String promocode = WebDriverInit.getDriver().findElement(By.id("result")).getText();
    WebDriverInit.getDriver().findElement(By.id("promoCode")).sendKeys(promocode);
    WebDriverInit.getDriver().findElement(By.id("applyPromoCodeBtnId")).click();
    Thread.sleep(5000);
    WebDriverInit.getDriver().switchTo().alert().accept();
    WebDriverInit.getDriver().findElement(By.id("proceedButtonPreventId")).click();
    Thread.sleep(5000);
    WebDriverInit.getDriver().findElement(By.cssSelector("#myModal2 .btn")).click();
    Thread.sleep(5000);
    WebDriverInit.getDriver().findElement(By.linkText("EDC")).click();
    new Select(WebDriverInit.getDriver().findElement(By.id("edcTidNo"))).selectByIndex(1);
    WebDriverInit.getDriver().findElement(By.id("edcAuthCode")).clear();
    WebDriverInit.getDriver().findElement(By.id("edcAuthCode")).sendKeys("78909763");
    WebDriverInit.getDriver().findElement(By.id("edcLastDigits")).clear();
    WebDriverInit.getDriver().findElement(By.id("edcLastDigits")).sendKeys("1534");
    WebDriverInit.getDriver().findElement(By.id("edcNetAmount")).clear();
    WebDriverInit.getDriver().findElement(By.id("edcNetAmount")).sendKeys("2");
    WebDriverInit.getDriver().findElement(By.id("edcReceiptNo")).clear();
    WebDriverInit.getDriver().findElement(By.id("edcReceiptNo")).sendKeys("KJU988");
    WebDriverInit.getDriver().findElement(By.id("edcBatchNo")).clear();
    WebDriverInit.getDriver().findElement(By.id("edcBatchNo")).sendKeys("87897987");
    WebDriverInit.getDriver().findElement(By.id("edcInvoiceNo")).clear();
    WebDriverInit.getDriver().findElement(By.id("edcInvoiceNo")).sendKeys("89789789");
    WebDriverInit.getDriver().findElement(By.id("edcMidNo")).clear();
    WebDriverInit.getDriver().findElement(By.id("edcMidNo")).sendKeys("8789798798");
    WebDriverInit.getDriver().findElement(By.id("pickUpButtonEDC")).click();
    Thread.sleep(5000);
    WebDriverInit.getDriver().findElement(By.cssSelector("#myModal3 .close")).click();
    Thread.sleep(5000);
    WebDriverInit.getDriver().findElement(By.xpath("//li[3]/a/img")).click();
    Thread.sleep(5000);
    WebDriverInit.getDriver().findElement(By.id("custEmail")).sendKeys(useremail);
    WebDriverInit.getDriver().findElement(By.id("search_btn")).click();
    Thread.sleep(5000);
    WebDriverInit.getDriver().findElement(By.xpath("//td/a")).click();
    Thread.sleep(5000);
    
    

	}

  @Test
  public static void purchaseVerification() throws MalformedURLException, InterruptedException
  {
	  WebElement element = WebDriverInit.getDriver().findElement(By.id("PaymentStatusRevamp"));
	  String payment_status = element.getText(); 
	  Assert.assertEquals(payment_status, "Paid");
	  WebDriverInit.getDriver().findElement(By.linkText("Plan Status")).click();
	  Thread.sleep(5000);
	  WebDriverInit.getDriver().findElement(By.cssSelector("#headingOne .panel-title")).click();
	  Thread.sleep(5000);
	  Transactionid = WebDriverInit.getDriver().findElement(By.cssSelector(".panel-body > .table-responsive tr:nth-child(1) > td:nth-child(2)")).getText();
	  
  }

  @AfterTest
  
	  public static void end()
		
		{
			WebDriverInit.getDriver().findElement(By.cssSelector("a.dropdown-toggle > img")).click();
			System.out.println("End");	
			WebDriverInit.getDriver().quit();
			
		}
  public static String Transactionid() {
		// TODO Auto-generated method stub
		return Transactionid;
  }
}