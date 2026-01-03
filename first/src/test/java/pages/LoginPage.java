package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement mobileText;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submitButton;
	
	@FindBy(xpath="//input[@class='c3Bd2c kWl1fv XnemW5']")
	private WebElement otp;
	
	@FindBy(xpath="//button[normalize-space()='CONTINUE']")
	private WebElement continueButton;
	
	public void enterMobile(String mobileNumber) {
		mobileText.sendKeys(mobileNumber);
	}
	
	public void submit() {
		submitButton.click();
	}
	
	public void enterOtp() {
	boolean otpText = 	otp.isDisplayed();
	if(otpText) {
		otp.click();
	}	
	}
	
	public void nextPage() {
		continueButton.click();
	}
}
