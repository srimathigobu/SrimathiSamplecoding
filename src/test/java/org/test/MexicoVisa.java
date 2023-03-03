package org.test;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class MexicoVisa extends BaseClass {
	public static void main(String[] args) throws IOException {
// TODO Auto-generated method stub
        	 browserLaunch();
     		urlLaunch("https://citas.sre.gob.mx/");
     		maxWindow();
			WebDriverWait w = new WebDriverWait(driver, 15);
			WebDriverWait x = new WebDriverWait(driver, 5);
			WebDriverWait y = new WebDriverWait(driver,5);
			WebDriverWait z = new WebDriverWait(driver, 5);
			WebDriverWait a = new WebDriverWait(driver, 5);
			driver.manage().window().maximize();
//			driver.manage().deleteAllCookies();
			driver.get("https://citas.sre.gob.mx/");
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='button'][2]")));
			driver.findElement(By.xpath("//button[@type='button'][2]")).click();
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='dropdown-toggle']")));
			driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
			driver.findElement(By.xpath("//img[@src='https://citasapi.sre.gob.mx/img/eua.png']")).click();
			
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("akilanuday26@gmail.com");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Aksriyash@2022");
			
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
			
			driver.findElement(By.xpath("//*[local-name()='svg' and @fill='currentColor']")).click();
			
			driver.findElement(By.xpath("//button[@class='btn btn-primary pull-right']")).click();
			
			//Login flow ended
			x.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")));
			driver.findElement(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")).click();
			
			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
			
			y.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")));
			driver.findElement(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")).click();
			
			y.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")));
			driver.findElement(By.xpath("//div[@class='form-group']//a[@rel='noopener noreferrer']//span//*[name()='svg']")).click();
			
			//Please comment from below code if you're using india - start here
			z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs4__combobox'] input[type='search']")));
			driver.findElement(By.cssSelector("div[id='vs4__combobox'] input[type='search']")).click();
			a.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs4__combobox'] input[type='search']")));
			driver.findElement(By.cssSelector("div[id='vs4__combobox'] input[type='search']")).sendKeys("china",Keys.ENTER);
			
			
			z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs2__combobox'] input[placeholder='--Select--']")));
			driver.findElement(By.cssSelector("div[id='vs2__combobox'] input[placeholder='--Select--']")).click();
			z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs2__combobox'] input[placeholder='--Select--']")));
			driver.findElement(By.cssSelector("div[id='vs2__combobox'] input[placeholder='--Select--']")).sendKeys("Shanghai",Keys.ENTER);
			//Please comment from below code if you're using india - end here
			
			z.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[class='btn btn-primary']")));
			driver.findElement(By.cssSelector("a[class='btn btn-primary']")).click();
			
			z.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn.btn-primary.btn-sm")));
			driver.findElement(By.cssSelector(".btn.btn-primary.btn-sm")).click();
			
			z.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[class='form-group col-md-12'] a[rel='noopener noreferrer']")));
			driver.findElement(By.cssSelector("div[class='form-group col-md-12'] a[rel='noopener noreferrer']")).click();
		
			
			z.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[placeholder='introduce first name']")));
			driver.findElement(By.cssSelector("input[placeholder='introduce first name']")).sendKeys("AKILAN");
		
			
			z.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[placeholder='Introduce last name']")));
			driver.findElement(By.cssSelector("input[placeholder='Introduce last name']")).sendKeys("UDAYAKUMAR");
			
			w.until(ExpectedConditions.visibilityOfElementLocated(By.name("birthdate")));
			driver.findElement(By.name("birthdate")).click();
			
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@class='ui-datepicker-month']")));
			WebElement staticdropdown1 = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
			Select dropdown1 = new Select(staticdropdown1);
			dropdown1.selectByVisibleText("May");
			
			WebElement staticdropdown2 = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
			Select dropdown2 = new Select(staticdropdown2);
			dropdown2.selectByValue("1991");
			
			z.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='26']")));
			driver.findElement(By.xpath("//a[normalize-space()='26']")).click();
		
			
			z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs5__combobox'] input[placeholder='--Select--']")));
			driver.findElement(By.cssSelector("div[id='vs5__combobox'] input[placeholder='--Select--']")).click();
			z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs5__combobox'] input[placeholder='--Select--']")));
			driver.findElement(By.cssSelector("div[id='vs5__combobox'] input[placeholder='--Select--']")).sendKeys("mas",Keys.ENTER);
			
			z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs6__combobox'] input[placeholder='--Select--']")));
			driver.findElement(By.cssSelector("div[id='vs6__combobox'] input[placeholder='--Select--']")).click();
			z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs6__combobox'] input[placeholder='--Select--']")));
			driver.findElement(By.cssSelector("div[id='vs6__combobox'] input[placeholder='--Select--']")).sendKeys("ind",Keys.ENTER);
		
			z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs7__combobox'] input[placeholder='--Select--']")));
			driver.findElement(By.cssSelector("div[id='vs7__combobox'] input[placeholder='--Select--']")).click();
			z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs7__combobox'] input[placeholder='--Select--']")));
			driver.findElement(By.cssSelector("div[id='vs7__combobox'] input[placeholder='--Select--']")).sendKeys("cas",Keys.ENTER);
		
		
			z.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@value='Two'])[1]")));
			driver.findElement(By.xpath("(//input[@value='Two'])[1]")).click();
			
			
			z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs8__combobox'] input[placeholder='--Select--']")));
			driver.findElement(By.cssSelector("div[id='vs8__combobox'] input[placeholder='--Select--']")).click();
			z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs8__combobox'] input[placeholder='--Select--']")));
			driver.findElement(By.cssSelector("div[id='vs8__combobox'] input[placeholder='--Select--']")).sendKeys("ind",Keys.ENTER);
			
			
			z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs9__combobox'] input[placeholder='--Select--']")));
			driver.findElement(By.cssSelector("div[id='vs9__combobox'] input[placeholder='--Select--']")).click();
			z.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='vs9__combobox'] input[placeholder='--Select--']")));
			driver.findElement(By.cssSelector("div[id='vs9__combobox'] input[placeholder='--Select--']")).sendKeys("mil",Keys.ENTER);
		
			
			z.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@value='Two'])[2]")));
			driver.findElement(By.xpath("(//input[@value='Two'])[2]")).click();
			
			a.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn.btn-primary.pull-right")));
			driver.findElement(By.cssSelector(".btn.btn-primary.pull-right")).click();
		
			a.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class='btn btn-primary']")));
			driver.findElement(By.cssSelector("button[class='btn btn-primary']")).click();
		
		
		
		
		}
		

	}


