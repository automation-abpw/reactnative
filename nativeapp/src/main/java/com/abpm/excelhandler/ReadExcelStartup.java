package com.abpm.excelhandler;
 
import java.io.*;
 
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
public class ReadExcelStartup

{

 public static String cfurl;
 public static String dburl;
 
 public static String dbusername;
 public static String dbpass;
 public static String ncfurl;
 public static String ncfun;
 public static String ncfpass;
 public static String executivename;
 public static String geckodriver;
 
 public static String ncfplanun;

 public static void Excel()

 { 
	 
 try
 
 {
	 
    
  FileInputStream file = new FileInputStream(new File("D:\\eclipse-workspace\\Production3.0SanitySuite\\testdata.xlsx")); 
  XSSFWorkbook workbook = new XSSFWorkbook(file);
 
  XSSFSheet startup = workbook.getSheetAt(0);

  
  
  cfurl = startup.getRow(1).getCell(1).getStringCellValue();
  dburl = startup.getRow(2).getCell(1).getStringCellValue();
  dbusername = startup.getRow(3).getCell(1).getStringCellValue();
  dbpass = startup.getRow(4).getCell(1).getStringCellValue();
  
  ncfurl = startup.getRow(5).getCell(1).getStringCellValue();
  ncfun = startup.getRow(6).getCell(1).getStringCellValue();
  
  ncfplanun = startup.getRow(6).getCell(2).getStringCellValue();
  ncfpass = startup.getRow(7).getCell(1).getStringCellValue();
  executivename = startup.getRow(8).getCell(1).getStringCellValue();
  
  geckodriver = startup.getRow(9).getCell(1).getStringCellValue();
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
