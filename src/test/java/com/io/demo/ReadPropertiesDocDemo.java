package com.io.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesDocDemo {

	public static void main(String[] args) throws IOException    {
			
		//to get rootpath in local
			String rootPath =  System.getProperty("user.dir");
			
			//to load the document into fis
			FileInputStream fis =  new FileInputStream(rootPath +"//src/test/resources/appData.Properties");
			
			//to load content into props object
			Properties props = new Properties();
			props.load(fis);
			
			//trying to print property values
			System.out.println(props.getProperty("appBrowser"));

			
	}

}
