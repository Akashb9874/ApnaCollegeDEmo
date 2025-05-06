package Day13_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnDemo {

	@Test(priority = 1)
	public void login() {
		System.out.println("I am in login method");
		Assert.assertTrue(false);
	}

	@Test(priority = 2, dependsOnMethods = "login")
	public void newsFeed() {
		System.out.println("I am in newsFeed method");
	}

	@Test(priority = 3, dependsOnMethods = "login")
	public void logout() {
		System.out.println("I am in logout method");
	}

}
