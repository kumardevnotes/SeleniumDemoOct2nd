package com.selenium.demo;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethodsDemo2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		// To maximize the browser
		driver.manage().window().maximize();
		driver.get("https://www.speaklanguages.com/");
		Thread.sleep(2000);
		String window1 = driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.TAB);
		//driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.fb.com/");
		String window2 = driver.getWindowHandle();
		Thread.sleep(2000);
		
		driver.switchTo().window(window1);
		Thread.sleep(2000);
		driver.switchTo().window(window2);
		Thread.sleep(3000);
		
		//Verify pageTitle contains "Facebook"
		Set<String> allWindows  = driver.getWindowHandles();
		
		for(String myWindow : allWindows) {
			driver.switchTo().window(myWindow);
			if(driver.getTitle().contains("Facebook")) {
				System.out.println("Page title verified");
			}
			else {
				System.out.println("Page title not verified");
			}
		}
		
		//to close current Window
		driver.close();
		
		//to close all the opened windows
		driver.quit();
	}

}
