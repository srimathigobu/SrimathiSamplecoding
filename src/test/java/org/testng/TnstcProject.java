package org.testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TnstcProject {
	Robot r;
	Select s;
	@Test
	private void task() throws AWTException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tnstc.in/home.html");
		driver.manage().window().maximize();
		WebElement fromBox=driver.findElement(By.id("matchStartPlace"));
		fromBox.sendKeys("c");
		r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	
	WebElement toBox=driver.findElement(By.id("matchEndPlace"));
	toBox.sendKeys("r");
	Thread.sleep(3000);
	for(int i=0;i<3;i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
}
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
		
	
	WebElement timeClk = driver.findElement(By.id("selectOnwardTimeSlab"));
	s=new Select(timeClk);
	s.selectByIndex(0);
	
	WebElement journeyData = driver.findElement(By.id("txtdeptDateRtrip"));
	journeyData.click();
	WebElement calendar = driver.findElement(By.xpath("//a[text()='20']"));
	calendar.click();
	
	WebElement adultFemale = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
	adultFemale.sendKeys("1");
	
	WebElement childMale = driver.findElement(By.xpath("(//input[@type='text'])[6]"));
	childMale.sendKeys("1");
	
	
	WebElement serviceClass = driver.findElement(By.id("selectClass"));
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 s=new Select(serviceClass);
	s.selectByVisibleText("DELUXE");
		
	WebElement searchBtn = driver.findElement(By.xpath("//a[text()='SEARCH']"));
	searchBtn.click();
	
	WebElement searchServices = driver.findElement(By.xpath("(//a[@class='dboxheader'])[1]"));
	searchServices.click();
	
	Wait wait=new FluentWait(driver).withTimeout(30,TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(ElementNotInteractableException.class);
	
	WebElement book = driver.findElement(By.xpath("(//a[text()='Book'])[2]"));
	book.click();
	
	WebElement fromAgain = driver.findElement(By.id("matchStartPlace"));
	fromAgain.sendKeys("c");
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
}}



	
	


