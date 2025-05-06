package Day13_Assertions;

import org.testng.annotations.Test;

public class EnableDemo {

	@Test
	public void login() {
		System.out.println("I am in login method");
	}

	@Test(enabled = false)
	public void search() {
		System.out.println("I am in search method");
	}

	@Test
	public void logout() {
		System.out.println("I am in logout method");
	}

}
