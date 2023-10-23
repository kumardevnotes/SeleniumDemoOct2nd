package com.java.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ExceptionsDemo {

	public static void main(String[] args) throws IOException    {
		
		try {
			
			String empName = "hello"; 
			System.out.println(empName.toUpperCase());	
			
			int firstNum = 100, secondNum = 10;
			System.out.println(firstNum/secondNum);
			
			
			String rootPath =  System.getProperty("user.dir");
			FileInputStream fis =  new FileInputStream(rootPath +"//src/test/resources/appData.Properties");
			
			Properties props = new Properties();
			props.load(fis);
			
			System.out.println(props.getProperty("appBrowser"));
			
			
		} catch (NullPointerException e) {
			System.out.println("caught some exception: " + e);
		} catch (ArithmeticException e) {
			System.out.println("caught some exception: " + e);
		}
		catch (Exception e) {
			System.out.println("caught some exception: " + e);
		}
		
		finally {
			//disconnect from code
			System.out.println("I will always run whether you get exception or not");
		}

		System.out.println("main() is complete");
	}

}
