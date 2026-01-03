package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
	WebDriver driver;
	
	public PaymentPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='Enter your UPI ID']")
	private WebElement upiid;
	
	@FindBy(xpath="//button[normalize-space()='Verify']")
	private WebElement verify;
	
	@FindBy(xpath="//div[@class='UKBnay font-s-semibold']")
	private WebElement text;
	
	public WebElement upi() {
		return upiid;
	}
	
	public void enterVerify() {
		verify.click();
	}
	
	public WebElement displayText() {
		
		return text;
	}

}
