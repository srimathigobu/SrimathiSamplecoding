package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class DataDriven {
	public static void main(String[] args) throws IOException {
		File f =new File ("C:\\Users\\User\\eclipse-workspace\\MavenSampleProject\\Excelsheet\\file.xlsx");
		FileInputStream fin=new FileInputStream(f);
		Workbook b=new XSSFWorkbook(fin);
		Sheet s=b.getSheet("Sheet2");
		
		
		
		int NumberOfRows = s.getPhysicalNumberOfRows();
		System.out.println("noofrows:"+NumberOfRows);
		
		for (int i=0;i<NumberOfRows;i++) {
			Row r=s.getRow(i);	
			Row createRow = s.createRow(12);
			Cell createCell = r.createCell(12);
			createCell.setCellValue("yash");
		
		int NumberOfCells = r.getPhysicalNumberOfCells();
		//System.out.println("noofcells:"+NumberOfCells);
		for (int j=0;j<NumberOfCells;j++) {
			Cell c=r.getCell(j);
			System.out.println(c);
			

		}
		
		}
	

}}