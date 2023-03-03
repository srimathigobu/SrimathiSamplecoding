package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class DataDriven {
	public static void main(String[] args) throws IOException {
		//File location
		File f=new File("C:\\Users\\User\\eclipse-workspace\\MavenSampleProject\\Excelsheet\\file.xlsx");
	
		FileInputStream fin=new FileInputStream(f);
		Workbook b=new XSSFWorkbook(fin);
		Sheet s=b.getSheet("Sheet1");
		
		int noOfRows =s.getPhysicalNumberOfRows();
		for(int i=0;i < noOfRows;i++) {
			Row r=s.getRow(i);
			int noOfCells =r.getPhysicalNumberOfCells();
			for(int j=0; j<noOfCells; j++) {
				Cell c=r.getCell(j);
				int type = c.getCellType();
				if(type==1) {
					//Value is string
					String value = c.getStringCellValue();
					System.out.println(value);
					}
				else if(DateUtil.isCellDateFormatted(c)){
			Date d = c.getDateCellValue();
			SimpleDateFormat sim=new SimpleDateFormat("dd-MM-yyyy");
			String value = sim.format(d);
			System.out.println(value);
			}
				else {
					double dd = c.getNumericCellValue();
					//Downcasting
					long l=(long)dd;
					String value = String.valueOf(l);
					System.out.println(value);
			
		//Number
				
				
			}	
				
			}
		}
		
		
		 
		
		
	
	}}