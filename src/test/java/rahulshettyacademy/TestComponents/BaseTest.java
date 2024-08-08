package rahulshettyacademy.TestComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import rahulshettyacademy.pageobjects.LandingPage;

public class BaseTest {
	public WebDriver driver;
	public WebDriver initilalizeDriver() throws IOException
	{
		//Properties class
		Properties properties = new Properties();
		String s = System.getProperty("user.dir");
		String path = System.getProperty("user.dir")+"\\src\\main\\java\\rahulshettyacademy\\resources\\GlobalData.properties";
		FileInputStream fileInputStream = new FileInputStream(path);
		properties.load(fileInputStream);
		
		String browserName = properties.getProperty("browser");
		
		if (browserName.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;
	}
	
	public LandingPage launchApplication() throws IOException {
		driver = initilalizeDriver();
		LandingPage landingPage = new LandingPage(driver);
		landingPage.goTo();
		return landingPage;
	}

}
