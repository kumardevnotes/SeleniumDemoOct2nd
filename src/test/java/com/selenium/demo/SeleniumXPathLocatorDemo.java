package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumXPathLocatorDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = null;
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.speaklanguages.com");
		
//		WebElement logInElement  = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[4]/ul/li[1]/a"));
//		WebElement logInElement  = driver.findElement(By.xpath("//a[.='Log in']"));
		WebElement logInElement  = driver.findElement(By.xpath("//a[text()='Log in']"));
		
		logInElement.click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
//		WebElement signUpElement  = driver.findElement(By.xpath("//a[text()='Sign up']"));
		WebElement signUpElement  = driver.findElement(By.xpath("//a[contains(text(),'Sign up')]"));
		
		signUpElement.click();

		driver.close();
	}

}
