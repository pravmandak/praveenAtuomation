package TestScripts;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class ExptentReportExample {

	WebDriver driver;
	ExtentReports  report;
	ExtentTest test;

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

	
	public String  CapturSS(WebDriver driver) throws IOException {
		
		TakesScreenshot sc = ((TakesScreenshot) driver);
		
		File src = sc.getScreenshotAs(OutputType.FILE);
		
		File  DestLocation = new File("/Users/mpk/Desktop/testSelenium/AutomationFramework/Reports/Sample.png");
	  
	    
	    String errMsg = DestLocation.getAbsolutePath();
	    
	    FileUtils.copyFile(src, DestLocation);
	    
	    return errMsg;
		
	}
	
	
	@Parameters({"FullName", "emailId"})
	@Test (priority=0)
	public void TC_03_ValidateSignUpFunctionality(String FName, String Email) throws InterruptedException {
		
		  report = new ExtentReports("/Users/mpk/Desktop/testSelenium/AutomationFramework/Reports/ExReport.html");
		   test =  report.startTest("Demo Execution");
		

		WebDriverWait wait = new WebDriverWait(driver,10);
		
		JavascriptExecutor  js = (JavascriptExecutor)driver; 
		
		Thread.sleep(5000);
		
		// verify page title
		String pageTitle = driver.getTitle();
		if (pageTitle.equals("Selenium, API Testing, Software Testing & More QA Tutorials | Rahul Shetty Academy")) {
			test.log(LogStatus.INFO, "Working FIne ......");
			test.log(LogStatus.PASS, "User Successfully Launch the URL and Landed to Home Page");
		} else {
			test.log(LogStatus.FAIL, "Failed to Navigate to Home Page");
		}
		
		Thread.sleep(10000);
		// Clicking on Register Link
		WebElement registeLink = driver.findElement(By.xpath("//*[@class='login-btn']//a[@class='theme-btn']"));
		
		js.executeScript("arguments[0].click();", registeLink);
		
		//registeLink.click();
		
		
		Thread.sleep(5000);

		// verify the Sign up page is displayed
		WebElement signupTitle = driver.findElement(By.xpath("//h3[text()='Sign Up']"));
		if (signupTitle.isDisplayed()) {
			test.log(LogStatus.PASS, "Successfully Navigated to Register Page");
		} else {
			test.log(LogStatus.FAIL, test.addScreenCapture(pageTitle));
		}

		// Enter the full name and email details

		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));  //It got loaded in 5 secs... it will go to next step
		
		WebElement fullName = driver.findElement(By.id("name"));

		fullName.clear();
		
		test.log(LogStatus.INFO, "Full name text box data cleared");
		
		
		js.executeScript("arguments[0].value ='Praveen';", fullName);

		WebElement email = driver.findElement(By.id("email"));
		email.clear();
		email.sendKeys(Email);

		// Click on check box Agree terms

		WebElement chkBox = driver.findElement(By.xpath("//input[@id='allowMarketingEmails']"));

		chkBox.click();

		// Click on Send Code Button

		WebElement sendCodeButton = driver.findElement(By.id("otp-login-btn"));

		sendCodeButton.click();
		Thread.sleep(5000);

		// verify the message

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Verify']"))); 
		
		WebElement infoMessage = driver.findElement(By.xpath("//span[text()='Verify']"));

		wait.until(ExpectedConditions.alertIsPresent());  //10 Secs
		
		//Alert pop up window is expecting.....
		if (infoMessage.isDisplayed()) {
			System.out.println("Send Code page displayed as expected");
		} else {
			System.out.println("Failed to navigate to Send code page");
		}

	}



	@AfterMethod
	public void closeBrowser() {
		driver.close();
		report.endTest(test);
		report.flush();
		
	}

}
