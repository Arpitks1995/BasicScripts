package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttributeTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		String expectedTooltip="cursor: default;";
		String actualTooltip = driver.findElement(By.xpath("//label[@id=\"keepLoggedInLabel\"]")).getAttribute("style");
		if (actualTooltip!=null) {
		if (actualTooltip.equals(expectedTooltip)) {
			System.out.println("Tooltip is displayed Correctly");
			
		}else {
			System.out.println("Tooltip is not displayed Correctly");
			
		}

	}
		else {
		System.out.println("Attribute is not present");
	}
		driver.quit();

}
}
	
	
