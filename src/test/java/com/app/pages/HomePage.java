package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver =  null;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	By app_Logo =  By.id("logo");
	By search_Field =  By.id("search_input");
	By search_Button =  By.id("search_submit");
	By login_link =  By.linkText("Log in");
	By signup_Link =  By.linkText("Sign up");
	By privacyPolicy_Link =  By.linkText("Privacy policy");
	

	public boolean isHomePageLoaded() {
		boolean allElementsLoaded  =  driver.findElement(app_Logo).isDisplayed() &&
				driver.findElement(search_Field).isDisplayed() &&
				driver.findElement(search_Button).isDisplayed() &&
				driver.findElement(login_link).isDisplayed() &&
				driver.findElement(signup_Link).isDisplayed();
		
		JavascriptExecutor jsObj = (JavascriptExecutor) driver;
		jsObj.executeScript("arguments[0].scrollIntoView();", driver.findElement(privacyPolicy_Link));
		
		return allElementsLoaded && driver.findElement(privacyPolicy_Link).isDisplayed();
	}

	public void launchLoginPage() {
		driver.findElement(login_link).click();
	}
	
	public void launchSignupPage() {
		driver.findElement(signup_Link).click();
	}
	
	public String getLoggedInUserName() {
		return "";
	}
}