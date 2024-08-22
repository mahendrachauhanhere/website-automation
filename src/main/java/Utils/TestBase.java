package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;

	@BeforeMethod
	@Parameters("browser")
	public void setup(@Optional("chrome") String browser) {
		switch (browser.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			System.out.println("Google Chrome browser opened successfully.");
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			System.out.println("FirefoxDriver browser opened successfully.");
			driver = new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			System.out.println("Microsoft Edge browser opened successfully.");
			driver = new EdgeDriver();
			break;
		default:
			throw new IllegalArgumentException("Browser not supported: " + browser);
		}
		driver.manage().window().maximize();
		/* Frontend */ driver.get("https://crowdfunding-frontend-delta.vercel.app");
		/* Backend */ driver.get("https://crowdfunding-admin-gamma.vercel.app");
	}

	// @BeforeMethod
	// @Parameters("browser")
	// public void setup(@Optional("chrome") String browser) {
//	public void lunchBroeser(String browser) {
//		switch (browser.toLowerCase()) {
//		case "chrome":
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.manage().deleteAllCookies();
//			driver.get("https://crowdfunding-frontend-delta.vercel.app");
//			break;
//		case "msedge":
//			WebDriverManager.edgedriver().setup();
//			driver = new EdgeDriver();
//			driver.manage().window().maximize();
//			driver.manage().deleteAllCookies();
//			driver.get("https://crowdfunding-frontend-delta.vercel.app");
//			break;
//		case "firefox":
//			WebDriverManager.firefoxdriver().setup();
//			driver = new FirefoxDriver();
//			driver.manage().window().maximize();
//			driver.manage().deleteAllCookies();
//			driver.get("https://crowdfunding-frontend-delta.vercel.app");
//			
//			break;
//		default:
//			
//			driver = null;
//			
//			break;
//			
//		}

	// }

//	public WebDriver setup() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.get("https://crowdfunding-frontend-delta.vercel.app");
//		return driver;
//	}

	@AfterMethod
	public void tearDown() {
		if (driver != null) {
			//driver.quit();
		}
	}
}