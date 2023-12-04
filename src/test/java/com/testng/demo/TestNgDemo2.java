package com.testng.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestNgDemo2 {

	@Test(priority = 1, groups = { "Edge" , "Chrome" })
	public void verifyApplaunchInEdge2() {
		launchBrowser("Edge");
		System.out.println("App verification is successful in Edge");
	}

	@Test(priority = 2, groups = { "Chrome" })
	public void verifyApplaunchInChrome2() {
		launchBrowser("Chrome");
		System.out.println("App verification is successful in Chrome");
	}

	public void launchBrowser(String browser) {
		WebDriver driver = null;
		switch (browser) {
		case "Chrome":
			driver = new ChromeDriver();
			break;
		case "Edge":
			driver = new EdgeDriver();
			break;
		}
		driver.manage().window().maximize();
		driver.get("https://www.speaklanguages.com/");
		driver.quit();
	}

}
