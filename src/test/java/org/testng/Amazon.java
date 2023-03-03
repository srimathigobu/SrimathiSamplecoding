package org.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.test.BaseClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon extends BaseClass{
@Test
public void task() {
	WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
WebElement userName = driver.findElement(By.id("email"));
userName.sendKeys("srirupenzil@gmail.com");
WebDriverWait wait=new WebDriverWait(driver,20);
WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("passContainer")));
WebElement passWord = driver.findElement(By.id("pass"));

passWord.sendKeys("banumathiak47");
WebElement loginBtn = driver.findElement(By.name("login"));
loginBtn.click();
String actualTitle = driver.getTitle();
SoftAssert s=new SoftAssert();
s.assertEquals("facebook", "facebook");






}

}
