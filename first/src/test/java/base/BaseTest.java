package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import utils.DriverFactory;
public class BaseTest {
	
	protected WebDriver driver;
	
	
	@BeforeClass
	public void setup() throws InterruptedException {
		
		driver = DriverFactory.getDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterClass
	public void teardown() {
		if(driver != null) {
			driver.quit();
		}
	}

}
