package TestScripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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

public class RobotClass_keyBoardOperations {

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

	
	
	@Test (priority=0)
	public void TC01KeyBoardActions() throws InterruptedException, AWTException {

	WebElement courses = driver.findElement(By.linkText("Courses"));
	courses.click();
	
	//I want to press Down arrow and I want to press Tab ....UP
	
	Robot rb = new Robot();
	
	System.out.println("Hello");
	rb.keyPress(KeyEvent.VK_SHIFT);
	Thread.sleep(5000);
	rb.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(5000);
	rb.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(5000);
	System.out.println("Hello");
	rb.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(5000);
	System.out.println("Hello");
	rb.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(5000);
	

	
	}
		



	

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
