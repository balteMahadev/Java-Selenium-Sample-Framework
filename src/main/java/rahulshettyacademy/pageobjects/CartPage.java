package rahulshettyacademy.pageobjects;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rahulshettyacademy.AbstractComponents.AbstractComponents;

public class CartPage extends AbstractComponents{
	WebDriver driver;
	public CartPage(WebDriver driver){
		
		//Initialization
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='cartSection']/h3")
	List<WebElement> cartProducts;
	
	@FindBy(xpath="//button[text()='Buy Now']")
	WebElement checkoutEle;
	
	
	
	public Boolean VerifyProductDisplayed(String productName) {
		Boolean match = cartProducts.stream().anyMatch(cartProduct -> cartProduct.getText().equals(productName));
		return match;
	}
	
	public CheckoutPage goToCheckout() {
		waitElemenntToClickable(checkoutEle);
		return new CheckoutPage(driver);
		
	}
	
		
	
}
