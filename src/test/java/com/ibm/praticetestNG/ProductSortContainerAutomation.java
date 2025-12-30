package com.ibm.praticetestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ProductSortContainerAutomation extends BaseClass{

	@Test
	public void productSortContainer() throws InterruptedException {
		WebElement dropdown = driver.findElement(By.className("product_sort_container"));
		dropdown.click();
		Select selectContent = new Select(dropdown);
		selectContent.selectByValue("lohi");
		Thread.sleep(1000);
		//shoppingCart();
	}
	
	
	
	
	

}
