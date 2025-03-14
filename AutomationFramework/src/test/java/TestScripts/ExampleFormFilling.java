package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.Demoqa_practiceform;

public class ExampleFormFilling {

	WebDriver driver;

//Open Browser and Launch URL

	@Parameters({ "AppURL" })
	@BeforeMethod
	public void launchApplication(String URL) {

		System.setProperty("webdriver.chrome.driver", "/Users/mpk/Downloads/chromedrivermac/chromedriver");

		ChromeOptions options = new ChromeOptions();

		options.setBinary("/Users/mpk/Desktop/Google Chrome.app/Contents/MacOS/Google Chrome");

		driver = new ChromeDriver(options);

		driver.get(URL);

	}

	@Test
	public void TC01_verifyhomepage() throws InterruptedException {
		Demoqa_practiceform obj = new Demoqa_practiceform(driver);
		obj.textele_header();
		obj.txt_firstName();
		obj.txt_lastname();
		obj.txt_emailid();
		Thread.sleep(1000);
		obj.btn_radiogender();
		obj.txt_mobile();
		Thread.sleep(1000);
		obj.txt_subject();
		obj.chkb_hobbies();
		obj.txt_address();
		Thread.sleep(1000);
		// obj.drpdn_state();
		// obj.drpdn_city();
		obj.btn_submit();
		obj.txt_Thankssubmit();

	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
