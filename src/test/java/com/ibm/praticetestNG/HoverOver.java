package com.ibm.praticetestNG;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoverOver {
	public HoverOver(List<WebElement> list, WebDriver driver) throws InterruptedException {
		
		for(WebElement e : list) {
			new Actions(driver).moveToElement(e).perform();
			System.out.println(e.getText());
			Thread.sleep(1000);
		}
	}
	

}
