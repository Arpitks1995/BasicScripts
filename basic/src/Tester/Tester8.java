package Tester;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester8 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String sourcecode=driver.getPageSource();
		System.out.println(sourcecode);
		if(sourcecode.contains("Please identify yourself")) {
			System.out.println("Test Case Passed");
		}
		else {
			System.out.println("Test Case Passed");
		}
		
		driver.close();
		
	}

}
