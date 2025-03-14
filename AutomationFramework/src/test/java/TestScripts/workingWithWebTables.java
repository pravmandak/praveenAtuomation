package TestScripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class workingWithWebTables {

	WebDriver driver;

	// Open Browser and Launch URL

	@Parameters({ "AppURL" })
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

	@Test
	public void validateWebTable() {

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr"));

		System.out.println("total number of Rows : " + rows.size()); // total rows 7

		for (int i = 2; i < rows.size(); i++) {

			for (int j = 1; j <= 3; j++) {

				String col = driver.findElement(By.xpath("//table[@id='customers']//tbody//tr[" + i + "]//td[" + j + "]"))
						.getText();
				
				if (col.equals("Canada")) {
					System.out.println("Canda is exist in the table");
				}
				
				System.out.println(col);
				

			}

		}

	}

}
