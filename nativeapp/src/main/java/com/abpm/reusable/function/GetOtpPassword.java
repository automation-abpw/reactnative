package com.abpm.reusable.function;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.abpm.excelhandler.ReadExcelStartup;
import com.abpm.excelhandler.ReadExcel;


	public class GetOtpPassword 
	
	{
	
		public static String otp;
		public static String otp()throws MalformedURLException, InterruptedException
		
{
	
		 ReadExcelStartup.Excel();	
		 ReadExcel.Excel();
		 //ReadExcelDatasheet.readdata();
		 
		 String dburl = ReadExcelStartup.dburl;
		 String email = ReadExcel.forgotemail;	
		 String un = ReadExcelStartup.dbusername;
		 String pass = ReadExcelStartup.dbpass;
		 
		// String driverloc=ReadExcelStartup.geckodriver;
		 
		 WebDriver driver;
		 System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 
		 driver.get(dburl);
		
		 driver.findElement(By.id("username")).clear();
		 driver.findElement(By.id("username")).sendKeys(un);
		 driver.findElement(By.name("auth[password]")).clear();
		 driver.findElement(By.name("auth[password]")).sendKeys(pass);
		 driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		 //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 Thread.sleep(5000);
		 driver.get("http://122.15.236.68:8080/adminer.php?server=10.132.100.143&username=qaAdmin&db=qa_db&table=abpm_matrimony_user_");
		 //driver.findElement(By.linkText("abpm_matrimony_user_")).click();
		 driver.findElement(By.linkText("Select data")).click();
		 driver.findElement(By.linkText("Search")).click();
		 driver.findElement(By.name("where[0][col]")).click();
		 
		 new Select(driver.findElement(By.name("where[0][col]"))).selectByVisibleText("emailAddress");
		 driver.findElement(By.cssSelector("select[name=\"where[0][col]\"] > option[value=\"emailAddress\"]")).click();
		 driver.findElement(By.name("where[0][val]")).click();
		 driver.findElement(By.name("where[0][val]")).sendKeys(email);
		 driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		 
		 otp = driver.findElement(By.xpath("//td[11]")).getText();
		 
		 System.out.println(otp);
	
		 driver.quit();		
		 
		 return otp;
 }
		
}

	