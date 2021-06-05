package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tester7 {
	
	@BeforeSuite
	public void m1() {
		Reporter.log("This is Beforesuite Method",true);
	}
	
	@BeforeTest
	public void m2() {
		Reporter.log("This is @BeforeTest Method",true);
	}
	
	@BeforeClass
	public void m3() {
		Reporter.log("This is @@BeforeClass Method",true);
	}
	
	@BeforeMethod
	public void m4() {
		Reporter.log("This is @@@BeforeMethod Method",true);
	}
	
	@Test()
	public void m5() {
		Reporter.log("This is @@@@Test Method",true);
	}
	
	@Test(dependsOnMethods = {"m5"})
	public void m6() {
		Reporter.log("This is @@@@2Test Method",true);
	}
	@Test
	public void m9() {
		Reporter.log("This is @@@@3Test Method",true);
	}
	
	@AfterMethod
	public void m7() {
		Reporter.log("This is AfterMethod Method",true);
	}
	
	@AfterClass
	public void m8() {
		Reporter.log("This is @AfterClass Method",true);
	}
	
	

}
