package TestScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadPropertiesFileExample {

	public static void main(String[] args)  {
		
		//Step 1: Properties file created then read the file to this class
		
		Properties  prop = new Properties();
	
		try {
		
		FileInputStream  fip = new FileInputStream("/Users/mpk/Desktop/testSelenium/AutomationFramework/config.properties");
		
		prop.load(fip);
		
		String URL = prop.getProperty("QA_URL");
		String UN = prop.getProperty("QAUserName");
		String PWD= prop.getProperty("QAPassword");
		
		System.out.println(URL);
		System.out.println(UN);
		System.out.println(PWD);
		
		
		} catch(Exception ex) {
			System.out.println(ex);
		}

	}

}
