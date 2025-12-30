package com.ibm.praticetestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ShoppingCartContainerAutomation extends BaseClass{
	
	@Test
	public void shoppingCart() throws InterruptedException {
		WebElement numberOfProductAdded  = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span"));
		System.out.println("Number of Product Added :"+numberOfProductAdded.getText());
		WebElement cart = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
		cart.click();
		Thread.sleep(1000);
		removeButtonInShoppingCart();
			
	}
	
	public void removeButtonInShoppingCart() throws InterruptedException {
		List<WebElement> removeButtonsList = driver.findElements(
		        By.cssSelector(".btn.btn_secondary.btn_small.cart_button"));
		for(WebElement btn : removeButtonsList){
		    System.out.println(btn.getText());  
		}
		for(int i=0;i<1;i++) {
			removeButtonsList.get(i).click();
			Thread.sleep(1000);
		}
	
	}
	
	public void continueShoppingButton() throws InterruptedException {
		WebElement continueButton = driver.findElement(By.id("continue-shopping"));
		continueButton.click();
		Thread.sleep(1000);
	}
}
