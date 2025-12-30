package com.ibm.praticetestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	static WebDriver driver;
	
  @BeforeSuite
  public void Setup() {
	  String url = "https://www.saucedemo.com/";
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
	  driver.get(url);
  }
  
  @AfterSuite
  public void tearDown() throws InterruptedException {
	  driver.quit();
	  Thread.sleep(1000);
	  
  }
}
