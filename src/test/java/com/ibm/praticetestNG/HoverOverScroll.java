package com.ibm.praticetestNG;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoverOverScroll {
	public HoverOverScroll(List<WebElement> list, WebDriver driver) throws InterruptedException {
		int count =0;
		for(WebElement e : list) {
			new Actions(driver).moveToElement(e).perform();
			if(count==1) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,300)");
			}
			count++;
			System.out.println(e.getText());
			Thread.sleep(1000);
			
		}
	}

}
