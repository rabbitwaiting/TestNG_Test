package firsttestngpack;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class FirstTestNGFile {
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
    //String driverPath = "C:\\Users\\owner\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe";
	String driverPath = "C:\\Users\\owner\\Downloads\\chromedriver\\chromedriver.exe";
    public WebDriver driver ; 
 @Test
 public void verifyHomepageTitle() {

	 System.out.println("launching firefox browser"); 
     //System.setProperty("webdriver.firefox.marionette", driverPath);
      //driver = new FirefoxDriver();
	 System.setProperty("webdriver.chrome.driver",driverPath);
   	WebDriver driver = new ChromeDriver();
     //driver.get(baseUrl);
     driver.navigate().to(baseUrl);
     String expectedTitle = "Welcome: Mercury Tours";
     String actualTitle = driver.getTitle();
     Assert.assertEquals(actualTitle, expectedTitle);
     driver.close();
 }
	
}
