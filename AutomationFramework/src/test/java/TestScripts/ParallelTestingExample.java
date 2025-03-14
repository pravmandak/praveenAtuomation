package TestScripts;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ParallelTestingExample {

	WebDriver driver;

	@Test()
	public void TC_01_ValidateSignUpFunctionality_Chrome() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/mpk/Downloads/chromedrivermac/chromedriver");

		ChromeOptions options = new ChromeOptions();

		options.setBinary("/Users/mpk/Desktop/Google Chrome.app/Contents/MacOS/Google Chrome");

		driver = new ChromeDriver(options);

		driver.get("https://courses.rahulshettyacademy.com/");

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

		WebElement fullName = driver.findElement(By.id("name"));

		fullName.clear();
		fullName.sendKeys("Praveen");

		WebElement email = driver.findElement(By.id("email"));
		email.clear();
		email.sendKeys("praveen.mtec@gmail.com");

		// Click on check box Agree terms

		WebElement chkBox = driver.findElement(By.xpath("//input[@id='allowMarketingEmails']"));

		chkBox.click();

		// Click on Send Code Button

		WebElement sendCodeButton = driver.findElement(By.id("otp-login-btn"));

		sendCodeButton.click();
		Thread.sleep(5000);

		// verify the message

		WebElement infoMessage = driver.findElement(By.xpath("//span[text()='Verify']"));

		if (infoMessage.isDisplayed()) {
			System.out.println("Send Code page displayed as expected");
		} else {
			System.out.println("Failed to navigate to Send code page");
		}

	}

	@Test()
	public void TC_02_verifyLoginZfunctionality() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/mpk/Downloads/chromedrivermac/chromedriver");

		ChromeOptions options = new ChromeOptions();

		options.setBinary("/Users/mpk/Desktop/Google Chrome.app/Contents/MacOS/Google Chrome");

		driver = new ChromeDriver(options);

		driver.get("https://courses.rahulshettyacademy.com/");

		// verify page title
		String pageTitle = driver.getTitle();
		if (pageTitle.equals("Home | Rahul Shetty Academy")) {
			System.out.println("User successfully launch the uRL and landed to home page");
		} else {
			System.out.println("Failed to navigate to Home Page");
		}
		Thread.sleep(10000);

		// Click login link

		WebElement loginlink = driver.findElement(By.xpath("//a[@class='theme-btn']"));
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

}
