package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumMethodsDemo1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		// To maximize the browser
		driver.manage().window().maximize();
		
		Dimension dimensionObj = new Dimension(450, 450);
		driver.manage().window().setSize(dimensionObj);
		Thread.sleep(2000); 
		
		driver.manage().window().maximize();

		// To launch the web application in the browser that we opened above
		driver.get("https://www.speaklanguages.com/");

		WebElement loginElement = driver.findElement(By.linkText("Log in"));
		loginElement.click();
		Thread.sleep(2000); // 4000ms == 4seconds

		driver.navigate().back();
		Thread.sleep(2000);

		driver.navigate().forward();
		Thread.sleep(2000);

		driver.navigate().refresh();
		Thread.sleep(2000);

		// To close the browser
		driver.close();
	}

}
