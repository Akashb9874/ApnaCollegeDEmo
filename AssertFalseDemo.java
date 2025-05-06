package Day13_Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFalseDemo {

	@Test
	public void verifyLoginPage() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\FChromeDriver\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("file:///C:/Selenium/OfflineWebsiteForSelenium/OfflineWebsite/pages/examples/add_user.html");

		WebElement maleRadioButton = driver.findElement(By.xpath("//input[@id='Male']"));

		Assert.assertFalse(maleRadioButton.isSelected());

		Thread.sleep(3000);

		System.out.println("Hi");

		driver.close();
	}

}
