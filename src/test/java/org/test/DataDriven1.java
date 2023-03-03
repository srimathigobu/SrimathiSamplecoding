package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven1 {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\User\\eclipse-workspace\\MavenSampleProject\\Excelsheet\\file 1.xlsx");
		FileInputStream fin=new FileInputStream(f);
		
		Workbook b=new XSSFWorkbook(fin);
		Sheet s = b.getSheet("Sri");
		Row r = s.getRow(0);
		Cell c = r.getCell(1);
		String value = c.getStringCellValue();
		if(value.equals("Akil")) {
		
			c.setCellValue("SRI");
		}
		
		FileOutputStream fout=new FileOutputStream(f);
		b.write(fout);
		System.out.println("done");
	}

}
