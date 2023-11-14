package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethodsDemo3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.speaklanguages.com/");
		
		By loginLocator = By.linkText("Log in");
		By emailLocator = By.id("email_input");
		By pwdLocator = By.id("password_input");
		By loginBtnLocator = By.id("login_button");
		
		driver.findElement(loginLocator).click();
		Thread.sleep(2000);
		
		WebElement emailAddressElement = driver.findElement(emailLocator);
		emailAddressElement.sendKeys("johnlegend@gmail.com");
		
		driver.findElement(emailLocator).clear();
		Thread.sleep(2000);
		driver.findElement(emailLocator).sendKeys("johnlegend@gmail.com");
		
		driver.findElement(pwdLocator).sendKeys("pwd11223344");
		Thread.sleep(2000);
		
		driver.findElement(loginBtnLocator).click();
		Thread.sleep(5000);
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		String pageSource  = driver.getPageSource();
		System.out.println(emailAddressElement.getAttribute("type"));
		
		
		By checkBoxBtnLocator = By.id("keep_logged_in_input");
		
		WebElement passwordElement = driver.findElement(pwdLocator);
		WebElement loginBtnElement = driver.findElement(loginBtnLocator);
		WebElement checkboxElement = driver.findElement(checkBoxBtnLocator);
		
		System.out.println(passwordElement.isDisplayed()); //true or false
		System.out.println(loginBtnElement.isEnabled());
		checkboxElement.click();
		System.out.println(checkboxElement.isSelected());
		checkboxElement.click();
		System.out.println(checkboxElement.isSelected());
		
		driver.quit();
	}

}
