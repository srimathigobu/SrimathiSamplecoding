package org.test;

import java.awt.Robot;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;                                                              //*[@xmlns='http://www.w3.org/2000/svg'][@class='bi bi-x-circle']

public class SampleMain extends BaseClass {
	public static void main(String[] args) throws IOException {
	
		browserLaunch();
		urlLaunch("https://citas.sre.gob.mx/");
		maxWindow();
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='btn btn-primary btn-sm'])[2]"))).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='dropdown-toggle']"))).click();
		driver.findElement(By.xpath("//img[@src='https://citasapi.sre.gob.mx/img/eua.png']")).click();
		WebElement txtEmail = driver.findElement(By.name("email"));
		txtEmail.sendKeys("akilanuday26@gmail.com");
		WebElement txtPass = driver.findElement(By.xpath("//input[@type='password']"));
        txtPass.sendKeys("Aksriyash@2022");
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.xpath("(//*[@fill='currentColor'])[1]")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-primary pull-right']")).click();
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       w.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@xmlns='http://www.w3.org/2000/svg'][@class='bi bi-x-circle']"))).click();
             
        
        driver.findElement(By.xpath("//a[text()='Schedule']")).click();
        w.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='bi bi-x-circle']"))).click();
        
        w.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='vs__open-indicator']"))).click();
        w.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='vs__selected'])[1]"))).click();
        
        
        
        
        
        
        
        
        

	
	}
}
