package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	
WebDriver driver;
	
	
	
	public ProductPage(WebDriver driver) {
	    this.driver = driver;
	    PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/a[2]")
	private WebElement item;
	
	public void onclick() throws InterruptedException {
		item.click();
		Thread.sleep(5000);
	}

}
