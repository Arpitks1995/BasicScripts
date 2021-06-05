package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tester3 {
	@Test(priority=1)
	public void Animal() {
		Reporter.log("This is the Animal Method");
	}
	
	@Test
	public void Arpit() {
		Reporter.log("This is the Arpit Raghuvanshi Method");
	}

}
