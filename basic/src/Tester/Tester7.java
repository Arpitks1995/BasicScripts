package Tester;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester7 extends Basicsettings {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String expectedURL="https://demo.actitime.com/login.do";
		String actualURL=driver.getCurrentUrl();
		if(actualURL.equals(expectedURL)) {
			System.out.println("Test Case Passed");
		}
		else {
			System.out.println("Test case failed");
		}
		Thread.sleep(2000);
		driver.close();
		
	}

}
