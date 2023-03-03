package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	
	
	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
		public static void urlLaunch(String url) {
			driver.get(url);
	}
		public static void maxWindow() {
			driver.manage().window().maximize();
		}
		public static void fillText(WebElement element,String value) {
		element.sendKeys(value);
		}
		public static void btnClick(WebElement element) {
			element.click();
		}
		
		public static void actions(WebElement element,Keys theKey,WebElement target) {
			Actions a=new Actions(driver);
			a.moveToElement(element).perform();
			a.doubleClick(element).perform();
			a.contextClick(element).perform();
			a.keyDown(element, theKey).perform();
			a.keyUp(element,theKey).perform();
			a.dragAndDrop(element, target).perform();
		}
		public static String attribute(WebElement element,String name) {
			String attribute=element.getAttribute(name);
			System.out.println(attribute);
			return attribute;
					}
		public static void browserClose() {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.close();
		}

		//public static void robot(WebElement element, WebElement Key) throws AWTException {
			//Robot r=new Robot();
			//r.keyPress(KeyEvent_Key);
			
		public static String excelRead(int noRow,int noCell)throws IOException{
			//File location
			File f=new File("C:\\Users\\User\\eclipse-workspace\\MavenSampleProject\\Excelsheet\\file.xlsx");
		
			FileInputStream fin=new FileInputStream(f);
			Workbook b=new XSSFWorkbook(fin);
			Sheet s=b.getSheet("Sheet1");
			
			//int noOfRows =s.getPhysicalNumberOfRows();
			//for(int i=0;i < noOfRows;i++) {
				Row r=s.getRow(noRow);
				
					Cell c=r.getCell(noCell);
					int type = c.getCellType();
					
					String value;
					if(type==1) {
						//Value is string
						 value = c.getStringCellValue();
					
						}
					else if(DateUtil.isCellDateFormatted(c)){
				Date d = c.getDateCellValue();
				SimpleDateFormat sim=new SimpleDateFormat("dd-MM-yyyy");
				value = sim.format(d);
			
				}
					else {//number
						double dd = c.getNumericCellValue();
						//Downcasting
						long l=(long)dd;
						value = String.valueOf(l);
						
					}
					return value;
					
			
			
			
			
			
			
			
			
			
			
					}	}
		

		



