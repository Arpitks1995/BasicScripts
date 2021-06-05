package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tester10 {
@BeforeMethod(alwaysRun=true)
public void  login() {
	Reporter.log("Always login in Application",true);
}

@AfterMethod(alwaysRun=true)
public void  logout() {
	Reporter.log("Always logout in Application",true);
}


@Test(groups= {"smoke","regression"})
public void createUser() {
	Reporter.log("Create the User",true);
}

@Test(groups= {"smoke"})
public void deleteUser() {
	Reporter.log("Create the delete the user",true);
}

@Test(groups= {"regression"})
public void dog() {
	Reporter.log("Create the dog",true);
}

@Test(groups= {"regression"})
public void cat() {
	Reporter.log("Create the cat",true);
}



}
