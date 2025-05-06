package Day13_Assertions;

import org.testng.annotations.Test;

public class GroupByDemo {

	@Test(groups = { "smoke" })
	public void tc1() {
		System.out.println("Hi i am in tc1");
	}

	@Test(groups = { "sanity" })
	public void tc2() {
		System.out.println("Hi i am in tc2");
	}

	@Test(groups = { "regression" })
	public void tc3() {
		System.out.println("Hi i am in tc3");
	}

	@Test(groups = { "smoke", "regression" })
	public void tc4() {
		System.out.println("Hi i am in tc4");
	}

	@Test(groups = { "sanity", "regression" })
	public void tc5() {
		System.out.println("Hi i am in tc5");
	}

	@Test(groups = { "smoke", "sanity", "regression" })
	public void tc6() {
		System.out.println("Hi i am in tc6");
	}

}
