package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;
import pages.PaymentPage;
import pages.ProdDetailsPage;
import pages.ProductPage;
import pages.cardPayment;
import utils.WaitUtil;
import utils.WindowSwitch;

public class TestCase extends BaseTest{
	
	@Test(priority=1)
	public void searchItem() throws InterruptedException {
		
		//Searching products
		HomePage hmepge = new HomePage(driver);
		String searchProd = "Socks for womens"; 
		hmepge.searchProduct(searchProd);
		
		//List of products and click on first product
		ProductPage ProdPge = new ProductPage(driver);
		ProdPge.onclick();	
	}
	
	@Test(priority=2)
	public void prodDetails() throws InterruptedException {
		WindowSwitch ww = new WindowSwitch();
		
		ww.switchToWindow(driver);
		
		ProdDetailsPage obj3 = new ProdDetailsPage(driver);
		
		WaitUtil.waitMethod(driver, obj3.addtoCart());
		obj3.addtoCart().click();
		
		WaitUtil.waitMethod(driver, obj3.PlaceOrder());
		obj3.PlaceOrder().click();
		Thread.sleep(5000);
		
	}
	
	@Test(priority=3)
	public void loginTest() throws InterruptedException {
		LoginPage lgnPage = new LoginPage(driver);
		
		String num = "9603158191";
		
		lgnPage.enterMobile(num);
		lgnPage.submit();
		
		lgnPage.enterOtp();
		Thread.sleep(20000);
		lgnPage.submit();
		
		Thread.sleep(5000);
		lgnPage.nextPage();
		Thread.sleep(5000);
	}
	
//	@Test(priority=4)
//	public void upiPaymentTest() throws InterruptedException {
//		String upiID = "9063006169@ibl";
//		
//		PaymentPage paymt = new PaymentPage(driver);
//		paymt.upi().click();
//		paymt.upi().sendKeys(upiID);
//		paymt.enterVerify();
//		Thread.sleep(5000);
//		WaitUtil.waitMethod(driver, paymt.displayText());
//		String result = paymt.displayText().getText();
//		System.out.println("UPI holder name : "+result);
//	}
	
	@Test(priority=5)
	public void cardPayTest() throws InterruptedException {
		String ccNumber = "5260990255034668";
		String mm = "01";
		String yy ="32";
		String cvvNum = "812";
		
		cardPayment cardtest = new cardPayment(driver);
		cardtest.cardAction();
		
		cardtest.ccAction(ccNumber);
		
		cardtest.monthAction(mm,yy);
		
		cardtest.cvvAction(cvvNum);
		Thread.sleep(5000);
		
		cardtest.checkAction();
		
		cardtest.button();
		Thread.sleep(5000);
	}

	

}
