package com.testng.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgDemo3 {

	@DataProvider(name = "appLogins")
	public Object[][] createData1() {
	 return new Object[][] {
	   { "john1111@gmail.com", "pwd1000" },
	   { "john2222@gmail.com", "pwd2000" },
	   { "john3333@gmail.com", "pwd3000" },
	   { "john4444@gmail.com", "pwd4000" },
	 };
	}

	@Test(dataProvider = "appLogins")
	public void verifyAppLaunch(String emailAddress, String password) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.speaklanguages.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.id("email_input")).sendKeys(emailAddress);
		driver.findElement(By.id("password_input")).sendKeys(password);
		
		driver.findElement(By.id("login_button")).click();
		Thread.sleep(4000);
		driver.quit();
	}
}
