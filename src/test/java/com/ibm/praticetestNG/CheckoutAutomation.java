package com.ibm.praticetestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckoutAutomation extends BaseClass {
	@Test
	public void checkoutButton() throws InterruptedException {
		WebElement checkoutButton = driver.findElement(By.id("checkout"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(1000);
		checkoutButton.click();
		
	}

}
