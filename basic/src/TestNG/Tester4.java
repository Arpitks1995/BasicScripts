package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tester4 {

	@Test
	public void Animal() {
		Reporter.log("This is the Animal Method");
	}
	@Test(invocationCount=5)
	public void lion() {
		Reporter.log("This is the lion method");
	}
	
	@Test(priority=1)
	public void animal() {
		Reporter.log("This is the animal method");
	}
	
	@Test(priority=2)
	public void Bird() {
		Reporter.log("This is the Bird method");
	}
}
