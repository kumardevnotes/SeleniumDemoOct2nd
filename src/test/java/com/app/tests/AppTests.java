package com.app.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.app.pages.HomePage;
import com.app.pages.LoginPage;
import com.app.pages.SignupPage;

public class AppTests {

	WebDriver driver = null;
	HomePage homePage = null;
	LoginPage loginPage = null;
	SignupPage signupPage = null;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.speaklanguages.com/");

		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
		signupPage = new SignupPage(driver);
	}

	@Test
	public void verifyHomePage() {
		homePage.isHomePageLoaded();
	}

	@Test
	public void verifySignup() throws Exception {
		homePage.launchSignupPage();
		signupPage.signUpWithApp();
	}

	@Test
	public void verifyLoggedInUsername() {
		homePage.launchLoginPage();
		loginPage.loginIntoApp("johntest@gmail.com", "Pwd1122");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
