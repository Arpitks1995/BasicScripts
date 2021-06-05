package Tester;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester10 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Set<String> windows=driver.getWindowHandles();
		
		for(String window: windows) {
			driver.switchTo().window(window);
			System.out.println(driver.getTitle());
		}
		driver.quit();
	}

}
