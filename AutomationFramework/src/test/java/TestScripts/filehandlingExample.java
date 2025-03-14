package TestScripts;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class filehandlingExample {

	public static void main(String[] args) throws IOException {

		// Excel //Note// Doc // We have File class in Java

		File obj = new File("/Users/mpk/Downloads/test1.txt");

		if (obj.createNewFile()) {

			System.out.println("File created successfully with name :" + obj.getName());
		} else {
			System.out.println("File already created with same name");
		}
		
		//I want to write some text inside that note pad
		
		FileWriter  wr = new FileWriter("/Users/mpk/Downloads/test.txt");
		
		wr.write("I am learning Selenium");
		
		wr.close();
		
		//If i want to delete a file ...
		
		if(obj.delete()) {
			System.out.println("File deleted successfully");
		} else {
			System.out.println("Not deleted or file not found");
		}
		

	}

}
