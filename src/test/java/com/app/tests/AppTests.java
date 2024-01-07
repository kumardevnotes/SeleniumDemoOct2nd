package com.app.tests;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
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

	@Test(enabled = false)
	public void verifyHomePage() {
		boolean isHomePageLoaded  =  homePage.isHomePageLoaded();
		if(isHomePageLoaded == true) {
			System.out.println("Homepage is verified without issues");
			System.out.println("Test");
		}
		else {
			Assert.fail("Something went wrong. Homepage is not verified");
		}
	}

	@Test (invocationCount =  3)
	public void verifySignup() throws Exception {
		homePage.launchSignupPage();
		String loginCredentials  = signupPage.signUpWithApp();
		homePage.launchLoginPage();
		String[] loginData  = loginCredentials.split("-");
		loginPage.loginIntoApp(loginData[0], loginData[1]);

	}

	@Test(enabled = false)
	public void verifyLoggedInUsername() throws Exception {
		
		String rootPath =  System.getProperty("user.dir");
		FileInputStream fis =  new FileInputStream(rootPath +"//src/test/resources/appData.Properties");
		Properties props = new Properties();
		props.load(fis);
		
		String emailAddress  = props.getProperty("appUserEmailID");
		String password  = props.getProperty("apppassword");
		String loggedInUserNameExpected  =props.getProperty("appUserName"); 
		
		homePage.launchLoginPage();
		loginPage.loginIntoApp(emailAddress, password);
		
		String loggedInUserNameActual = homePage.getLoggedInUserName();
		
		if(loggedInUserNameActual.equals(loggedInUserNameExpected)) {
			System.out.println("Loggedin username is verified without issues");
		}
		else {
			captureScreenshot("verifyLoggedInUsername_failed");
			Assert.fail("Something went wrong. Loggedin username is not verified. Please check");
		}
		
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	private void captureScreenshot(String screenshotName) throws Exception {
				String rootPath = System.getProperty("user.dir");
				File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				File dest = new File(rootPath + "//Screenshots/" + screenshotName + ".png");
				FileHandler.copy(src, dest);
	}

}
