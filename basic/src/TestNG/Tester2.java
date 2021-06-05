package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tester2 {
	
	@Test(priority=2)
	public void Animal() {
		Reporter.log("This is the Animal method",true);
	}
	
	@Test(priority=3)
	public void Bird() {
		Reporter.log("This is the Bird method",true);
	}
	
	@Test(priority = 1)
	public void lion() {
		Reporter.log("This is the lion method",true);
	}
	
	@Test(priority=-1)
	public void animal() {
		Reporter.log("This is the animal method",true);
	}
	

}
