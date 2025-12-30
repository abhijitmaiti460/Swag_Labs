package com.ibm.praticetestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BurgerButtonContainElementAutomation extends BaseClass{
	@Test(priority = 1)
	public void burgerButtonToOepn() throws InterruptedException {
		WebElement burgerButton = driver.findElement(By.id("react-burger-menu-btn"));
		burgerButton.click();
		Thread.sleep(1000);
	}
	
	@Test(priority = 3)
	public void crossButtonToClose() {
		WebElement crossButton = driver.findElement(By.id("react-burger-cross-btn"));
		crossButton.click();
	}
	
	@Test (priority = 2)
	public void listItemCheck() throws InterruptedException {
		List<WebElement> list = driver.findElements(By.cssSelector(".bm-item.menu-item"));
		new HoverOver(list, driver);
	}

}
