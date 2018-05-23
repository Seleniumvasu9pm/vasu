package com.method;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingData 
{

	public static void main(String[] args) throws Exception
	{
		
  File src=new File("C:\\Users\\vasu\\Desktop\\TestData.xlsx");
  
  FileInputStream fis=new FileInputStream(src);
  //workbook
  XSSFWorkbook wb=new XSSFWorkbook(fis);
  //worksheet
  XSSFSheet ws=wb.getSheet("Sheet1");
  //row cnt
 int rcnt=ws.getLastRowNum();
 for (int i = 0; i <=rcnt; i++) 
 {
	 String data=ws.getRow(i).getCell(0).getStringCellValue();
	  String data1=ws.getRow(i).getCell(1).getStringCellValue();
	  
	  System.out.println(data+"---"+data1);
	  
}
  
	}

}
