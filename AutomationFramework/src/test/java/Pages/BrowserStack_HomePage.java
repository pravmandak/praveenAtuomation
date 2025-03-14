package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrowserStack_HomePage {
	
	WebDriver driver;

	@FindBy(xpath = "//h1")
	WebElement txtele_header;

	@FindBy(xpath = "//a[@title='Sign in']")
	WebElement lnk_SignIn;

	@FindBy(xpath = "//a[text()='Get started free']")
	WebElement btn_GetStartedFree;
	
	
	public BrowserStack_HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	public void verifyHeaderText() {
		try {
		String headerText = txtele_header.getText();
		if (headerText.equals("App & Browser Testing Made Easy")) {
			System.out.println("Page header displayed successfully");
		} else {
			System.out.println("Failed to validate Home page header");
		}
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}

	public void clickSingInButton() {
		try {
		if (lnk_SignIn.isDisplayed()) {
			lnk_SignIn.click();
		}
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}

	public void clickGetStartedButton() {
		if (btn_GetStartedFree.isDisplayed()) {
			btn_GetStartedFree.click();
		}
	}

}
