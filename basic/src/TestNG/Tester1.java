package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tester1 {
	
	@Test
	public void m1() {
		Reporter.log("This is m1 Method",true);
	}
	

}
