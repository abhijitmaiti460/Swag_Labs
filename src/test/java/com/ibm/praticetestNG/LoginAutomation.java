package com.ibm.praticetestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginAutomation extends BaseClass {
	
	@Test
	public void loginWithInvalidUsernameOrPassword() throws InterruptedException {
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard");
		Thread.sleep(1000);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret");
		
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		
		WebElement errorMessageButton = driver.findElement(By.className("error-button"));
		Thread.sleep(1000);
		errorMessageButton.click();
		
		username.clear();
		password.clear();
	}
	
	@Test(dependsOnMethods ="loginWithInvalidUsernameOrPassword")
	public void loginWithValidUsernameAndPassword() throws InterruptedException {
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		Thread.sleep(1000);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		
	}

}
