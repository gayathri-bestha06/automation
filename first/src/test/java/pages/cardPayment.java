package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cardPayment {
	
	WebDriver driver;
	
	public cardPayment(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//span[normalize-space()='Credit / Debit / ATM Card']")
	private WebElement cardDd;
	
	@FindBy(xpath="//input[@id='cc-input']")
	private WebElement cctxt;
	
	@FindBy(xpath="//input[@placeholder='MM / YY']")
	private WebElement monthtxt;
	
	@FindBy(xpath="//input[@id='cvv-input']")
	private WebElement cvvtxt;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement checkBox;
	
	@FindBy(xpath="//button[@class='Button-module_button__P7hTI font-m-semibold Button-module_neutral__OtiH- L13GJr font-m-semibold']")
	private WebElement verifyBtn; 
	
	
	public void cardAction() {
		cardDd.click();
	}
	
	public void ccAction(String ccNum) {
		cctxt.click();
		cctxt.sendKeys(ccNum);
	}
	
	public void monthAction(String mm, String yy) {
		monthtxt.sendKeys(mm);
		monthtxt.sendKeys(Keys.ARROW_RIGHT);
		monthtxt.sendKeys(yy);
	}
	
	public void cvvAction(String cvvNum) {
		cvvtxt.sendKeys(cvvNum);
	}
	
	public void checkAction() {
		checkBox.click();
	}
	
	public void button() {
		verifyBtn.click();
	}
	
	

}
