package com.abpm.excelhandler;
 
import java.io.*;
 
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
public class ReadExcelProileComp

{


 public static String aboutpartner;
 public static String companyname;
 public static String procompper;
 public static String familyto;
 
 
 public static void Excel()

 { 
	 
 try
 
 {
	 
    
  FileInputStream file = new FileInputStream(new File("D:\\eclipse-workspace\\Production3.0SanitySuite\\testdata.xlsx")); 
  XSSFWorkbook workbook = new XSSFWorkbook(file);
 
  XSSFSheet Profile_completion = workbook.getSheetAt(5);
  
  
  aboutpartner=Profile_completion.getRow(1).getCell(1).getStringCellValue();
  companyname=Profile_completion.getRow(2).getCell(1).getStringCellValue();
  familyto=Profile_completion.getRow(3).getCell(1).getStringCellValue();
  
  
//  familyme=Profile_completion.getRow(4).getCell(1).getStringCellValue();
//  situation=Profile_completion.getRow(5).getCell(1).getStringCellValue();
//  looking=Profile_completion.getRow(6).getCell(1).getStringCellValue();
//  
//  institute=Profile_completion.getRow(8).getCell(1).getStringCellValue();
//  schooling=Profile_completion.getRow(9).getCell(1).getStringCellValue();
//  Disabilities=Profile_completion.getRow(10).getCell(1).getStringCellValue();
//  Ailments=Profile_completion.getRow(11).getCell(1).getStringCellValue();
//  hometown=Profile_completion.getRow(12).getCell(1).getStringCellValue();
//  subcaste=Profile_completion.getRow(13).getCell(1).getStringCellValue();	  
//  birthplace=Profile_completion.getRow(14).getCell(1).getStringCellValue();	
//  ppawid=Profile_completion.getRow(1).getCell(2).getStringCellValue();	
//  
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
