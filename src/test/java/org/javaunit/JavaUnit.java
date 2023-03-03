package org.javaunit;

import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.test.BaseClass;
import org.test.LoginPojo;

public class JavaUnit extends BaseClass {
	@Test
	public void tc3() throws IOException{
		urlLaunch("https://www.facebook.com/");
		maxWindow();
		LoginPojo lp=new LoginPojo();
		fillText(lp.getTxtEmail(),excelRead(2,1));
		String attribute = attribute(lp.getTxtEmail(),"value");
		System.out.println(attribute);
		Assert.assertTrue("check your test data",attribute.contains("@gmail.com"));
		fillText(lp.getTxtPass(),excelRead(2,2));
		System.out.println("sample-three");		
	}
	@Test
	public void tc1() throws IOException {
		urlLaunch("https://www.facebook.com/");
		maxWindow();
		LoginPojo lp=new LoginPojo();
		fillText(lp.getTxtEmail(),excelRead(0,1));
		String attribute = attribute(lp.getTxtEmail(),"value");
		Assert.assertEquals("check your test data",false, attribute.endsWith(".in"));
		fillText(lp.getTxtPass(),excelRead(0,2));
		System.out.println("sample one");	
	}
	@Test
	public void tc2() throws IOException {
		urlLaunch("https://www.facebook.com/");
		maxWindow();
		LoginPojo lp=new LoginPojo();
		fillText(lp.getTxtEmail(),excelRead(1,1));
		fillText(lp.getTxtPass(),excelRead(1,2));
		System.out.println("sample two");
	}
	@Before
	public void startTime() {
		Date d=new Date();
		System.out.println(d);
	}
	@After
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
