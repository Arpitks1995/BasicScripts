package encapsulations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester2Main {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		Tester2 test=new Tester2(driver);
		
		test.setUsername("admin");
		test.setPassword("manager");
		test.clickOnLogin();
		
		Thread.sleep(5000);
		
		test.setUsername("admin");
		test.setPassword("manager");
		test.clickOnLogin();

	}

}
