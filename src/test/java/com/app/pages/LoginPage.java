package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver =  null;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By email_filed = By.id("email_input");
	By password_field = By.id("password_input");
	By login_button = By.id("login_button");
	
	public void loginIntoApp(String emailAddress, String password) {
		driver.findElement(email_filed).sendKeys(emailAddress);
		driver.findElement(password_field).sendKeys(password);
		driver.findElement(login_button).click();
	}

}
