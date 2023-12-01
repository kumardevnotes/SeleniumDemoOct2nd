package com.selenium.demo;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumMethodsDemo7 {

	public static void main(String[] args) throws InterruptedException, Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//pageLoadTimeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.get("https://www.speaklanguages.com");
		
		//Before throwing timeout exception, it will wait 60 seconds to locate the element on the page
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		
		// explicit wait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Sign up")));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("login_button")));
		driver.findElement(By.id("login_button")).click();
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		Thread.sleep(2000);
		driver.quit();
	}

}
