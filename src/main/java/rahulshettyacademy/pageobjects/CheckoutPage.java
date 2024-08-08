package rahulshettyacademy.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rahulshettyacademy.AbstractComponents.AbstractComponents;

public class CheckoutPage extends AbstractComponents{
	WebDriver driver;
	public CheckoutPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='Select Country']")
	WebElement country;
	
	@FindBy(xpath="//button/span[text()=' India']")
	WebElement selectContry;
	
	@FindBy(xpath="/html/body/app-root/app-order/section/div/div/div[2]/div/div/div[3]/div[2]/div[2]/div/div[2]/a")
	WebElement submit;
	
	By results = By.xpath("//input[@placeholder=\"Select Country\"]/following-sibling::section");
	
	public void selectCountry(String contryName) {
		Actions actions = new Actions(driver);
		actions.sendKeys(country, contryName).build().perform();
		waitElementToAppear(results);
		scrollUntilElementVisible(selectContry);
		waitElemenntToClickable(selectContry);
	}
	
	public ConfirmationPage submitOrder() {
		scrollUntilElementVisible(submit);
		waitElemenntToClickable(submit);
		return new ConfirmationPage(driver);
	}
}
