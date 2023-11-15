package com.selenium.demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumMethodsDemo5 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		//Alert handling in Selenium
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("TestUser");
		Thread.sleep(2000);
		//driver.findElement(By.name("proceed")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept(); 
		//alert.dismiss(); // To click on Cancel button on the alert window, if any
		
		Thread.sleep(4000);
		
		driver.quit();
	}

}
