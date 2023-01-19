package com.abpm.excelhandler;
 
import java.io.*;
 
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
public class ReadExcelSearch

{

 public static String loginemail;
 public static String loginpass;
 
 public static String searchawid;
 public static String about;
 public static String editloginun;
 public static String editpass;
 

 public static void Excel()

 { 
	 
 try
 
 {
	 
    
  FileInputStream file = new FileInputStream(new File("D:\\eclipse-workspace\\Production3.0SanitySuite\\testdata.xlsx")); 
  XSSFWorkbook workbook = new XSSFWorkbook(file);
 
  XSSFSheet search_editprofile = workbook.getSheetAt(5);
  //XSSFSheet login = workbook.getSheetAt(1);
  
  
  loginemail = search_editprofile.getRow(1).getCell(1).getStringCellValue();
  loginpass = search_editprofile.getRow(1).getCell(3).getStringCellValue();
  searchawid= search_editprofile.getRow(2).getCell(2).getStringCellValue();
  about=search_editprofile.getRow(3).getCell(1).getStringCellValue();
  editloginun= search_editprofile.getRow(4).getCell(1).getStringCellValue();
  editpass= search_editprofile.getRow(4).getCell(3).getStringCellValue();
  
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
