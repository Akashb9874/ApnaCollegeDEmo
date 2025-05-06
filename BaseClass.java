package Day13_Listener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public static WebDriver driver;

	@BeforeClass
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\FChromeDriver\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("file:///C:/Selenium/OfflineWebsiteForSelenium/OfflineWebsite/index.html");

	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
