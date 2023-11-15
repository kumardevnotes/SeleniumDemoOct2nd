package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumMethodsDemo4 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.speaklanguages.com/");
		
		WebElement privacyPolicyElement = driver.findElement(By.linkText("Privacy policy"));
		
		Thread.sleep(2000);
		
		// Javascript examples in Selenium
		JavascriptExecutor jsObj = (JavascriptExecutor) driver;
		jsObj.executeScript("arguments[0].scrollIntoView();", privacyPolicyElement);
		
		Thread.sleep(4000);
		
		WebElement englishDDElement  = driver.findElement(By.id("language_menu"));
		
		//Actions class examples in Selenium
		Actions action = new Actions(driver);
		action.moveToElement(englishDDElement).build().perform();
		
		Thread.sleep(6000);
		
		/*
		WebElement srcElement  = driver.findElement(By.id("drag"));
		WebElement targetElement  = driver.findElement(By.id("drop"));
		action.dragAndDrop(srcElement, targetElement).build().perform();
		*/
		
		driver.quit();
	}

}
