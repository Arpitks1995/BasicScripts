package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fontWeightTest {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    driver.get("https://demo.actitime.com/login.do");
		    String expectedFontWeight="400";
		    String actualFontWeight=driver.findElement(By.linkText("Forgot your password?")).getCssValue("font-weight");
		    if (actualFontWeight.equals(expectedFontWeight)) {
		    	System.out.println("Test Case is Passed");
		    	 System.out.println(actualFontWeight);
				
			}else {
				System.out.println("Test case is failed");
			}
		   driver.close();

	}

}
