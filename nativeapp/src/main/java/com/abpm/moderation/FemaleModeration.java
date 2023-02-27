package com.abpm.moderation;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.abpm.excelhandler.ReadExcel;
import com.abpm.excelhandler.ReadExcelStartup;
import com.abpm.execution.setup.WebAccess;
import com.abpm.execution.setup.WebDriverInit;

public class FemaleModeration 

{
	public static String exp;
	public static String exp1;
	public static String exp2;
	public static String awid;
	public static void moderation() throws MalformedURLException, InterruptedException
	//public static void main(String[] args) throws MalformedURLException, InterruptedException
	{
		ReadExcel.Excel();
		ReadExcelStartup.Excel();
		String ncfurl=ReadExcelStartup.ncfurl;
		String usrname=ReadExcelStartup.ncfun;
		String ncfpass=ReadExcelStartup.ncfpass;
		String exename=ReadExcelStartup.executivename;
		String email = ReadExcel.femaleun;
		
	    WebAccess.set();
	    WebDriverInit.getDriver().get(ncfurl);
	    

		
	    /*Login as moderator TL*/
	    WebDriverWait wait = new WebDriverWait(WebDriverInit.getDriver(),90);
	    WebElement element1=WebDriverInit.getDriver().findElement(By.name("emailid"));
	    
	   // wait.until(ExpectedConditions.elementToBeClickable(element1));
	    
		WebDriverInit.getDriver().findElement(By.name("emailid")).sendKeys(usrname);
		WebDriverInit.getDriver().findElement(By.name("password")).sendKeys(ncfpass);
		WebDriverInit.getDriver().findElement(By.cssSelector("button.orange-btn_login")).click();
		
		new Select(WebDriverInit.getDriver().findElement(By.id("roleId"))).selectByVisibleText("Moderator - TL");
		new Select(WebDriverInit.getDriver().findElement(By.id("sourceId"))).selectByVisibleText("FSE");
		WebDriverInit.getDriver().findElement(By.id("selectRole")).click();
		
		
		
		/*Test server moderation time*/
		/*Test server moderation time*/
		//Thread.sleep(80000);
		
		/*Production server moderation time*/
		Thread.sleep(80000);
		
		WebDriverInit.getDriver().navigate().refresh();
		Thread.sleep(3000);
		
		try
		{
		WebDriverInit.getDriver().findElement(By.xpath("//input[@type='search']")).click();
		WebDriverInit.getDriver().findElement(By.xpath("//input[@type='search']")).sendKeys(email);
		Thread.sleep(9000);
		WebElement element12= WebDriverInit.getDriver().findElement(By.xpath("//div[3]/div/table/tbody/tr/td[3]"));
	    wait.until(ExpectedConditions.textToBe(By.xpath("//div[3]/div/table/tbody/tr/td[3]"),"Female user"));
	    exp1=element12.getText();
	    Thread.sleep(3000);
	    System.out.println(exp1);
	    
	    if(exp1.equals("Female user"))
	    {
	    Thread.sleep(3000);
		WebDriverInit.getDriver().findElement(By.id("checkbox")).click();
	    }
	    
	    else
	    {
	    	System.out.println("Test user not found");
	    }
	    
		System.out.println("Try part executed");
	    
		}
		
		catch (NoSuchElementException e)
		{
     
			e.printStackTrace();
			WebDriverInit.getDriver().findElement(By.id("checkboxcheckboxAssignToId")).click();
			WebDriverInit.getDriver().findElement(By.id("filter_submit_btn")).click();
			Thread.sleep(10000);
			WebDriverInit.getDriver().findElement(By.xpath("//input[@type='search']")).click();
			WebDriverInit.getDriver().findElement(By.xpath("//input[@type='search']")).sendKeys(email);
			wait.until(ExpectedConditions.textToBe(By.xpath("//div[3]/div/table/tbody/tr/td[3]"),"Female user"));
			WebElement element13= WebDriverInit.getDriver().findElement(By.xpath("//div[3]/div/table/tbody/tr/td[3]"));
			exp2=element13.getText();
			
			Thread.sleep(3000);
		    System.out.println(exp2);
		    
		    if(exp2.equals("Female user"))
		    {
		    Thread.sleep(3000);
			WebDriverInit.getDriver().findElement(By.id("checkbox")).click();
		    System.out.println("if part");
		    }
			
			System.out.println("Catch part executed");
		}
	    /*Moderator Executive assignment*/
	    new Select(WebDriverInit.getDriver().findElement(By.id("moderatorSelectedId"))).selectByVisibleText(exename);
	    WebDriverInit.getDriver().findElement(By.id("submit_btn")).click();
	 
	    Thread.sleep(1000); 
	    WebDriverInit.getDriver().switchTo().alert().dismiss();
	    WebDriverInit.getDriver().findElement(By.cssSelector("a.dropdown-toggle > img")).click();
	    
	    /*NCF url and login as moderator TL */
	    WebDriverInit.getDriver().get(ncfurl);
	    WebDriverInit.getDriver().findElement(By.name("emailid")).sendKeys(usrname);
		WebDriverInit.getDriver().findElement(By.name("password")).sendKeys(ncfpass);
	    WebDriverInit.getDriver().findElement(By.cssSelector("button.orange-btn_login")).click();
	    Thread.sleep(1000);
	    
/*NCf executive role selection*/
	    new Select(WebDriverInit.getDriver().findElement(By.id("roleId"))).selectByVisibleText("Moderator Executive");
		new Select(WebDriverInit.getDriver().findElement(By.id("sourceId"))).selectByVisibleText("FSE");
		WebDriverInit.getDriver().findElement(By.id("selectRole")).click();
	    
		Thread.sleep(1000);
		
	    WebDriverInit.getDriver().findElement(By.xpath("//label/input")).click();
	    WebDriverInit.getDriver().findElement(By.xpath("//label/input")).sendKeys(email);
	    Thread.sleep(1000);
	    
	    WebElement element=  WebDriverInit.getDriver().findElement(By.xpath("//td[contains(.,'Female user')]"));
	    String usr = element.getText();
	    System.out.println(usr);
	    Assert.assertEquals("Female user", usr);
	    
	    WebDriverInit.getDriver().findElement(By.xpath("//td/a")).click();
		
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h4[contains(.,'Basic Information')]")));
		WebDriverInit.getDriver().findElement(By.id("contentAccept")).click();
		WebDriverInit.getDriver().findElement(By.linkText("Photo Moderation")).click();
		Thread.sleep(2000);
		WebDriverInit.getDriver().findElement(By.xpath("//td/div/div[2]/input")).click();
		
		WebDriverInit.getDriver().findElement(By.linkText("Documents Moderation")).click();
		WebDriverInit.getDriver().findElement(By.xpath("//td[4]/input")).click();
		
		WebDriverInit.getDriver().findElement(By.id("submitButton2")).click();
		Thread.sleep(2000);
		
		WebDriverInit.getDriver().switchTo().alert().dismiss();
		
		Thread.sleep(3000);
		
		WebDriverInit.getDriver().findElement(By.xpath("//a[@id='9MenuId']/img")).click();
		Thread.sleep(2000);
		WebDriverInit.getDriver().findElement(By.id("custEmail")).sendKeys(email);
	    
	    WebDriverInit.getDriver().findElement(By.id("search_btn")).click();
		System.out.println("User created");
		
		Thread.sleep(1000);
		
		
		WebElement element12= WebDriverInit.getDriver().findElement(By.xpath("//td/a"));
	    awid=element12.getText();
	    
	    System.out.println(awid);
	    
	    Thread.sleep(1000);
		WebElement element11= WebDriverInit.getDriver().findElement(By.xpath("//table[@id='searchTblId']/tbody/tr/td[5]"));
		                                                                     
	    exp=element11.getText();
	    
	    System.out.println(exp);
		
		WebDriverInit.getDriver().quit();
		
		return;
	

}
	
}
