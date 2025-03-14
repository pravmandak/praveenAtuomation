package TestScripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class workingWithWebTables2 {
	
	
	WebDriver driver;

	//Open Browser and Launch URL

		@Parameters({"AppURL"})
		@BeforeMethod
		public void launchApplication(String URL) {

			System.setProperty("webdriver.chrome.driver", "/Users/mpk/Downloads/chromeUpdatedVersion/chromedriver");

			ChromeOptions options = new ChromeOptions();

			options.setBinary("/Users/mpk/Desktop/Google Chrome.app/Contents/MacOS/Google Chrome");

			driver = new ChromeDriver(options);

			driver.get(URL);

			driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}

	
	@Test
	public void validateWebTable() {
		
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr"));
	
		
		System.out.println("total number of Rows : " + rows.size());   //total rows 7
		
		
		for(int i=2; i<rows.size(); i++) {
			
			     String col1 = driver.findElement(By.xpath("//table[@id='customers']//tbody//tr["+i+"]//td[1]")).getText();
			     String col2 = driver.findElement(By.xpath("//table[@id='customers']//tbody//tr["+i+"]//td[2]")).getText();
			     String col3 = driver.findElement(By.xpath("//table[@id='customers']//tbody//tr["+i+"]//td[3]")).getText();
			     
			     
			     if(col1.equals("Island Trading")) {
			    	 System.out.println("Yes Island trading is exisit in the table");
			     }
			     
			     
			     if(col3.equals("Canada")  ||  col3.equals("Italy") ) {
			    	 System.out.println("Yes Canada / Italy is exisit in the table");
			     }
			     
			     
			    /* System.out.println(col1);
			     System.out.println(col2);
			     System.out.println(col3);*/
	     
		}
		
		
	}

}
