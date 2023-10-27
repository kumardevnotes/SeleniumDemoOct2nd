package com.io.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class TextDocReadWriteDemo {

	public static void main(String[] args) throws IOException  {
		
		//toget the rootpath of the project in your laptop/local
		String rootPath = System.getProperty("user.dir");
		
		//to load the file into File Obj called myFile
		File myFile = new File(rootPath + "//src/test/resources/TestDoc.txt");
		
		//To read data from the file loaded in line 16
		BufferedReader bfr = new BufferedReader(new FileReader(myFile));
		String str = "";
		
		//to read line by line and store this line into str variable and then print this in sysout
		while((str = bfr.readLine()) != null) { //whenever the reading reaches end of the doc, it returns a null and while becomes false and quit
			System.out.println(str);
		}
		

	}

}
