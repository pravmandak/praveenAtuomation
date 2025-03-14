package Pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Demoqa_practiceform {
WebDriver driver;
@FindBy (xpath="//h1[text()='Practice Form']")
WebElement textele_header;
@FindBy (id="firstName")
WebElement txt_firstName;
@FindBy(id="lastName")
WebElement txt_lastname;
@FindBy(xpath="//input[@id='userEmail']")
WebElement txt_emailid;
@FindBy(xpath="//label[@for='gender-radio-2']")
WebElement btn_radiogender;
@FindBy(xpath="//input[@id='userNumber']")
WebElement txt_mobile;
@FindBy(xpath="//input[@id='subjectsInput']")
WebElement txt_subject;
@FindBy(xpath="//label[@for='hobbies-checkbox-2']")
WebElement chkb_hobbies;
@FindBy(xpath="//textarea[@id='currentAddress']")
WebElement txt_address;
@FindBy(xpath="//div[@id='state']")
WebElement drpdn_state;
@FindBy(xpath="//div[@class=' css-14jk2my-container']")
WebElement drpdn_city;
@FindBy(xpath="//button[contains(@id,'submit')]")
WebElement btn_submit;
@FindBy(xpath="//div[text()='Thanks for submitting the form']")
WebElement txt_Thankssubmit;

public Demoqa_practiceform (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
/*public void textele_header(){
	String txt = textele_header.getText();
	assertEquals("Practice Form",txt);
	}*/
public void textele_header() {
	String txt=textele_header.getText();
	if (txt.equals("Practice Form")) {
		System.out.println("header displayed successfully");
	}else {
		System.out.println("header not displayed");
	}
}
public void txt_firstName() {
	txt_firstName.clear();
	txt_firstName.sendKeys("Raziya");
}
public void txt_lastname() {
	txt_lastname.clear();
	txt_lastname.sendKeys("sulthana");
}
public void txt_emailid() {
	txt_emailid.clear();
	txt_emailid.sendKeys("raziyasulthana.mba@gmail.com");	
}
public void btn_radiogender() {
	btn_radiogender.click();
}
public void txt_mobile() {
	if (txt_mobile.isDisplayed()) {
		txt_mobile.clear();
		txt_mobile.sendKeys("6306064313");
	}else {
		System.out.println("if mobiletxt box not displayed");
	}
	}
public void txt_subject() {
	try {
	txt_subject.clear();
	txt_subject.sendKeys("English");
	txt_subject.sendKeys(Keys.TAB);
	}catch(Exception ex) {
		
	}

}
public void chkb_hobbies() {
	if(chkb_hobbies.isDisplayed()){
		chkb_hobbies.click();
	}else {
		System.out.println("if chkbox is not displayed");
	}
}
public void txt_address() {
	txt_address.clear();
	txt_address.sendKeys("Hayat nagar,Hyderabad");
}
public void drpdn_state() {
	Select obj=new Select(drpdn_state);
	obj.selectByVisibleText("NCR");
}
public void drpdn_city() {
	Select obj=new Select(drpdn_city);
	obj.selectByIndex(1);
}
public void btn_submit() {
	btn_submit.click();
}
public void txt_Thankssubmit() {
	String txt = txt_Thankssubmit.getText();
	//assertEquals("Thanks for submitting the form",txt);
	if (txt.equals("Thanks for submitting the form")) {
		System.out.println("thanks for submitting displayed successfully");
	}else {
		System.out.println("thanks page not displayed");
}
}}