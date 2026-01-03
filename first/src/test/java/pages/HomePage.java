package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	
	
	public HomePage(WebDriver driver) {
	    this.driver = driver;
	    PageFactory.initElements(driver, this);
	}

	//search bar
	@FindBy(xpath="//input[@placeholder='Search for Products, Brands and More']")
	private WebElement searchInput;
	
	public void clickOnSearch() {
		searchInput.click();
	}
	
	public void giveProductName(String ProductName) {
		searchInput.sendKeys(ProductName);
	}
	
	public void enterKeys() {
		searchInput.sendKeys(Keys.ENTER);
	}
	
	public void searchProduct(String ProductName) {
		clickOnSearch();
		giveProductName(ProductName);
		enterKeys();
		
		
	}

}
