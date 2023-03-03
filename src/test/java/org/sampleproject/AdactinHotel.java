package org.sampleproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AdactinHotel {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("Srimathi95");
        WebElement passWord = driver.findElement(By.id("password"));
        passWord.sendKeys("Aksriyash@2023");
        WebElement login = driver.findElement(By.id("login"));
        login.click();
        WebElement location = driver.findElement(By.id("location"));
        Select s=new Select(location);
        s.selectByValue("Paris");
        WebElement Hotels =driver.findElement(By.id("hotels"));
        Select s1=new Select(Hotels);
        s1.selectByVisibleText("Hotel Sunshine");
        WebElement roomType =driver.findElement(By.id("room_type"));
        Select s2=new Select(roomType);
        s2.selectByValue("Deluxe");
        WebElement noOfRoom =driver.findElement(By.id("room_nos"));
        Select s3=new Select(noOfRoom);
        s3.selectByIndex(4);
        WebElement checkIn =driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        checkIn.sendKeys("20/03/2023");
        WebElement checkOut =driver.findElement(By.xpath("(//input[@type='text'])[3]"));
        checkOut.sendKeys("25/03/2023");
        WebElement noOfAdult = driver.findElement(By.id("adult_room"));
        Select s4=new Select(noOfAdult);
        s4.selectByIndex(2);
        WebElement noOfChild = driver.findElement(By.id("child_room"));
        Select s5=new Select(noOfChild);
        s5.selectByIndex(1);
        WebElement search = driver.findElement(By.name("Submit"));
        search.click();
        
        WebElement select = driver.findElement(By.id("radiobutton_0"));
        select.click();
        WebElement entry = driver.findElement(By.id("continue"));
        entry.click();
        
        WebElement firstName = driver.findElement(By.id("first_name"));
        firstName.sendKeys("srimathi");
        WebElement lastName = driver.findElement(By.id("last_name"));
        lastName.sendKeys("gobu");
        
        WebElement address = driver.findElement(By.id("address"));
        address.sendKeys("2/1655-1 om sakthi nagar,Ramnad");
        WebElement creditCard = driver.findElement(By.id("cc_num"));
        creditCard.sendKeys("6230 4300 1300 5300");
        WebElement creditCardNo = driver.findElement(By.id("cc_type"));
        Select s6=new Select(creditCardNo);
        s6.selectByVisibleText("VISA");
        WebElement expiryMonth = driver.findElement(By.id("cc_exp_month"));
        Select s7=new Select(expiryMonth);
        s7.selectByVisibleText("June");
        WebElement expiryYear = driver.findElement(By.id("cc_exp_year"));
        Select s8=new Select(expiryYear);
        s8.selectByVisibleText("2018");
        WebElement ccv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
        ccv.sendKeys("178");
        WebElement book = driver.findElement(By.className("reg_button"));
        book.click();
        WebDriverWait wait=new WebDriverWait(driver,10);
        WebElement searchHotel = wait.until(ExpectedConditions.elementToBeClickable(By.id("search_hotel")));
        searchHotel.click();
        WebElement selectLocation = driver.findElement(By.id("location"));
        Select s9=new Select(selectLocation);
        s9.selectByVisibleText("Paris");
        WebElement selHotel = driver.findElement(By.className("search_combobox"));
        Select s10=new Select(selHotel);
        s10.selectByVisibleText("Hotel Sunshine");
        WebElement selRoomType = driver.findElement(By.className("search_combobox"));
        Select s11=new Select(selRoomType);
        s11.selectByVisibleText("Deluxe");
        WebElement selNoOfRoom = driver.findElement(By.className("search_combobox"));
        Select s12=new Select(selNoOfRoom);
        s12.selectByIndex(4);
        
        

        
}
}	