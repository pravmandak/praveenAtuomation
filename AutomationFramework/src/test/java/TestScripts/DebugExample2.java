package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DebugExample2 {
	
	static WebDriver driver;
	
	public void login(String UN, String PWD) {
		driver.findElement(By.id("qq")).sendKeys(UN);
		driver.findElement(By.id("ff")).sendKeys(PWD);
	}
	
	
	public static void main(String[] args) {
	
	DebugExample2  obj = new DebugExample2();
		
	System.setProperty("webdriver.chrome.driver", "/Users/mpk/Downloads/chromeUpdatedVersion/chromedriver");

	ChromeOptions options = new ChromeOptions();

	options.setBinary("/Users/mpk/Desktop/Google Chrome.app/Contents/MacOS/Google Chrome");

	driver = new ChromeDriver(options);

	driver.get("https://www.google.com");

	driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	obj.login("praveen", "12345");
}
}

