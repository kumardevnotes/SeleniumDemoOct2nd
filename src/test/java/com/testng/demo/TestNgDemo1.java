package com.testng.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgDemo1 {

	@Parameters({ "secondaryBrowser" })
	@Test(priority = 1, groups = { "Edge" })
	public void verifyApplaunchInEdge1(String browser) { 
		launchBrowser(browser);
		System.out.println("App verification is successful in " + browser);
	}

	@Parameters({ "primaryBrowser" })
	@Test(priority = 2, groups = { "Chrome" })
	public void verifyApplaunchInChrome1(String browser) { 
		launchBrowser(browser);
		System.out.println("App verification is successful in " + browser);
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
