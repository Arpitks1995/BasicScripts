package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tester6 {
@Test(priority=4)
public void Animal() {
	Reporter.log("This is Animal Method",true);
}
@Test(invocationCount=2,priority=2)
public void lion() {
	Reporter.log("This is Lion Method",true);
}
@Test(priority=3)
public void animal() {
	Reporter.log("This is animal Method",true);
}
@Test(priority=-1)
public void Bird() {
	Reporter.log("This is Bird Method",true);
}



}
