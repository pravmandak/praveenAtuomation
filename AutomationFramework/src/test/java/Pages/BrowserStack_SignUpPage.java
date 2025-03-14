package Pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrowserStack_SignUpPage {
	
	WebDriver driver;

	@FindBy(xpath = "(//h1)[1]")
	WebElement txtEle_header;

	@FindBy(id = "user_full_name")
	WebElement txt_FullName;

	@FindBy(id = "user_email_login")
	WebElement txt_BusinessEmail;

	@FindBy(id = "user_password")
	WebElement txt_password;

	@FindBy(xpath = "//input[@id='tnc_checkbox']")
	WebElement chk_AgreeTerms;

	@FindBy(xpath = "//input[@id='user_submit']")
	WebElement btn_SignMeUp;
	
	
	public BrowserStack_SignUpPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	

	public void verifyPageHeader() {
		String text = txtEle_header.getText();
		assertEquals("Create a FREE Account", text);
	}

	public void enterFullName() {
		if (txt_FullName.isDisplayed()) {
			txt_FullName.clear();
			txt_FullName.sendKeys("Praveen Kumar");
		} else {
			System.out.println("Full Name Text box is not displayed on the page");
		}
	}

	public void enterBusinessEmail() {
		if (txt_BusinessEmail.isDisplayed()) {
			txt_BusinessEmail.clear();
			txt_BusinessEmail.sendKeys("praveen.qa986@gmail.com");
		} else {
			System.out.println("Business Email Text box is not displayed on the page");
		}
	}

	public void enterPassword() {
		if (txt_password.isDisplayed()) {
			txt_password.clear();
			txt_password.sendKeys("Hello@1234");
		} else {
			System.out.println("Password Text box is not displayed on the page");
		}
	}
	
	public void SelectAgreeCheckBox() {
		if (chk_AgreeTerms.isDisplayed()) {
			chk_AgreeTerms.click();
		} else {
			System.out.println("Agree Check box is not displayed on the page");
		}
	}
	
	public void clickSingMeUpButton() {
		if (btn_SignMeUp.isDisplayed()) {
			btn_SignMeUp.click();
		} else {
			System.out.println("Signme up button is not displayed on the page");
		}
	}

}
