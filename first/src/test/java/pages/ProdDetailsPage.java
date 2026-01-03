package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProdDetailsPage {
	WebDriver driver;

	public ProdDetailsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[normalize-space()='Add to cart']")
	private WebElement addToCart;
	
	@FindBy(xpath="(//button[@class='dSM5Ub JMrpad KcXDCU'])[1]")
	private WebElement placeOrder;
	
	public WebElement addtoCart() {
		return addToCart;
	}
	
	public WebElement PlaceOrder() {
		return placeOrder;
	}

}
