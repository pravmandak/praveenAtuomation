package TestScripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

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

public class VerifySignupFuncitonalityForRSApplication {

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

	
	
	@Parameters({"FullName", "emailId"})
	@Test (priority=0)
	public void TC_03_ValidateSignUpFunctionality(String FName, String Email) throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver,10);
		
		JavascriptExecutor  js = (JavascriptExecutor)driver; 
		
		// verify page title
		String pageTitle = driver.getTitle();
		if (pageTitle.equals("Home | Rahul Shetty Academy")) {
			System.out.println("User successfully launch the uRL and landed to home page");
		} else {
			System.out.println("Failed to navigate to Home Page");
		}
		
		Thread.sleep(10000);
		// Clicking on Register Link
		WebElement registeLink = driver.findElement(By.xpath("//a[@class='theme-btn register-btn']"));
		
		js.executeScript("arguments[0].click();", registeLink);
		
		
		Thread.sleep(5000);

		// verify the Sign up page is displayed
		WebElement signupTitle = driver.findElement(By.xpath("//h3[text()='Sign Up']"));
		if (signupTitle.isDisplayed()) {
			System.out.println("Successfully Navigated to Signup page");
		} else {
			System.out.println("Failed to navigate to Signup Page");
		}

		// Enter the full name and email details

		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));  //It got loaded in 5 secs... it will go to next step
		
		WebElement fullName = driver.findElement(By.id("name"));

		fullName.clear();
		
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

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("frame1")));  //5 secs.. remaining 5 secs ..skip
	
	}

	
	@Parameters({"FullName", "emailId"})
	@Test (priority=0, enabled = false )
	public void TC_01_ValidateSignUpFunctionality(String FName, String Email) throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver,10);
		
		// verify page title
		String pageTitle = driver.getTitle();
		if (pageTitle.equals("Home | Rahul Shetty Academy")) {
			System.out.println("User successfully launch the uRL and landed to home page");
		} else {
			System.out.println("Failed to navigate to Home Page");
		}
		
		Thread.sleep(10000);
		// Clicking on Register Link
		WebElement registeLink = driver.findElement(By.xpath("//a[@class='theme-btn register-btn']"));
		registeLink.click();
		Thread.sleep(5000);

		// verify the Sign up page is displayed
		WebElement signupTitle = driver.findElement(By.xpath("//h3[text()='Sign Up']"));
		if (signupTitle.isDisplayed()) {
			System.out.println("Successfully Navigated to Signup page");
		} else {
			System.out.println("Failed to navigate to Signup Page");
		}

		// Enter the full name and email details

		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));  //It got loaded in 5 secs... it will go to next step
		
		WebElement fullName = driver.findElement(By.id("name"));

		fullName.clear();
		fullName.sendKeys(FName);

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

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("frame1")));  //5 secs.. remaining 5 secs ..skip
	}

	@Parameters({"FullName", "emailId"})
	@Test(priority=1, enabled=false)
	public void TC_02_verifyLoginfunctionality(String FName, String Email) throws InterruptedException {

		// verify page title
		String pageTitle = driver.getTitle();
		if (pageTitle.equals("Home | Rahul Shetty Academy")) {
			System.out.println("User successfully launch the uRL and landed to home page");
		} else {
			System.out.println("Failed to navigate to Home Page");
		}
		Thread.sleep(10000);

		// Click login link

		WebElement loginlink = driver.findElement(By.xpath("//a[@class='"));
		loginlink.click();

		// verify the login page is displayed
		WebElement loginTitle = driver.findElement(By.xpath("//h3[text()='Log in']"));
		if (loginTitle.isDisplayed()) {
			System.out.println("Successfully Navigated to Login page");
		} else {
			System.out.println("Failed to navigate to Login Page");
		}

		// enter valid email in email text box
		WebElement email = driver.findElement(By.id("email"));
		email.clear();
		email.sendKeys("praveen.mtech@gmail.com");

		// click on login button
		WebElement loginButton = driver.findElement(By.id("otp-login-btn"));
		loginButton.click();

		// verify the message

		WebElement infoMessage = driver.findElement(By.xpath("//span[text()='Verify']"));

		if (infoMessage.isDisplayed()) {
			System.out.println("Send Code page displayed as expected");
		} else {
			System.out.println("Failed to navigate to Send code page");
		}

	}
	
	
	

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
