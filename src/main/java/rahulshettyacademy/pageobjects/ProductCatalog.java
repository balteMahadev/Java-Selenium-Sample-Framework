package rahulshettyacademy.pageobjects;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rahulshettyacademy.AbstractComponents.AbstractComponents;

public class ProductCatalog extends AbstractComponents{
	WebDriver driver;
	public ProductCatalog(WebDriver driver){
		
		//Initialization
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='card']/div/h5/b")
	List<WebElement> products;
	
	@FindBy(css=".ng-animation")
	WebElement spinner;
	
	By productsBy = By.xpath("//div[@class='card']/div/h5/b");
	By addToCart = By.xpath("//parent::h5/following-sibling::button[2]");
	By toastMessage = By.cssSelector("#toast-container");
	
	public List<WebElement> getProductList() {
		waitElementToAppear(productsBy);
		return products;
	}
	
	public WebElement getProductByName(String productName) {
		WebElement prod = getProductList().stream().filter(product ->
		product.findElement(By.xpath("//div[@class='card']/div/h5/b")).getText().equals(productName)).findFirst().orElse(null);
		return prod;
	}
	
	public void addProductToCart(String productNam) {
		WebElement prod = getProductByName(productNam);
		prod.findElement(addToCart).click();
		waitElementToAppear(toastMessage);
		waitElementToDisappear(spinner);
		
		
	}
	
}
