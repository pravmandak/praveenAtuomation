package TestScripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class facebookExample {

	WebDriver driver;

//Open Browser and Launch URL

	
	@BeforeMethod
	public void launchApplication() {

		System.setProperty("webdriver.chrome.driver", "/Users/mpk/Downloads/chromedrivermac/chromedriver");

		ChromeOptions options = new ChromeOptions();

		options.setBinary("/Users/mpk/Desktop/Google Chrome.app/Contents/MacOS/Google Chrome");

		driver = new ChromeDriver(options);

		driver.get("https:www.amazon.in");

		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	
	
	@Test (priority=0)
	public void TC_03_ValidateSignUpFunctionality() throws InterruptedException {
		
		
		JavascriptExecutor  js = (JavascriptExecutor)driver; 
		
	
      //js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	  
	WebElement topSections = driver.findElement(By.xpath("//span[contains(text(),'Top picks sourced from Indian artisans')]"));
      
	js.executeScript("arguments[0].scrollIntoView(true);", topSections);
	
	Thread.sleep(5000);
      System.out.println("Test");
	}

	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
