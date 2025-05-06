package Day13_Assertions;

import org.testng.annotations.Test;

public class ClassOne {
	
	@Test
	public void tc1() throws InterruptedException {
		System.out.println("I am in tc1");
		Thread.sleep(5000);
	}

}
