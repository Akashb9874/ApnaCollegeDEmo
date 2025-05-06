package Day13_Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualsDemo {

	@Test
	public void verifyLoginPage() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\FChromeDriver\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("file:///C:/Selenium/OfflineWebsiteForSelenium/OfflineWebsite/index.html");

		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("kiran@gmail.com");

		WebElement password = driver.findElement(By.cssSelector("input.form-control[placeholder='Password']"));

		password.sendKeys("123456");

		WebElement signInButton = driver.findElement(By.cssSelector(".btn"));

		signInButton.click();

		Assert.assertEquals(driver.getCurrentUrl(),
				"file:///C:/Selenium/OfflineWebsiteForSelenium/OfflineWebsite/pages/examples/users.html");

		Thread.sleep(5000);

		System.out.println("Hi");

		driver.close();

	}
}
