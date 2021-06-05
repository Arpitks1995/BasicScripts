package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CursorTest {

	public static void main(String[] args) {
	    System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://demo.actitime.com/login.do");
	    String expectedCursorvalue="pointer";
	   String actualCursorvalue = driver.findElement(By.id("loginButton")).getCssValue("cursor");
	   if (actualCursorvalue.equals(expectedCursorvalue)) {
		   System.out.println("Test Case is Passed");
		   System.out.println(actualCursorvalue);
		
	}else {
		System.out.println("Test Case is failed");
	}
	   
	   
	    driver.close();

	}

}
