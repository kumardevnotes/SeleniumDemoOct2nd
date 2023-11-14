package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethodsDemo4 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.speaklanguages.com/");
		
		WebElement privacyPolicyElement = driver.findElement(By.linkText("Privacy policy"));
		
		JavascriptExecutor jsObj = (JavascriptExecutor) driver;
		jsObj.executeScript("arguments[0].scrollIntoView();", privacyPolicyElement);
		
		driver.quit();
	}

}
