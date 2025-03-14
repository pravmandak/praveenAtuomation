package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import org.testng.annotations.Parameters;

import Pages.BrowserStack_HomePage;
import Pages.BrowserStack_SignUpPage;

public class Sprint1_TestCases {
	
	WebDriver driver;
	BrowserStack_HomePage  objHomePage;
	
	@Parameters({"AppURL"})
	@BeforeMethod
	public void launchApplication(String URL) {

		System.setProperty("webdriver.chrome.driver", "/Users/mpk/Downloads/chromedrivermac/chromedriver");

		ChromeOptions options = new ChromeOptions();

		options.setBinary("/Users/mpk/Desktop/Google Chrome.app/Contents/MacOS/Google Chrome");

		driver = new ChromeDriver(options);

		driver.get(URL);

	}
	
	
	@Test(enabled=false)
	public void TC_01_Verify_HomePage_Header() {
	
		BrowserStack_HomePage  objHomePage =  new BrowserStack_HomePage(driver);
		objHomePage.verifyHeaderText();
	}
	
	@Test
	public void TC_02_verifySignUpFunctionality() throws InterruptedException {
		
		BrowserStack_HomePage  objHomePage =  new BrowserStack_HomePage(driver);
		BrowserStack_SignUpPage objSingUpPage = new BrowserStack_SignUpPage(driver);
		
		objHomePage.clickGetStartedButton();
		Thread.sleep(10000);
		objSingUpPage.verifyPageHeader();
		objSingUpPage.enterFullName();
		objSingUpPage.enterBusinessEmail();
		objSingUpPage.enterPassword();
		objSingUpPage.SelectAgreeCheckBox();
		objSingUpPage.clickSingMeUpButton();
	}

}
