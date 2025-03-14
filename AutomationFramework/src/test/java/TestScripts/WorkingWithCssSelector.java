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

public class WorkingWithCssSelector {
	
	
	WebDriver driver;

	//Open Browser and Launch URL

		@Parameters({"AppURL"})
		@BeforeMethod
		public void launchApplication(String URL) {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();

			driver.get(URL);

			driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}

	
	@Test
	public void AddproductsToCart() throws InterruptedException {
		
		WebElement chkBox1 = driver.findElement(By.cssSelector("#checkBoxOption1"));
		
		chkBox1.click();
		
        WebElement chkBox2 = driver.findElement(By.cssSelector("input#checkBoxOption2"));
		
		chkBox2.click();
		
		Thread.sleep(3000);
		
		WebElement radBtn1 = driver.findElement(By.cssSelector("label[for='radio1'] .radioButton"));
		
		radBtn1.click();
		
		WebElement rad2 = driver.findElement(By.cssSelector("[value='radio2']"));
		rad2.click();
		
	     
		}
		
		
	}


