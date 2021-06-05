package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class GetCSSValueTest {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.get("https://demo.actitime.com/login.do");
    String colorValue = driver.findElement(By.xpath("//td[text()=\"Please identify yourself\"]")).getCssValue("color");
    String expectedHexacode="#2f5474";
    String actualHexacode = Color.fromString(colorValue).asHex();
    if (actualHexacode.equals(expectedHexacode)) {
    	System.out.println("Test Case is Pass");
    	System.out.println(Color.fromString(actualHexacode).asHex());
		
	}else {
		System.out.println("Test Case is Failed");
	}
   // System.out.println(Color.fromString(colorValue).asHex());
    
    driver.close();
	}

}
