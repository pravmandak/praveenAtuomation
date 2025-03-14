package TestScripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class HandlingBrowserWindoows {

	WebDriver driver;

//Open Browser and Launch URL

	@Parameters({ "AppURL" })
	@BeforeMethod
	public void launchApplication(String URL) {

		System.setProperty("webdriver.chrome.driver", "/Users/mpk/Downloads/chromeUpdatedVersion/chromedriver");

		ChromeOptions options = new ChromeOptions();

		options.setBinary("/Users/mpk/Desktop/Google Chrome.app/Contents/MacOS/Google Chrome");

		driver = new ChromeDriver(options);

		driver.manage().window().maximize();

		driver.get(URL);

		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test()
	public void HoldAndRelease() throws InterruptedException {

		WebElement button = driver.findElement(By.id("windowButton"));
		button.click();
		Thread.sleep(3000);

		// Logic to get the Parent Window Name

		String ParentWindowName = driver.getWindowHandle();

		// Logic to get the child windows

		Set<String> childWindows = driver.getWindowHandles(); // 1 2/10

		// Switching from Parent Window to Child Window

		Iterator<String> it = childWindows.iterator(); // 0 1 2 //It will iterate all the child windows one by one

		while (it.hasNext()) {
			String availableChild = it.next(); // it will store the child window name which is present

			if (ParentWindowName.equals(availableChild)) {
				System.out.println("Parent and child id are same");
			} else {
				driver.switchTo().window(availableChild);
				
			}

		}

		WebElement text = driver.findElement(By.xpath("//h1")); // trying to get the text of another child window
		String actText = text.getText();

		if (actText.equals("This is a sample page")) {
			System.out.println("Yes Page is displayed");
		} else {
			System.out.println("No Page is displayed");
		}
		
		driver.switchTo().defaultContent();  // it will switch to parent
		//driver.switchTo().window(ParentWindowName);
		
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
