package com.selenium.demo;

import static org.testng.Assert.expectThrows;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumMethodsDemo6 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.speaklanguages.com");
		
		// Below findElements() is used to access more than one WebElement
		List<WebElement> languageElementList = driver.findElements(By.xpath("//p[@class='site_link']//a"));
		
		System.out.println(languageElementList.size());
		
		for(WebElement langaugeElement :  languageElementList) {
			System.out.println(langaugeElement.getText());
		}
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Sign up")).click();
		
		WebElement firstNameField  = driver.findElement(By.name("first_name"));
		firstNameField.sendKeys("John");
		
		WebElement lastNameField  = driver.findElement(By.name("last_name"));
		lastNameField.sendKeys("Legend");
		
		WebElement emailField  = driver.findElement(By.name("email"));
		emailField.sendKeys("johnlegend@gmail.com");
		
		WebElement passwordField  = driver.findElement(By.name("password"));
		passwordField.sendKeys("pwd1122##");
		
		WebElement genderDropdownElement  = driver.findElement(By.name("sex"));
		Select genderDropdown =  new Select(genderDropdownElement);
		genderDropdown.selectByIndex(1);
		genderDropdown.selectByValue("Female");
		genderDropdown.selectByVisibleText("Male");
		
		WebElement dayDropdownElement  = driver.findElement(By.name("dob_day"));
		Select dayDropdown =  new Select(dayDropdownElement);
		dayDropdown.selectByIndex(1);
		dayDropdown.selectByValue("4");
		dayDropdown.selectByVisibleText("3");
		
		WebElement monthDropdownElement  = driver.findElement(By.name("dob_month"));
		Select monthDropdown =  new Select(monthDropdownElement);
		monthDropdown.selectByIndex(1);
		monthDropdown.selectByValue("4");
		monthDropdown.selectByVisibleText("March");
		
		WebElement yearDropdownElement  = driver.findElement(By.name("dob_year"));
		Select yearDropdown =  new Select(yearDropdownElement);
		yearDropdown.selectByIndex(1);
		yearDropdown.selectByValue("1944");
		yearDropdown.selectByVisibleText("1933");
		
		//yearDropdown.deselectAll();
		
		WebElement signUpButton  = driver.findElement(By.xpath("//input[@value='Sign up']"));
		signUpButton.click();
	
		
		
		Thread.sleep(8000);
		
		driver.quit();
	}

}
