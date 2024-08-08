package rahulshettyacademy.tests;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import rahulshettyacademy.TestComponents.BaseTest;
import rahulshettyacademy.pageobjects.CartPage;
import rahulshettyacademy.pageobjects.CheckoutPage;
import rahulshettyacademy.pageobjects.ConfirmationPage;
import rahulshettyacademy.pageobjects.LandingPage;
import rahulshettyacademy.pageobjects.ProductCatalog;

public class SubmitOrderTest extends BaseTest{
    
	@Test
	public void submitOrder() throws IOException {
		String productName = "ZARA COAT 3";
		String email = "baltemahadev633@gmail.com";
		String password = "Mahadev@1995";
		
		LandingPage landingPage = launchApplication();
		ProductCatalog productCatalog = landingPage.loginApplication(email, password);
		
//		List<WebElement> products = productCatalog.getProductList();
		productCatalog.addProductToCart(productName);
		CartPage cartPage = productCatalog.gotToCartPage();
		
		Boolean match = cartPage.VerifyProductDisplayed(productName);
		Assert.assertTrue(match);
		
		CheckoutPage checkout=cartPage.goToCheckout();
		checkout.selectCountry("india");
//		ConfirmationPage confimationPage=checkout.submitOrder();
//		String confirmationMessage = confimationPage.getConfirmationMessage();
//		Assert.assertTrue(confirmationMessage.equalsIgnoreCase("Thankyou for the order."));
		driver.close();
	}
	

}
