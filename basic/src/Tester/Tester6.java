package Tester;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester6 extends Basicsettings {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String expectedTitle="Please identify yourself";
		String actualTitle=driver.getTitle();
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Test Case Passed");
		}else {
			System.out.println("Test case Failed");
		}
		Thread.sleep(4000);
		driver.close();
		
	}

}
