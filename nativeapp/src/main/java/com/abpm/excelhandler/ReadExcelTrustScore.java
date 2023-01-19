package com.abpm.excelhandler;
 
import java.io.*;
 
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
public class ReadExcelTrustScore

{

 public static String loginemail;
 public static String loginpass;
 
 public static String awid;
 public static String expresult;
 public static String editloginun;
 public static String editpass;
 

 public static void Excel()

 { 
	 
 try
 
 {
	 
    
  FileInputStream file = new FileInputStream(new File("D:\\eclipse-workspace\\Production3.0SanitySuite\\testdata.xlsx")); 
  XSSFWorkbook workbook = new XSSFWorkbook(file);
 
  XSSFSheet TrustScore = workbook.getSheetAt(8);

  
  
  loginemail = TrustScore.getRow(1).getCell(1).getStringCellValue();
  loginpass = TrustScore.getRow(1).getCell(2).getStringCellValue();
  awid= TrustScore.getRow(1).getCell(3).getStringCellValue();
  expresult=TrustScore.getRow(2).getCell(1).getStringCellValue();

  
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
