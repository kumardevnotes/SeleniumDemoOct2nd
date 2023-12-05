package com.testng.demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNgDemoWithAllAnnotations {
	
  @Test
  public void firstTest() {
	  System.out.println("first Test passed");
  }
  
  @Test
  public void secondTest() {
	  System.out.println("second Test passed");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I will run before each testcase");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I will run after completion of each testcase");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("I will run only once before the first testcase in the class is executed");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("I will run after the last testcase in the class is executed");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("I will run before the first test in the suite");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("I will run after the last test in the suite");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("I will run only once before all the testcases are triggered");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("I will run only once after all the testcases are triggered");
  }

}
