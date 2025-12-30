package com.ibm.praticetestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class CheckoutInfoAutomation extends BaseClass {
	@Test(priority = 2)
	public void checkoutInformationWithFeild() throws InterruptedException {
		WebElement firstNamInputFeild = driver.findElement(By.id("first-name"));
		firstNamInputFeild.sendKeys("Abhijit");
		Thread.sleep(1000);
		
		WebElement lastNameInputFeild = driver.findElement(By.id("last-name"));
		lastNameInputFeild.sendKeys("Maiti");
		Thread.sleep(1000);
		
		WebElement postalCodeInputFeild = driver.findElement(By.id("postal-code"));
		postalCodeInputFeild.sendKeys("721644");
		Thread.sleep(1000);
		
		continueButton(true);
	
	}
	@Test(priority = 1)
	public void  checkoutInformatioinWithoutFeild() throws InterruptedException {
		Thread.sleep(1000);
		continueButton(false);
	}
	
	
	public void continueButton(Boolean isValue) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(1000);
		driver.findElement(By.id("continue")).click();
		if(!isValue) {
			Thread.sleep(1000);
			errorMessageCatch();
		}
	}
	
	
	public void errorMessageCatch() throws InterruptedException {
	
		driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[1]/div[4]/h3/button")).click();
		Thread.sleep(1000);
	}

}
