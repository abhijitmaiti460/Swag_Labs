package com.ibm.praticetestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class InventoryItemAutomation extends BaseClass {

	@Test
	public void inventoryItem() throws InterruptedException {
		List<WebElement> list =  driver.findElements(By.cssSelector("div[data-test='inventory-item-name']"));
		new HoverOverScroll(list, driver);
		new Actions(driver).moveToElement(list.get(2)).perform();
		Thread.sleep(1000);
		new Actions(driver).moveToElement(list.get(2)).click().perform();
	}
	
	@Test(dependsOnMethods = "inventoryItem")
	public void addToCart() throws InterruptedException {

		WebElement addToCartButton = driver.findElement(By.id("add-to-cart"));
		Thread.sleep(1000);
		addToCartButton.click();
		Thread.sleep(1000);

		WebElement backButton = driver.findElement(By.id("back-to-products"));
		backButton.click();
		Thread.sleep(1000);
		
		List<WebElement> addToCartButtonsList = driver.findElements(
		        By.cssSelector(".btn.btn_primary.btn_small.btn_inventory"));
		for(WebElement btn : addToCartButtonsList){
		    System.out.println(btn.getText());  
		}
		for(int i=0;i<addToCartButtonsList.size();i++) {
			addToCartButtonsList.get(i).click();
			Thread.sleep(1000);
			if(i==2) break;
		}
		
		
	}
	@Test(dependsOnMethods = "addToCart")
	public void removeButton() throws InterruptedException {
		List<WebElement> removeButtonsList = driver.findElements(
		        By.cssSelector(".btn.btn_secondary.btn_small.btn_inventory"));
		for(WebElement btn : removeButtonsList){
		    System.out.println(btn.getText());  
		}
		for(int i=0;i<2;i++) {
			removeButtonsList.get(i).click();
			Thread.sleep(1000);
		}
		
	
	}
	
}
