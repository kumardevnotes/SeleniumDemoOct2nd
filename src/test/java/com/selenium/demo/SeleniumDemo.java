package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumDemo {
	/*
	 * Launch Chrome browser Maximize browser Launch https://facebook.com Close the
	 * browser finally
	 */

	public static void main(String[] args) throws InterruptedException {

		// System.setProperty("webdriver.chrome.driver", "/Users/ruby/Documents/AutomationRepos/SeleniumDemo/chromedriver.exe");

		// To launch the browser
		WebDriver driver = null;

		String browser = "Chrome";
		// switch (System.getenv("browser")) {
		switch (browser) {
		case "Chrome":
			driver = new ChromeDriver();
			break;
		case "Edge":
			driver = new EdgeDriver();
			break;
		}

		// To maximize the browser
		driver.manage().window().maximize();

		// To launch the web application in the browser that we opened above
		driver.get("https://www.speaklanguages.com/");
		
		WebElement  loginElement  = driver.findElement(By.linkText("Log in"));
		loginElement.click();
		Thread.sleep(4000); // 4000ms == 4seconds
		
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
