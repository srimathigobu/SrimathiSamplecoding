package org.sampleproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.test.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Eurowings extends BaseClass  {
	public static void main (String[]args) throws AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.eurowings.com/en.html");
		driver.manage().window().maximize();
		WebElement cookies = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
		cookies.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement scrollDown = driver.findElement(By.className("o-tab-container__flex-btn-wrapper"));
		js.executeScript("arguments[0].scrollIntoView(true)",scrollDown);
		WebElement departure = driver.findElement(By.xpath("(//span[text()='Departure airport'])[1]"));
		departure.click();
		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement destination = driver.findElement(By.xpath("//span[text()='Destination airport']"));
		js.executeScript("arguments[0].click",destination);
		for(int i=0;i<=2;i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	WebElement calendar = driver.findElement(By.name("ew-calendar-id-517"));
	calendar.click();
	
	}}	