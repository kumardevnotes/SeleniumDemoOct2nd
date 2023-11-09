package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumDemo2 {

	/*
	 * :: Selenium Locators ::
	 * 
	 * id name className linkText partialLinkText tagName
	 * 
	 * xPath
	 * 
	 * CSSSelector
	 */

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = null;
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.speaklanguages.com/");

		WebElement signUpElement = driver.findElement(By.id("nav_signup")); // id="nav_signup"

		WebElement loginElement = driver.findElement(By.id("nav_login"));

		loginElement.click();

		Thread.sleep(2000);

		WebElement emailAddressField = driver.findElement(By.name("email"));
		emailAddressField.sendKeys("johnLegend@gmail.com");

		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys("pwd1122");

		WebElement loginBtnElement = driver.findElement(By.id("login_button"));
		loginBtnElement.click();

		WebElement errorMessageElement = driver.findElement(By.className("error_message"));
		String errorText = errorMessageElement.getText();
		
//		WebElement errorMessageElement = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/ul/li"));
//		String errorText = errorMessageElement.getText();
		
		
		/*
		 WebElement  loginElement  = driver.findElement(By.linkText("Log in"));
		loginElement.click();
		
		WebElement  loginElement  = driver.findElement(By.partialLinkText("Log in"));
		loginElement.click();
		
		 WebElement  loginElement  = driver.findElement(By.tagName("div"));
		loginElement.click();
		
		*/

		System.out.println(errorText);

		driver.close();
	}

}
