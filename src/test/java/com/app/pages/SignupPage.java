package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SignupPage {
	
WebDriver driver =  null;
	
	public SignupPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By firstName_field  = By.name("first_name");
	By lastName_field  = By.name("last_name");
	By email_field  = By.name("email");
	By password_field  = By.name("password");
	By gender_dd_locator  = By.name("sex");
	By day_dd_locator  = By.name("dob_day");
	By month_dd_locator  = By.name("dob_month");
	By year_dd_locator  = By.name("dob_year");
	
	public String signUpWithApp() throws Exception {
		
		String emailAddress  = "johnlegend@gmail.com";
		String password  = "pwd1122##";
		
		WebElement firstNameField  = driver.findElement(firstName_field);
		firstNameField.sendKeys("John");
		
		WebElement lastNameField  = driver.findElement(lastName_field);
		lastNameField.sendKeys("Legend");
		
		WebElement emailField  = driver.findElement(email_field);
		emailField.sendKeys(emailAddress);
		
		WebElement passwordField  = driver.findElement(password_field);
		passwordField.sendKeys(password);
		
		WebElement genderDropdownElement  = driver.findElement(gender_dd_locator);
		Select genderDropdown =  new Select(genderDropdownElement);
		genderDropdown.selectByIndex(1);
		
		WebElement dayDropdownElement  = driver.findElement(day_dd_locator);
		Select dayDropdown =  new Select(dayDropdownElement);
		dayDropdown.selectByIndex(1);
		
		WebElement monthDropdownElement  = driver.findElement(month_dd_locator);
		Select monthDropdown =  new Select(monthDropdownElement);
		monthDropdown.selectByIndex(1);
		
		WebElement yearDropdownElement  = driver.findElement(year_dd_locator);
		Select yearDropdown =  new Select(yearDropdownElement);
		yearDropdown.selectByIndex(1);
		
		WebElement signUpButton  = driver.findElement(By.xpath("//input[@value='Sign up']"));
		signUpButton.click();
		
		Thread.sleep(6000);
		
		return emailAddress + "-" + password ;
	
	}

}
