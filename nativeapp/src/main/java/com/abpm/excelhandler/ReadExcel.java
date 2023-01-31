package com.abpm.excelhandler;
 
import java.io.*;
 
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
public class ReadExcel

{

 public static String Email;
 public static double mobileno;	
 public static String fullname;	
 
 public static String RegEmail;
 public static double Regmobileno;	
 public static String RegfEmail;
 public static double Regfmobileno;	
 public static String searcawid;
 
 public static String VerEmail;
 public static double Vermobileno;
 
 public static String Loginemail;
 public static String Password;
 public static String extvertext;
 public static String vertext;
 
 public static String searechloginemail;
 public static String searchawid;
 public static String expectedvertext;
 
 public static String expectedadvsearchvertext;
 
 
 
 public static String emailchange;
 public static String oldpass;
 public static String newpass;
 public static String usrname;
 
 public static String url;
 public static String fstlemail;
 public static String fstlpass;
 public static String moderatorexecutivename;
 public static String maleun;
 public static String maleawid;
 public static String femaleun;
 public static String femalepass;
 public static String femalename;
 public static String femalevertext;
 
 public static String maleaccun;
 public static String maleaccawid;
 public static String femaleaccun;
 public static String femaleaccawid;
 
 public static String planmaleun;
 public static String planmalepass;
 public static String planmaleawid;
 
 public static String planfemaleun;
 public static String planfemalepass;
 public static String planfemaleawid;
 
 public static String rejmaleaccun;
 public static String rejmaleaccawid;
 public static String rejfemaleaccun;
 public static String rejfemaleaccawid;
 
 public static String forgotemail;
 public static String forgotnewpass;
 public static String expvertext;
 
 public static String deactreason;
 public static String deactmsg;
 
 public static String bellchatmessage;
 public static String bellintmessage;
 public static String conttext;
 public static String shorttext;
 public static String inttext;
 
 public static String planname;
 public static double planamount;
 public static String promocode;
 public static String expplanname;
  
 
 public static void Excel()

 { 
	 
 try
 
 {
	 
    
  FileInputStream file = new FileInputStream(new File("C:\\Users\\Amit Singh\\reactnative\\nativeapp\\testdata.xlsx")); 
  XSSFWorkbook workbook = new XSSFWorkbook(file);
 
  XSSFSheet Reg = workbook.getSheetAt(0);
  XSSFSheet login = workbook.getSheetAt(1);
  XSSFSheet search = workbook.getSheetAt(2);
  XSSFSheet chagepass = workbook.getSheetAt(3);
  XSSFSheet forgotpassword = workbook.getSheetAt(4);
  XSSFSheet interaction = workbook.getSheetAt(6);
  
  
  	Email = Reg.getRow(1).getCell(1).getStringCellValue();
  	mobileno = Reg.getRow(1).getCell(2).getNumericCellValue();
  	fullname = Reg.getRow(1).getCell(3).getStringCellValue();
  
 
  Loginemail=login.getRow(1).getCell(1).getStringCellValue();
  Password=login.getRow(1).getCell(2).getStringCellValue();
  extvertext=login.getRow(1).getCell(3).getStringCellValue();
  vertext=login.getRow(1).getCell(4).getStringCellValue();
  
  femaleun=Reg.getRow(2).getCell(1).getStringCellValue();
  femalename=Reg.getRow(2).getCell(3).getStringCellValue();
  
  searcawid=Reg.getRow(1).getCell(4).getStringCellValue();
 
  searechloginemail= search.getRow(1).getCell(1).getStringCellValue();
  searchawid=search.getRow(1).getCell(2).getStringCellValue();
  expectedvertext=search.getRow(1).getCell(3).getStringCellValue();
  
  expectedadvsearchvertext=search.getRow(1).getCell(4).getStringCellValue();
 
  
  emailchange=chagepass.getRow(1).getCell(1).getStringCellValue();
  oldpass=chagepass.getRow(1).getCell(2).getStringCellValue();
  newpass=chagepass.getRow(1).getCell(3).getStringCellValue();
  usrname=chagepass.getRow(1).getCell(4).getStringCellValue();
  

  bellchatmessage=interaction.getRow(1).getCell(1).getStringCellValue();
  bellintmessage=interaction.getRow(2).getCell(1).getStringCellValue();
  conttext=interaction.getRow(3).getCell(1).getStringCellValue();
  shorttext=interaction.getRow(4).getCell(1).getStringCellValue();
  inttext=interaction.getRow(5).getCell(1).getStringCellValue();
  
  forgotemail=forgotpassword.getRow(1).getCell(1).getStringCellValue();
  forgotnewpass=forgotpassword.getRow(1).getCell(2).getStringCellValue();
  expvertext=forgotpassword.getRow(1).getCell(3).getStringCellValue();
  
  deactreason=forgotpassword.getRow(1).getCell(4).getStringCellValue();
  
  deactmsg=forgotpassword.getRow(1).getCell(5).getStringCellValue();
  
  file.close();
  return;
 
 } 
 
 catch (FileNotFoundException fnfe)
 {
  fnfe.printStackTrace();
 } 
 catch (IOException ioe) 
 {
  ioe.printStackTrace();
 }
 }
}