package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tester8 {

	@Test()
	public void login() {
		Reporter.log("This is Login",true);
	}
	@Test(dependsOnMethods= {"login"})
	public void createUser() {
		Reporter.log("Create the User",true);
	}
	@Test(dependsOnMethods= {"login"})
	public void deleteUser() {
		Reporter.log("Delete the User",true);
	}
}
