package org.testng;

import java.io.IOException;
import java.util.Date;


import org.test.BaseClass;
import org.test.LoginPojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNg extends BaseClass {
	@Parameters ({"txtEmail","txtPass"})
	@Test
	private void tc1(@Optional("banugobu@gmail.com")String name,@Optional("srimathi")String pass) throws IOException, InterruptedException {
		urlLaunch("https://www.facebook.com/");
		LoginPojo lp=new LoginPojo();
		fillText(lp.getTxtEmail(),name);
		fillText(lp.getTxtPass(),pass);
		//btnClick(lp.getBtnClick());
		Thread.sleep(3000);
	}
	@Test(enabled=false)
	private void tc2() throws IOException, InterruptedException{
	urlLaunch("https://www.facebook.com/");
	LoginPojo lp=new LoginPojo();
	fillText(lp.getTxtEmail(),excelRead(1,1));
	fillText(lp.getTxtPass(),excelRead(1,2));
	btnClick(lp.getBtnClick());
	Thread.sleep(3000);
}	
		
	@Test(enabled=false)
	private void tc3() throws IOException, InterruptedException{
	urlLaunch("https://www.facebook.com/");
	LoginPojo lp=new LoginPojo();
	fillText(lp.getTxtEmail(),excelRead(2,1));
	fillText(lp.getTxtPass(),excelRead(2,2));
	btnClick(lp.getBtnClick());
	Thread.sleep(3000);
}	
	@Test(enabled=false)
	private void tc4() throws IOException, InterruptedException{
	urlLaunch("https://www.facebook.com/");
	LoginPojo lp=new LoginPojo();
	fillText(lp.getTxtEmail(),excelRead(3,1));
	fillText(lp.getTxtPass(),excelRead(3,2));
	btnClick(lp.getBtnClick());
	Thread.sleep(3000);
}
	@BeforeMethod
	public void startTime() {
		Date d=new Date();
		System.out.println(d);
	}
	@AfterMethod
	public void endTime() {
		Date d=new Date();
		System.out.println(d);
	}
	@BeforeClass
	public static void launchBrowser() {
		browserLaunch();
		System.out.println("Browser-open");
		
	}
	@AfterClass
	public static void browserClose() {
		System.out.println("Close-Browser");
	}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
		
	


