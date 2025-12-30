package com.ibm.praticetestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckoutOverviewAutomation extends BaseClass {
	@Test
	public void finishButton() throws InterruptedException {
		List<WebElement> list =  driver.findElements(By.cssSelector("div[data-test='inventory-item-name']"));
		new HoverOverScroll(list, driver);
		WebElement btn = driver.findElement(By.id("finish"));
		btn.click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("back-to-products")).click();
		Thread.sleep(1000);
	}
}
