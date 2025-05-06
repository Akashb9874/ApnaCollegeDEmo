package Day13_Assertions;

import org.testng.annotations.Test;

public class ClassTwo {
	
	@Test
	public void tc2() throws InterruptedException {
		System.out.println("I am in tc2");
		Thread.sleep(5000);
	}

}
