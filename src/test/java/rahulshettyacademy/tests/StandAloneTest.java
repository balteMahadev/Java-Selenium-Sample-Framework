package rahulshettyacademy.tests;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StandAloneTest {

	public static void main(String[] args) {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		String productName = "ZARA COAT 3";
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		driver.get("https://rahulshettyacademy.com/client");
//		driver.findElement(By.id("userEmail")).sendKeys("baltemahadev633@gmail.com");
//		driver.findElement(By.id("userPassword")).sendKeys("Mahadev@1995");
//		driver.findElement(By.id("login")).click();
//		List<WebElement> products = wait
//				.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='card']/div/h5/b")));
//		WebElement prod = products.stream().filter(
//				product -> product.findElement(By.xpath("//div[@class='card']/div/h5/b")).getText().equals(productName))
//				.findFirst().orElse(null);
//		prod.findElement(By.xpath("//parent::h5/following-sibling::button[2]")).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".ng-animation")));
//		driver.findElement(By.xpath("//button[@routerlink=\"/dashboard/cart\"]")).click();
//		List<WebElement> cartProducts = driver.findElements(By.xpath("//div[@class='cartSection']/h3"));
//		Boolean match = cartProducts.stream().anyMatch(cartProduct -> cartProduct.getText().equals(productName));
//		Assert.assertTrue(match);
//		driver.findElement(By.cssSelector(".totalRaw button")).click();
//		WebElement checkout = driver.findElement(By.xpath("//li/button[text()='Checkout']"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView(true);", checkout);
//		Actions a = new Actions(driver);
//		a.sendKeys(driver.findElement(By.xpath("//input[@placeholder=\\\"Select Country\\\"]")), "India").perform();
////		driver.findElement(By.xpath("//input[@placeholder=\"Select Country\"]")).sendKeys("India");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(
//				By.xpath("(//section)[2]/div/following-sibling::button/span[text()=' India']"))).click();
////		driver.findElement(By.xpath("(//section)[2]/div/following-sibling::button/span[text()=' India']")).click();
//		driver.findElement(By.xpath("//a[text()='Place Order ']")).click();
//		String thankyou = driver.findElement(By.xpath("//h1")).getText();
//		Assert.assertTrue(thankyou.equalsIgnoreCase("Thankyou for the order."));
//		driver.close();

	}

}
