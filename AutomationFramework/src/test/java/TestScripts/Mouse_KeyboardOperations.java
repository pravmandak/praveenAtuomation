package TestScripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

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

public class Mouse_KeyboardOperations {

	WebDriver driver;

//Open Browser and Launch URL

	@Parameters({"AppURL"})
	@BeforeMethod
	public void launchApplication(String URL) {

		System.setProperty("webdriver.chrome.driver", "/Users/mpk/Downloads/chromeUpdatedVersion/chromedriver");

		ChromeOptions options = new ChromeOptions();

		options.setBinary("/Users/mpk/Desktop/Google Chrome.app/Contents/MacOS/Google Chrome");

		driver = new ChromeDriver(options);

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	
	@Test ()
	public void TC_01() throws InterruptedException {

		driver.get("https://www.google.com"); 
		Actions ActObj = new Actions(driver);
		
		WebElement searchTxt = driver.findElement(By.xpath("//*[@title='Serchh']"));
		
		ActObj.moveToElement(searchTxt).
		keyDown(Keys.SHIFT).sendKeys("Selenium Webdriver").keyUp(Keys.SHIFT)
		.contextClick().build().perform();
		
	
	}
	
	@Test (enabled=false)
	public void HoldAndRelease() throws InterruptedException {
		
      driver.get("https://jqueryui.com/droppable/");
      
      Thread.sleep(5000);
      
      driver.switchTo().frame(0);
      
	  WebElement Drag = driver.findElement(By.id("draggable"));
	  WebElement Drop = driver.findElement(By.id("droppable"));
	  
	 
	  Actions ActObj = new Actions(driver);
	  ActObj.clickAndHold(Drag).moveToElement(Drop).release().build().perform();
	  Thread.sleep(5000);
	  
	  WebElement dropText = driver.findElement(By.xpath("//*[@id='droppable'] //p"));
	  
	  if(dropText.getText().equals("Dropped!")) {
		  System.out.println("Successfully Dropped to target ");
	  }else {
		  System.out.println("Not Successfull");
	  }
	}

	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
