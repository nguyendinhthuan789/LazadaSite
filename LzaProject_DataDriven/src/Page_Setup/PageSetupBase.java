package Page_Setup;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class PageSetupBase {
	protected WebDriver driver;
	static String driverPathChrome = "D:\\Selenium\\";
	static String driverPathFirefox = "D:\\Selenium\\";
	static String driverPathExplorer = "D:\\Selenium\\";

	public WebDriver getDriver(WebDriver driver) {
		PageFactory.initElements(driver, this);
		return driver;
	}

	private void setDriver(String browserType, String appURL) throws IOException {
		switch (browserType) {
		case "chrome":
			driver = initChromeDriver(appURL);
			break;
		case "firefox":
			driver = initFirefoxDriver(appURL);
			break;
		case "explorer":
			driver = initExplorerDriver(appURL);
			break;
		default:
			System.out.println("browser : " + browserType + " is invalid, Launching Firefox as browser of choice..");
			driver = initChromeDriver(appURL);
		}
	}

	private static WebDriver initChromeDriver(String appURL) {
		System.out.println("Launching google chrome with new profile..");
		System.setProperty("webdriver.chrome.driver", driverPathChrome + "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.navigate().to(appURL);
		return driver;
	}

	private static WebDriver initFirefoxDriver(String appURL) throws IOException {
		System.out.println("Launching Firefox browser..");
		System.setProperty("webdriver.gecko.marionette", driverPathFirefox + "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().setSize(new Dimension(1366, 768));
		driver.get(appURL);
 		return driver;
	}
	
	private static WebDriver initExplorerDriver(String appURL) throws IOException {
		System.out.println("Launching Explorer browser..");
		System.setProperty("webdriver.ie.driver", driverPathExplorer + "IEDriverServer.exe");
		DesiredCapabilities capabilitiesIE = DesiredCapabilities.internetExplorer();
		capabilitiesIE.setCapability(
		InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to(appURL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 		return driver;	
	}

	@Parameters({ "browserType", "appURL" })
	@BeforeClass
	public void initializeTestBaseSetup(String browserType, String appURL) {
		try {
			setDriver(browserType, appURL);

		} catch (Exception e) {
			System.out.println("Error....." + e.toString());
		}
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
