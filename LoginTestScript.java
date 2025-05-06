package Day13_Listener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestScript extends BaseClass {

	@Test
	public void verifyLogin() throws InterruptedException {

		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("kiran@gmail.com");

		WebElement password = driver.findElement(By.cssSelector("input.form-control[placeholder='Password']"));

		password.sendKeys("123456");

		WebElement signInButton = driver.findElement(By.cssSelector(".btn"));

		signInButton.click();

		Thread.sleep(5000);

		Assert.assertEquals(driver.getCurrentUrl(),
				"file:///C:/Selenium/OOfflineWebsiteForSelenium/OfflineWebsite/pages/examples/dashboard.html");

		System.out.println("Hi");

	}

}
