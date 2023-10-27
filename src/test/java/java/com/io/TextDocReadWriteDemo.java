package java.com.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TextDocReadWriteDemo {

	public static void main(String[] args) throws IOException {
		
		String rootPath = System.getProperty("user.dir");
		
		File myFile = new File(rootPath + "//src/test/resources/TestDoc.txt");
		
		BufferedReader bfr = new BufferedReader(new FileReader(myFile));
		String str = "";
		while((str = bfr.readLine()) != null) {
			System.out.println(bfr.readLine());
		}
		

	}

}
